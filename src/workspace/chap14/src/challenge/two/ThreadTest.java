package workspace.chap14.src.challenge.two;

public class ThreadTest {
    public static void main(String args[]) {
        int alphabet = 'a';
        Thread worker = new Thread(() -> {
            try {
                for (int i = 0; i < 5; i++) {
                    System.out.println("�۾� ������ : " + i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
        });
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