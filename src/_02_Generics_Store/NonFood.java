package _02_Generics_Store;

import java.io.IOException;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class NonFood {
	String item;
	double price;
	Scanner scanner = new Scanner(System.in);
	public abstract JLabel getNonFood();
	public abstract void advertise();
	public double returnPrice(){
		return this.price;
		
	}
	@SuppressWarnings("rawtypes")
	public static ImageIcon loadImage(String fileName) {
		try {
			return new ImageIcon(ImageIO.read(new Cart(100).getClass().getResourceAsStream("images/"+fileName)));
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}
