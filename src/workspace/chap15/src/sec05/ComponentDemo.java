package workspace.chap15.src.sec05;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ComponentDemo extends JFrame {
	ComponentDemo() {
		setTitle("�� ���� ���ϱ�");

		setLayout(new BorderLayout(10, 10));
		showNorth();
		showCenter();
		showSouth();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 220);
		setVisible(true);
	}

	void showNorth() {
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel panel = new JPanel(new GridLayout(2, 0));

		JLabel l1 = new JLabel("���� ������");
		JLabel l2 = new JLabel("���� ����");

		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		t2.setEnabled(false);

		p1.add(l1);
		p1.add(t1);
		p2.add(l2);
		p2.add(t2);
		panel.add(p1);
		panel.add(p2);

		add(panel, BorderLayout.NORTH);
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

	void showSouth() {
		String[] color = { "red", "blue" };

		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));

		JButton cal = new JButton("���");
		JComboBox<String> cb = new JComboBox<>(color);
		JButton reset = new JButton("����");

		panel.add(cal);
		panel.add(cb);
		panel.add(reset);

		add(panel, BorderLayout.SOUTH);
	}

	public static void main(String[] args) {
		new ComponentDemo();
	}
}