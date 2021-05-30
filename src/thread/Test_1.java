package thread;

import java.util.Arrays;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.TimeUnit;

public class Test_1 {
    public static void main(String[] args) {
        Runnable b1 = () -> {
            System.out.println(1);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable b2 = () -> {
            System.out.println(2);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        Runnable b3 = () -> {
            System.out.println(3);
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("bb");
            throw new NullPointerException("异常");
        };
//        CompletableFuture<Void> c1 = CompletableFuture.runAsync(b1);
//        CompletableFuture<Void> c2 = CompletableFuture.runAsync(b2);
//        CompletableFuture<Void> c3 = CompletableFuture.runAsync(b3);

        ForkJoinPool forkJoinPool = new ForkJoinPool(3);
        try{
            Arrays.asList(forkJoinPool.submit(b1), forkJoinPool.submit(b2), forkJoinPool.submit(b3)).forEach(ForkJoinTask::join);
//            forkJoinPool.execute(b1);
//            forkJoinPool.execute(b2);
//            forkJoinPool.execute(b3);
//            boolean b = forkJoinPool.awaitQuiescence(20, TimeUnit.SECONDS);
        } finally {
            forkJoinPool.shutdown();
        }
        System.out.println("dddd");
    }


}
