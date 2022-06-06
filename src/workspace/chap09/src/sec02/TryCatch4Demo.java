package workspace.chap09.src.sec02;

public class TryCatch4Demo {
    public static void main(String[] args) {
        Reso reso = new Reso();

        try (reso) {
            reso.show();
        } catch (Exception e) {
            System.out.println("���� ó��");
        }
    }
}

class Reso implements AutoCloseable {
    void show() {
        System.out.println("�ڿ� ���");
    }

    public void close() throws Exception {
        System.out.println("�ڿ� �ݱ�");
    }
}
