package thread;

import java.util.concurrent.CountDownLatch;

public class TestCountDownLatch {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(1);
        Runnable r1 = () -> {
            latch.countDown();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("r1执行结束");
        };

        Thread t = new Thread(r1);
        t.start();
        latch.await();


    }
}
