package workspace.chap15.src.sec04;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {
	BorderLayoutDemo() {
		setTitle("���� ���̾ƿ�!");
		setLayout(new BorderLayout());

		add("East", new JButton("��"));
		add("West", new JButton("��"));
		add("South", new JButton("��"));
		add(new JButton("��"), BorderLayout.NORTH);
		add(new JButton("�߾�"), BorderLayout.CENTER);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 110);
		setVisible(true);
	}

	public static void main(String[] args) {
		new BorderLayoutDemo();
	}
}