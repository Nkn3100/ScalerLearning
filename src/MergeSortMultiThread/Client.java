package MergeSortMultiThread;

import org.w3c.dom.ls.LSOutput;

import java.util.List;
import java.util.concurrent.*;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(1,5,6,3,2,0,9,10);
        ExecutorService executorService = Executors.newCachedThreadPool();
        MergeSorter mergeSorter = new MergeSorter(list,executorService);
        Future<List<Integer>> futureSortedList = executorService.submit(mergeSorter);

        List<Integer> sortedList = futureSortedList.get();
        System.out.println("SortedList : " + sortedList);
    }

}
