package workspace.chap16.src.challenge.one;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CounterTest extends JFrame {
	private int count = 0;
	private JLabel label;
	private JButton b1;

	CounterTest() {
		setTitle("ī����");

		JPanel p1 = new JPanel();
		label = new JLabel("���� = 0");
		p1.add(label);
		add("Center", p1);

		JPanel p2 = new JPanel();
		b1 = new JButton("����");
		b1.addActionListener(e -> {
			count++;
			label.setText("���� = " + count);
		});
		p2.add(b1);
		add("South", p2);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 120);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CounterTest();
	}
}