package workspace.chap15.src.sec04;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CardLayoutDemo extends JFrame {
	CardLayout layout;

	public void rotate() {
		while (true) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
			layout.next(this.getContentPane());
		}
	}

	CardLayoutDemo() {
		setTitle("ī�� �����̿�!");
		layout = new CardLayout();
		setLayout(layout);

		add("0", new JButton("��ư 0"));
		add("1", new JButton("��ư 1"));
		add("2", new JButton("��ư 2"));

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 110);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CardLayoutDemo().rotate();
	}
}