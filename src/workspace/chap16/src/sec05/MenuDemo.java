package workspace.chap16.src.sec05;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

public class MenuDemo extends JFrame implements ActionListener {
    MenuDemo() {
        setTitle("�޴� �����ϱ�");
        makeMenu();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 170);
        setVisible(true);
    }

    void makeMenu() {
        JMenuItem item;
        KeyStroke key;

        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("����");
        m1.setMnemonic(KeyEvent.VK_F);
        JMenu m2 = new JMenu("����");
        m2.setMnemonic(KeyEvent.VK_C);

        item = new JMenuItem("�� ����", KeyEvent.VK_N);
        item.addActionListener(this);
        m1.add(item);
        item = new JMenuItem("���� ����", KeyEvent.VK_O);
        item.addActionListener(this);
        m1.add(item);
        m1.add(new JMenuItem("���� ����"));
        m1.addSeparator();
        m1.add(new JMenuItem("����"));

        item = new JMenuItem("�Ķ���");
        key = KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK);
        item.setAccelerator(key);
        item.addActionListener(this);
        m2.add(item);
        item = new JMenuItem("������");
        key = KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK);
        item.setAccelerator(key);
        item.addActionListener(this);
        m2.add(item);
        item = new JMenuItem("�����");
        key = KeyStroke.getKeyStroke(KeyEvent.VK_Y, ActionEvent.CTRL_MASK);
        item.setAccelerator(key);
        item.addActionListener(this);
        m2.add(item);
        mb.add(m1);
        mb.add(m2);
        setJMenuBar(mb);
    }

    public static void main(String[] args) {
        new MenuDemo();
    }

    public void actionPerformed(ActionEvent e) {
        JMenuItem mi = (JMenuItem) (e.getSource());

        switch (mi.getText()) {
            case "�� ����" -> System.out.println("�� ����");
            case "���� ����" -> System.out.println("���� ����");
            case "�Ķ���" -> getContentPane().setBackground(Color.BLUE);
            case "������" -> getContentPane().setBackground(Color.RED);
            case "�����" -> getContentPane().setBackground(Color.YELLOW);
        }
    }
}