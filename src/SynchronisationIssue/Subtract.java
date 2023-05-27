package SynchronisationIssue;

public class Subtract implements Runnable{
    private Count count;

    public Subtract(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int j = 1; j <= 100000; j++){
            count.val = count.val - j ;
        }
    }
}
