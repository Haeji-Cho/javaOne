package workspace.chap13.src.challenge.one;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOTest {
	public static void main(String[] args) {
		String fileName = "D:\\temp\\file.txt";

		try {
			byte[] buf = new byte[100];

			FileInputStream fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);

			while (bis.read(buf) != -1)
				System.out.print(new String(buf));

			fis.close();
			bis.close();
		} catch (FileNotFoundException ex) {
			System.out.println(fileName + " ������ �� �� �����ϴ�.");
		} catch (IOException ex) {
			System.out.println(fileName + " ������ ���� �� �����ϴ�.");
		}
	}
}