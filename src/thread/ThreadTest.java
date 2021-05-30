package thread;

import lombok.SneakyThrows;

public class ThreadTest {
    private static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        new ThreadA().start();
        new ThreadB().start();
        System.out.println("执行了，哈哈哈");
    }

    static class ThreadA extends Thread {
        @Override
        public void run() {
            synchronized (lock) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < 1; i++) {
                    System.out.println("Thread A " + i);
                }
            }
        }
    }

    static class ThreadB extends Thread {
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 1; i++) {
                    System.out.println("Thread B " + i);
                }
                lock.notify();
            }
        }
    }
}
