package Laba2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListenerButtonInfo implements ActionListener {
public void actionPerformed(ActionEvent e)
{
	final JFrame info_pane = new JFrame(); // Создание графического окна
	info_pane.setTitle("Информация");
	info_pane.setBounds(500, 300, 500, 150);
	info_pane.setResizable(false); // Фиксированный размер окна

	JPanel sec_panel = new JPanel(); // Панель - используется для организации компонентов в окне
	sec_panel.setLayout(null); // Устанавливается менеджер компоновки
	info_pane.add(sec_panel);

	String num[] = new String[4];

	//Считывем и запоминаем построчно данные из файла в массив строк
	try {
			InputStream file = this.getClass().getResourceAsStream("/info");
			Scanner scanner = new Scanner(file);
			int i = 0;
			while (i <= 3) {
				num[i] = scanner.nextLine();
				i++;
			}
	}
	catch (Exception ex) { //обработка исключения
		System.out.println(ex.getMessage());
	}
	
	// Кнопка возврата
	JButton button_back = new JButton("Назад");
	button_back.setBounds(270, 200, 100, 40);
	button_back.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			info_pane.dispose(); // Закрытие окна информации
		}
	});
	
	if (Laba2.ListenerButtonZagr.t== true) {
		
	// Добавляются члены группы
	JLabel text = new JLabel("ФИО и зачетные книжки:");
	text.setBounds(30, 0, 400, 30);
	JLabel moder = new JLabel(num[0]);
	moder.setBounds(30, 30, 400, 30);
	JLabel first = new JLabel(num[1]);
	first.setBounds(30, 60, 400, 30);
	JLabel second = new JLabel(num[2]);
	second.setBounds(30, 90, 400, 30);
	JLabel third = new JLabel(num[3]);
	third.setBounds(30, 120, 400, 30);




// Добавление на панель созданные компоненты
sec_panel.add(text);
sec_panel.add(moder);
sec_panel.add(first);
sec_panel.add(second);
sec_panel.add(third);
sec_panel.add(button_back);
}
	else
	{
		JLabel t = new JLabel("Сначала нужно загрузить данные из файла");
		t.setBounds(30, 0, 400, 30);
		sec_panel.add(t);
	}
	info_pane.setVisible(true);
	info_pane.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
}
}
