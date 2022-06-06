package workspace.chap11.src.sec02;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSet1Demo {
	public static void main(String[] args) {
		String[] fruits = { "���", "�ٳ���", "����", "����" };
		Set<String> h1 = new HashSet<>();
		Set<String> h2 = new HashSet<>();

		for (String s : fruits)
			h1.add(s);

		System.out.println("1�ܰ� : " + h1);
		h1.add("�ٳ���");
		h1.remove("����");
		h1.add(null);

		System.out.println("2�ܰ� : " + h1);
		System.out.println(h1.size());
		System.out.println(h1.contains("����"));

		List<String> list = Arrays.asList(fruits);
		h2.addAll(list);
		System.out.println("3�ܰ� : " + h2);
		h2.clear();
		System.out.println(h2.isEmpty());
	}
}