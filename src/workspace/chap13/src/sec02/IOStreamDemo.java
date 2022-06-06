package workspace.chap13.src.sec02;

import java.io.IOException;

public class IOStreamDemo {
    public static void main(String[] args) throws IOException {
        int b, len= 0;
        int ba[] = new int[100];
        System.out.println("--- �Է� ��Ʈ�� ---");
        while((b= System.in.read()) != '\n') {
            System.out.printf("%c(%d)", (char) b, b);
            ba[len++] = b;
        }
        System.out.println("\n\n--- ��� ��Ʈ�� ---");
        for(int i= 0; i< len; i++)
            System.out.write(ba[i]);
        System.out.flush();  // System.out.close();
    }
}
