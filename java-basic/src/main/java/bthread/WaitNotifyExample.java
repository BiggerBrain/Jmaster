package bthread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

import lombok.extern.log4j.Log4j2;
@Log4j2
public class WaitNotifyExample {
    public static void main(String args[]) {
        log.info("用生成者和消费者的例子来学习多线程wait and notify方法的使用");
        Queue buffer = new LinkedList();
        int maxSize = 10;
        Thread producer = new Producer(buffer, maxSize, "PRODUCER");
        Thread consumer = new Consumer(buffer, maxSize, "CONSUMER");
        producer.start();
        consumer.start();
    }
}

@Log4j2
class Producer extends Thread {
    private Queue queue;
    private int maxSize;

    public Producer(Queue queue, int maxSize, String name) {
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.size() == maxSize) {
                    try {
                        log.info("生产满！");
                        queue.wait();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                Random random = new Random();
                int i = random.nextInt();
                log.info("Producing value : " + i);
                queue.add(i);
                queue.notifyAll();
            }
        }
    }
}
@Log4j2
class Consumer extends Thread {
    private Queue queue;
    private int maxSize;

    public Consumer(Queue queue, int maxSize, String name) {
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    log.info("消费完！");
                    try {
                        queue.wait();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                log.info("Consuming value : " + queue.remove());
                queue.notifyAll();
            }
        }
    }
}