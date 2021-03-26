package Laba2; //пакет Java классов

import java.awt.BorderLayout; //библиотека для полярного расположение
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; //библиотека для события слушателя
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.*;

import javax.imageio.ImageIO;
import javax.swing.*; // Библиотека для GUI (построена на основе awt)

public class subversion {

	JButton ok;
	JPanel main_panel;
	
	public subversion() 
	{
		final JLabel logo = new JLabel();//лейбл для отображения логотипа УГАТУ
		JFrame main_GUI = new JFrame("subversion");	// создание графического окна
		main_GUI.setTitle ("Using subversion for developers");
		main_GUI.setBounds(500,400,400,350); // задаются параметры окна
		main_GUI.setResizable(false); // фиксированный размер окна
		
		final JComboBox<String> rasp_comboBox = new JComboBox<String>(); // ComboBox для выбора расположения логотипа
		rasp_comboBox.addItem("Переместить логотип УГАТУ в верхний левый угол");
		rasp_comboBox.addItem("Переместить логотип УГАТУ вверху посередине"); 
		rasp_comboBox.addItem("Переместить логотип УГАТУ в верхний правый угол");
		
		rasp_comboBox.addActionListener(new ActionListener() { //добавляем слушатель к ComboBox
			public void actionPerformed(ActionEvent event) { //Действия, происходящие при наступлении события
			if (rasp_comboBox.getSelectedItem()=="Переместить логотип УГАТУ в верхний правый угол") {
				logo.setLocation(270, 0);//изменили положение лейбла с логотипом
					}
			if (rasp_comboBox.getSelectedItem()=="Переместить логотип УГАТУ вверху посередине") {
				logo.setLocation(140, 0);//изменили положение лейбла с логотипом
				}
			if (rasp_comboBox.getSelectedItem()=="Переместить логотип УГАТУ в верхний левый угол") {
				logo.setLocation(0, 0);//изменили положение лейбла с логотипом
				}
			}
			});
		
		main_panel = new JPanel(); // Панель - используется для организации компонентов в окне
		main_panel.setLayout(null);
		main_GUI.add(main_panel); //добавляем панель в окно
		main_GUI.add(rasp_comboBox, BorderLayout.SOUTH); //добавляем ComboBox в окно
		
		
		JLabel laba_info = new JLabel("Лабораторная работа №5"); // Отображение текста или изображения
		laba_info.setBounds(120,0,150,30);
		main_panel.add(laba_info);
		
		
	
		
		JButton button_exit = new JButton("Выход"); // добавляем кнопку
		button_exit.setBounds(270,200,100,40);
		ActionListener actionListener = new ListenerButton(); //создаем слушатель
		button_exit.addActionListener(actionListener); // добавляем слушатель к кнопке
		main_panel.add(button_exit);
		
		JButton button_info = new JButton("Информация"); // добавляем кнопку
		button_info.setBounds(145,200,120,40); 
		ActionListener actionListenerInfo = new ListenerButtonInfo(); //создаем слушатель
		button_info.addActionListener(actionListenerInfo); // добавляем слушатель к кнопке
		main_panel.add(button_info);
		
		
		JMenu menu =new JMenu("Меню");//создали вкладку меню
		JMenuItem exit=new JMenuItem("Выход");// создали пукт меню с отображением логотипа
		JMenuItem show =new JMenuItem("Отобразить логотип УГАТУ");//пукт меню выход
		JMenuItem zagr=new JMenuItem("Загрузить файл в проект22");// добавила пункт меню "загрузить файл в проект22"
		JMenuItem sort=new JMenuItem("Отсортировать массив");// добавил пункт меню 
		JMenuItem sozd=new JMenuItem("Создать массив");// добавил пункт меню 
				
		main_panel.add(logo);//добавляем лейбл на панель
		ListenerButtonLogo listenerButtonLogo=new ListenerButtonLogo(logo);//создали слушатель 
		show.addActionListener(listenerButtonLogo);//прикрепили к пункту отображения логотипа слушатель
		ListenerButtonSozd listenerButtonSozd=new ListenerButtonSozd();//создали слушатель 
		sozd.addActionListener(listenerButtonSozd);//прикрепили к пункту отображения логотипа слушатель
		ListenerButtonSort listenerButtonSort=new ListenerButtonSort();//создали слушатель 
		sort.addActionListener(listenerButtonSort);//прикрепили к пункту отображения логотипа слушатель
		ListenerButton listenerButton=new ListenerButton();//создали слушатель 
		exit.addActionListener(listenerButton);//прикрепили к пункту отображения логотипа слушатель
		ListenerButtonZagr listenerButtonZagr=new ListenerButtonZagr();//создали слушатель 
		zagr.addActionListener(listenerButtonZagr);//прикрепили к пункту отображения логотипа слушатель
		
		menu.add(show);//добавили кнопку к меню
		menu.add(zagr);//добавили кнопку к меню
		menu.add(sozd);//добавили кнопку к меню
		menu.add(sort);//добавили кнопку к меню
		menu.add(exit);//добавили кнопку к меню
		
		JMenuBar menuBar=new JMenuBar(); //создали строку меню
		menuBar.add(menu);//к строке меню прикрепили компонент меню
		main_GUI.setJMenuBar(menuBar);//добавили строку меню к главному окну
		
		
		main_GUI.setVisible(true);
		
		main_GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // закрытие окна JFrame и процесса Java
		
		//Текстовое поле
				ok = new JButton("=");
				main_panel.add(ok);
				ok.setBounds(285, 150, 50, 30);
				
				JFormattedTextField iField = new JFormattedTextField(
						NumberFormat.getNumberInstance());
				iField.setValue(new Long(0));
				addRow("Радиус: ",iField);
				iField.setBounds(200, 150, 80, 30);
				
			}
	public void addRow(String s, final JFormattedTextField field)
	{
		main_panel.add(new JLabel(s)).setBounds(140, 130, 100, 60);
		main_panel.add(field).setBounds(200, 80, 80, 60);
		final JLabel vLabel = new JLabel();
		main_panel.add(vLabel).setBounds(140, 100, 200, 60);
		ok.addActionListener(new
				ActionListener()
				{
					public void actionPerformed(ActionEvent event)
					{
						double d = Double.parseDouble(field.getValue() + "");
						Object value = 4*Math.PI*Math.pow(d, 3)/3;
						vLabel.setText("Объём: "+String.format("%.3f",value));
					}
				});
	}
	
	
	
	public static void main(String[] args) { // интересные заметки: http://www.mstu.edu.ru/study/materials/java/
		subversion student= new subversion();
		
	}

} 
