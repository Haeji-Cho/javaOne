package workspace.chap13.src.sec04;

import java.io.File;
import java.nio.file.Files;

public class Files1Demo {
    public static void main(String[] args) throws Exception {
        File f1 = new File("D:\\Temp\\org.txt");
        File f2 = new File("D:\\Temp");

        System.out.println("org.txt�� ����? " + Files.isDirectory(f1.toPath()));

        System.out.println("Temp�� ����? " + Files.isDirectory(f2.toPath()));

        System.out.println("org.txt�� ���� �� �ִ� ����? " + Files.isReadable(f1.toPath()));

        System.out.println("org.txt�� ũ��? " + Files.size(f1.toPath()));
    }
}