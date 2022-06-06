package workspace.chap14.src.challenge.three;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest {
    public static void main(String args[]) {
        int alphabet = 'a';
        ExecutorService exec = Executors.newCachedThreadPool();
        Runnable task = () -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("�۾� ������ : " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
            exec.shutdown();
        };

        exec.submit(task);

        try {
            while (!exec.isShutdown()) {
                System.out.println("���� ������ : " + (char) alphabet++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
        }
    }
}