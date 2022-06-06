package workspace.chap14.src.sec02;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.print("�߰�. ");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        };
        ExecutorService exec = Executors.newFixedThreadPool(4);
        exec.submit(task);

        for (int i = 0; i < 5; i++) {
            System.out.print("�ȳ�. ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        exec.shutdown();
    }
}