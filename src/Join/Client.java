package Join;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        HelloWordPrinter hwp = new HelloWordPrinter();
        HelloWorldPrinterWithWait hwpWithWait = new HelloWorldPrinterWithWait();
        Thread t1 = new Thread(hwpWithWait);
        Thread t2 = new Thread(hwp);
        t1.start();
        t2.start();
        t2.join();
        System.out.println("Hello from main class");
    }
}
