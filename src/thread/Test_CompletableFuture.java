package thread;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;

public class Test_CompletableFuture {

    public static void main(String[] args) {
        CompletableFuture<String> task1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("开始执行任务1");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束执行任务1");
            return "task1";
        });

        CompletableFuture<String> task2 = CompletableFuture.supplyAsync(() -> {
            System.out.println("开始执行任务2");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束执行任务2");
            return "task2";
        });
        ForkJoinPool.commonPool();
        CompletableFuture<String> task3 = CompletableFuture.supplyAsync(() -> {
            System.out.println("开始执行任务3");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("结束执行任务3");
            return "task3";
        });

        String join = task1.join();
        String join1 = task2.join();
        String join2 = task3.join();

        System.out.println(join + join1 + join2 + "执行完成");


    }
}
