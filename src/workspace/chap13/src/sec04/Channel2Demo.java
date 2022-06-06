package workspace.chap13.src.sec04;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Channel2Demo {
    public static void main(String[] args) throws IOException {
        Path p = Paths.get("D:\\Temp\\data.txt");

        FileChannel fc = FileChannel.open(p,
                StandardOpenOption.READ,
                StandardOpenOption.CREATE,
                StandardOpenOption.WRITE);

        ByteBuffer buf = ByteBuffer.allocate(1024);
        String s = "��������.\nBirds of a feather flock together.\n" +
                "�ð��� ���̴�.\nTime is money.";

        buf.put(s.getBytes());

        buf.flip();

        int count = fc.write(buf);

        System.out.println("D:\\Temp\\file.txt�� " + count + "����Ʈ ���");

        buf.clear();

        fc.read(buf);
        System.out.println(new String(buf.array()));

        fc.close();
    }
}
