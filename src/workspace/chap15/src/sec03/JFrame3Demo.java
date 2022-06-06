package workspace.chap15.src.sec03;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrame3Demo extends JFrame {
	JFrame3Demo() {
		setTitle("�ȳ�, ����!");

		JButton b = new JButton("��ư");
		add(b);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFrame3Demo();
	}
}