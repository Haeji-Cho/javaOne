package workspace.chap13.src.challenge.three;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;

public class IOTest {
	public static void main(String[] args) {
		String fileName = "D:\\temp\\file.txt";

		try {
			Files.lines(new File(fileName).toPath()).forEach(l -> System.out.println(l));
		} catch (FileNotFoundException ex) {
			System.out.println(fileName + " ������ �� �� �����ϴ�.");
		} catch (IOException ex) {
			System.out.println(fileName + " ������ ���� �� �����ϴ�.");
		}
	}
}
