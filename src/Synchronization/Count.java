package Synchronization;

public class Count {
    private int value = 0;
    public synchronized void increment(){
//        synchronized (this){
//            value++;
//        }
        value++;
    }
    public int getValue(){
        return value;
    }

}
