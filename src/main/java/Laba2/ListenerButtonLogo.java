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

	//�����������, � ������� �� �������� ����� ��� ��������
	public ListenerButtonLogo(JLabel logo) {
			this.logo=logo;
		}
	
	
	public void actionPerformed(ActionEvent arg0) {
		  
		try {//���������� ���������� ��� ����������� ���������� ����������� �� ����� 
			
			InputStream file = this.getClass().getResourceAsStream("/usatu_logo.png");
			BufferedImage img = ImageIO.read(file);//�������� �����������
			ImageIcon icon = new ImageIcon(img);//������������� �� ����������� � ������

			 logo.setIcon(icon);//���������� ������ � �����
			 logo.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());//�������� ��������� ������
			 logo.repaint();//������������� ������������ ����� �� ������
			
			 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		
	}

	
}