package Laba2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ListenerButtonSozd implements ActionListener {
	static Integer[] m = RandomMassiv.randomMass();
public void actionPerformed(ActionEvent e)
{
	final JFrame info_pane = new JFrame(); // �������� ������������ ����
	info_pane.setTitle("����������������� ������");
	info_pane.setBounds(600, 100, 600, 100);
	info_pane.setResizable(false); // ������������� ������ ����

	JPanel sec_panel = new JPanel(); // ������ - ������������ ��� ����������� ����������� � ����
	sec_panel.setLayout(null); // ��������������� �������� ����������
	info_pane.add(sec_panel);

	

	// ����������� ����� ������
	JLabel text = new JLabel(Arrays.deepToString(m));
	text.setBounds(10, 0, 600, 30);
	
	// ������ ��������
	JButton button_back = new JButton("�����");
	button_back.setBounds(470, 30, 100, 30);
	button_back.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			info_pane.dispose(); // �������� ���� ����������
		}
	});

// ���������� �� ������ ��������� ����������
sec_panel.add(text);
sec_panel.add(button_back);

info_pane.setVisible(true);
info_pane.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}
}
