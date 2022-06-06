package workspace.chap18.src.sec03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Echo2Server extends Thread {
    protected static boolean cont = true;
    protected Socket connection = null;

    public static void main(String[] args) throws IOException {
        ServerSocket server = null;

        server = new ServerSocket(5000);
        System.out.println("���� ���� ����");

        while (cont) {
            System.out.println("���� ��� ��.....");
            new Echo2Server(server.accept());
        }
        server.close();
    }

    private Echo2Server(Socket clientSocket) {
        connection = clientSocket;
        start();
    }

    public void run() {
        BufferedReader in;

        System.out.println("Ŭ���̾�Ʈ�� ����� ���� ���ο� ������ ����");
        try {
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String msg;

            while ((msg = in.readLine()) != null) {
                System.out.println("���� �޽��� �޾Ƹ� : " + msg);
            }

            in.close();
            connection.close();
        } catch (IOException e) {
        }
    }
}