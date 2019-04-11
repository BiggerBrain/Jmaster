package communication;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class WaitNotifyExample {
    public static void main(String args[]) {
        System.out.println("用生成者和消费者的例子来学习多线程wait and notify方法的使用");
        Queue buffer = new LinkedList();
        int maxSize = 10;
        Thread producer = new Producer(buffer, maxSize, "PRODUCER");
        Thread consumer = new Consumer(buffer, maxSize, "CONSUMER");
        producer.start(); consumer.start(); }
}


class Producer extends Thread
{
    private Queue queue;
    private int maxSize;
    public Producer(Queue queue, int maxSize, String name){
        super(name); this.queue = queue; this.maxSize = maxSize;
    }
    @Override public void run()
    {
        while (true)
        {
            synchronized (queue) {
                while (queue.size() == maxSize) {
                    try {
                        System.out .println("生产满！");
                        queue.wait();
                    } catch (Exception ex) {
                        ex.printStackTrace(); }
                }
                Random random = new Random();
                int i = random.nextInt();
                System.out.println("Producing value : " + i);
                queue.add(i);
                queue.notifyAll();
            }
        }
    }
}

class Consumer extends Thread {
    private Queue  queue;
    private int maxSize;
    public Consumer(Queue queue, int maxSize, String name){
        super(name);
        this.queue = queue;
        this.maxSize = maxSize;
    }
    @Override public void run() {
        while (true) {
            synchronized (queue) {
                while (queue.isEmpty()) {
                    System.out.println("消费完！");
                    try {
                        queue.wait();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
                System.out.println("Consuming value : " + queue.remove()); queue.notifyAll();
            }
        }
    }
}