package workspace.chap18.src.sec03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Echo1Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = null;
        Socket connection = null;
        BufferedReader in = null;

        try {
            server = new ServerSocket(5000);
        } catch (IOException e) {
        }

        System.out.println("���� ��� ��.....");

        try {
            connection = server.accept();
        } catch (IOException e) {
        }

        System.out.println("�޽����� ��ٸ��� ��.....");

        in = new BufferedReader(new InputStreamReader(connection.getInputStream()));

        String msg;

        while ((msg = in.readLine()) != null) {
            if (msg.contains("��"))
                break;
            System.out.println("���� �޽��� �޾Ƹ� : " + msg);
        }

        System.out.println("���� ����");
        in.close();
        connection.close();
        server.close();
    }
}