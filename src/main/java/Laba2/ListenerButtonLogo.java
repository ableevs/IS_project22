package Laba2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ListenerButtonLogo implements ActionListener {

	
	private JLabel  logo;

	//конструктор, в который мы передаем лейбл для логотипа
	public ListenerButtonLogo(JLabel logo) {
			this.logo=logo;
		}
	
	
	public void actionPerformed(ActionEvent arg0) {
		  
		try {//обработчик исключений для безопасного считывания изображения из файла 
			
			InputStream file = this.getClass().getResourceAsStream("/usatu_logo.png");
			BufferedImage img = ImageIO.read(file);//получили изображение
			ImageIcon icon = new ImageIcon(img);//преобразовали из изображения к иконку

			 logo.setIcon(icon);//установили иконку в лейбл
			 logo.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());//изменили параметры лейбла
			 logo.repaint();//принудительно перерисовали лейбл на панеле
			
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		
	}

	
}