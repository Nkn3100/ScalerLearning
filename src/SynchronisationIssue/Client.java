package SynchronisationIssue;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Adder adder = new Adder(count);
        Subtract subtract = new Subtract(count);
        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtract);
        t1.start();
        t2.start();
        t1.join();
        System.out.println("Value : " + count.val);

    }
}
