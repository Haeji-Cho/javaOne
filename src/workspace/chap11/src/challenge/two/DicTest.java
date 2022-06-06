package workspace.chap11.src.challenge.two;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DicTest {
	public static void main(String[] args) {
		Map<String, String> dic = new HashMap<>();

		dic.put("cat", "������");
		dic.put("head", "�밡����");
		dic.put("aunt", "������");
		dic.put("noodle", "����");
		dic.put("teacher", "��");
		dic.put("child", "���");

		Iterator<String> keys = dic.values().iterator();
		for (String key : dic.keySet())
			System.out.printf("%s=%s  ", key, dic.get(key));
	}
}