package Join;

public class HelloWordPrinter implements Runnable{
    @Override
    public void run() {
        HelloWorldPrinterWithWait hwpWithWait = new HelloWorldPrinterWithWait();
        Thread t3 = new Thread(hwpWithWait);
        t3.run();
        System.out.println("Current thread : " + Thread.currentThread().getName());
        System.out.println("Hello from HelloWorldPrinter class");

    }
}
