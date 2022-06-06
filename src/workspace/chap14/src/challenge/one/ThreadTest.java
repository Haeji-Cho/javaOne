package workspace.chap14.src.challenge.one;

class Worker extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("�۾� ������ : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
        }
    }
}

public class ThreadTest {
    public static void main(String args[]) {
        int alphabet = 'a';
        Worker worker = new Worker();
        worker.start();
        try {
            while (worker.isAlive()) {
                System.out.println("���� ������ : " + (char) alphabet++);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
        }
    }
}