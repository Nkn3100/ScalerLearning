package Semaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Consumer implements Runnable{
    private Queue<Shirt> store;
    private int maxSizeOfStore;
    private String name;
    private Semaphore semaForConsumer;
    private Semaphore semaForProducer;

    public Consumer(Queue<Shirt> store, int maxSizeOfStore, String name,Semaphore semaForProducer,Semaphore semaForConsumer) {
        this.store = store;
        this.maxSizeOfStore = maxSizeOfStore;
        this.name = name;
        this.semaForConsumer = semaForConsumer;
        this.semaForProducer = semaForProducer;
    }

    @Override
    public void run() {
        while(true){
            try {
                semaForConsumer.acquire();
                store.remove(new Shirt());
                System.out.println(name + " : bought. Total shirt available : " + store.size());
                semaForProducer.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
