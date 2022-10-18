/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;
import java.util.Set;

/**
 * @author lishixiong
 * @version $Id: Server.java, v 0.1 2022-08-31 20:43 lishixiong Exp $$
 */
public class Server {

    private final ByteBuffer readBuffer = ByteBuffer.allocate(1024);//调整缓存的大小可以看到打印输出的变化
    private final ByteBuffer sendBuffer = ByteBuffer.allocate(1024);//调整缓存的大小可以看到打印输出的变化
    String str;
    /**
     * 选择器，能够检测一到多个NIO通道
     */
    private Selector selector;

    public static void main(String[] args) throws IOException {
        System.out.println("server started...");
        new Server().start();

    }

    public void start() throws IOException {
        //1. 通过open()方法找到并打开Selector
        selector = Selector.open();
        //创建成功后
        System.out.println("selector isOpen:" + selector.isOpen());

        //2.打开服务器套接字通道
        ServerSocketChannel ssc = ServerSocketChannel.open();
        // 服务器配置为非阻塞
        ssc.configureBlocking(false);
        // 进行服务的绑定
        ssc.bind(new InetSocketAddress("localhost", 8001));

        //3.ssc注册到selector，等待连接
        ssc.register(selector, SelectionKey.OP_ACCEPT);

        while (!Thread.currentThread().isInterrupted()) {
            selector.select();
            Set<SelectionKey> keys = selector.selectedKeys();
            Iterator<SelectionKey> keyIterator = keys.iterator();
            while (keyIterator.hasNext()) {
                SelectionKey key = keyIterator.next();
                System.out.println("selector selectKey:" + key.toString());
                if (!key.isValid()) {
                    continue;
                }
                if (key.isAcceptable()) {
                    accept(key);
                } else if (key.isReadable()) {
                    read(key);
                } else if (key.isWritable()) {
                    write(key);
                }
                keyIterator.remove(); //该事件已经处理，可以丢弃
            }
        }
    }

    private void write(SelectionKey key) throws IOException {
        SocketChannel channel = (SocketChannel) key.channel();
        System.out.println("write:" + str);

        sendBuffer.clear();
        sendBuffer.put(str.getBytes());
        sendBuffer.flip();
        channel.write(sendBuffer);
        channel.register(selector, SelectionKey.OP_READ);
    }

    private void read(SelectionKey key) throws IOException {
        SocketChannel socketChannel = (SocketChannel) key.channel();

        // Clear out our read buffer so it's ready for new data
        this.readBuffer.clear();
//        readBuffer.flip();
        // Attempt to read off the channel
        int numRead;
        try {
            numRead = socketChannel.read(this.readBuffer);
        } catch (IOException e) {
            // The remote forcibly closed the connection, cancel
            // the selection key and close the channel.
            key.cancel();
            socketChannel.close();

            return;
        }

        str = new String(readBuffer.array(), 0, numRead);
        System.out.println("read from :" + str);
        socketChannel.register(selector, SelectionKey.OP_WRITE);
    }

    private void accept(SelectionKey key) throws IOException {
        System.out.println("acceptable key:" + key);
        ServerSocketChannel ssc = (ServerSocketChannel) key.channel();
        SocketChannel clientChannel = ssc.accept();
        clientChannel.configureBlocking(false);
        //获取连接的channel，注册感兴趣的事件read
        clientChannel.register(selector, SelectionKey.OP_READ);
        System.out.println("a new client connected " + clientChannel.getRemoteAddress() + ":" + key);
    }

}