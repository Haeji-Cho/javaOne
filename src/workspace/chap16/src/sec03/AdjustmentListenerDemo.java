package workspace.chap16.src.sec03;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;

public class AdjustmentListenerDemo extends JFrame {
	AdjustmentListenerDemo() {
		setTitle("��ũ�ѹ� ������ �����̱�");

		JLabel label = new JLabel("", JLabel.CENTER);

		JScrollBar bar = new JScrollBar(JScrollBar.HORIZONTAL);
		bar.setValues(50, 10, 0, 100);
		bar.addAdjustmentListener(e -> {
			int v = e.getValue();
			label.setText("��ġ : " + v);
		});

		add("Center", label);
		add("North", bar);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setVisible(true);
	}

	public static void main(String[] args) {
		new AdjustmentListenerDemo();
	}
}