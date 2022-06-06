package workspace.chap16.src.sec01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class HelloEventDemo extends JFrame {
	HelloEventDemo() {
		setTitle("�̺�Ʈ ������");

		ActionListener l = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("��ư�� Ŭ���߽��ϴ�.");
			}
		};

		JButton b = new JButton("Ŭ��");
		b.addActionListener(l);

		add(b);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(260, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new HelloEventDemo();
	}
}