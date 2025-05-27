import java.util.concurrent.*;
import java.util.*;

public class CallableExecutorDemo {
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Create a list to hold Future objects
        List<Future<String>> results = new ArrayList<>();

        // Submit 5 Callable tasks
        for (int i = 1; i <= 5; i++) {
            int taskId = i;
            Callable<String> task = () -> {
                return "Task " + taskId + " executed by " + Thread.currentThread().getName();
            };
            Future<String> future = executor.submit(task);
            results.add(future);
        }

        
        for (Future<String> future : results) {
            try {
                System.out.println(future.get());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        
        executor.shutdown();
    }
}
