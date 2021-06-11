package thread;

import lombok.SneakyThrows;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;

public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("r1执行了");
        };
        Runnable r2 = () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("r2执行了");
        };
        Runnable r3 = () -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("r3执行了");
        };
        ForkJoinPool forkJoinPool = new ForkJoinPool(1);
//        forkJoinPool.execute(r1);
        ForkJoinTask<?> s2 = forkJoinPool.submit(r1);
        s2.fork();
//        Thread t1 = new Thread(r1);
//        Thread t2 = new Thread(r2);
//        Thread t3 = new Thread(r3);
//        System.out.println(Thread.currentThread());
//        t1.start();
//        t2.start();
//        t3.start();
//        t1.join();
//        t2.join();
//        t3.join();
        System.out.println("hello world");
    }
}
