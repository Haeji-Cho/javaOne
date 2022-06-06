package workspace.chap18.src.sec03;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) throws IOException {
        Socket client = null;
        PrintWriter out = null;

        try {
            client = new Socket();
            System.out.println("���� ������ ���� �õ�.....");
            client.connect(new InetSocketAddress("localhost", 5000), 3000);
            System.out.println("���� ������ ���� ����.....");
        } catch (Exception e) {
        }

        out = new PrintWriter(client.getOutputStream(), true);

        Scanner in = new Scanner(System.in);
        String msg;

        System.out.print("���� �޽����� �ֳ���? ");
        while ((msg = in.nextLine()) != null) {
            if (msg.contains("��"))
                break;
            out.println(msg);
            System.out.print("���� �޽����� �� �ֳ���? ");
        }

        System.out.println("Ŭ���̾�Ʈ ����");
        out.close();
        in.close();
        client.close();
    }
}