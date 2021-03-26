package Laba2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class ListenerButtonSozd implements ActionListener {
	static Integer[] m = RandomMassiv.randomMass();
public void actionPerformed(ActionEvent e)
{
	final JFrame info_pane = new JFrame(); // Создание графического окна
	info_pane.setTitle("Неотсортированный массив");
	info_pane.setBounds(600, 100, 600, 100);
	info_pane.setResizable(false); // Фиксированный размер окна

	JPanel sec_panel = new JPanel(); // Панель - используется для организации компонентов в окне
	sec_panel.setLayout(null); // Устанавливается менеджер компоновки
	info_pane.add(sec_panel);

	

	// Добавляются члены группы
	JLabel text = new JLabel(Arrays.deepToString(m));
	text.setBounds(10, 0, 600, 30);
	
	// Кнопка возврата
	JButton button_back = new JButton("Назад");
	button_back.setBounds(470, 30, 100, 30);
	button_back.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			info_pane.dispose(); // Закрытие окна информации
		}
	});

// Добавление на панель созданные компоненты
sec_panel.add(text);
sec_panel.add(button_back);

info_pane.setVisible(true);
info_pane.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}
}
