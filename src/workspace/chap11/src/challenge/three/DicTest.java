package workspace.chap11.src.challenge.three;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
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
		
		dic.forEach((x, y) -> System.out.print(x + "=" + y + "  "));
		System.out.println();

		Collection<String> collection1 = dic.values();
		List<String> list = new ArrayList<>(collection1);	// Collection Ÿ���� List Ÿ������ ��ȯ
		Collections.shuffle(list);							// List ��ü�� ���� ����
		list.forEach(x -> System.out.print(x + "  "));
	}
}