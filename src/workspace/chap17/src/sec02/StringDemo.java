package workspace.chap17.src.sec02;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class StringDemo extends JFrame {
	class MyPanel extends JPanel {
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.drawString("���ڿ��� �׷� ����!", 20, 20);
			g.drawString("�ʸ� �׸���? ���� �׷� ����!", 50, 50);
		}
	}

	StringDemo() {
		setTitle("���ڿ� �׸���");

		add(new MyPanel());

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new StringDemo();
	}
}