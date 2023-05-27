package Mutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Count {
    private int value = 0;
    private final Lock lock;

    public Count() {
        lock = new ReentrantLock();
    }

    public void increment(){
        lock.lock();
        value++;
        lock.unlock();
    }
    public int getValue(){
        return value;
    }

}
