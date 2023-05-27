package Join;

public class HelloWorldPrinterWithWait implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Current thread: " + Thread.currentThread().getName());
        System.out.println("hello from helloWorldPrinterWithWait");
    }
}
