package threadDocument;

import java.util.concurrent.*;

public class SingleThreadExample {


    /*
    * Callable结合submit应用案例，有返回值
    * */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> "异步....");
        System.out.println(future.get());
    }

}
