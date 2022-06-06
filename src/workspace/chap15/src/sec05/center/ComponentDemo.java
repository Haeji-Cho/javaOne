package workspace.chap15.src.sec05.center;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ComponentDemo extends JFrame {
	ComponentDemo() {
		setTitle("�� ���� ���ϱ�");

		setLayout(new BorderLayout(10, 10));
		showCenter();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}

	void showCenter() {
		JPanel panel = new JPanel();

		JTextArea area = new JTextArea(30, 20);
		area.setText("�� ������ ���� ���̸�\n����ϴ� ������ ��Ÿ���ϴ�.");
		area.setEditable(false);
		area.setForeground(Color.RED);

		panel.add(area);

		add(panel, BorderLayout.CENTER);
	}

	public static void main(String[] args) {
		new ComponentDemo();
	}
}