package workspace.chap15.src.sec03;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrame4Demo extends JFrame {
	JFrame4Demo() {
		setTitle("�ȳ�, ����!");

		JPanel p = new JPanel();
		JLabel l = new JLabel("�ȳ�, ����!");
		JButton b = new JButton("��ư");
		p.add(l);
		p.add(b);
		add(p);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		// pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		new JFrame4Demo();
	}
}