package _02_Generics_Store;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class LegacyKai extends NonFood {
	Scanner scanner = new Scanner(System.in);
	public LegacyKai() {
			this.item = "toy1.jpeg";
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}

	@Override
	public void advertise() {
		// TODO Auto-generated method stub
		System.out.println("Product 2 is a rare 2019 Kai minifigure. The cost is $1.99. Press 'v' to view, 'y' to add to cart, and 'n' to keep shopping.");
		String s = scanner.nextLine();
		if(s.equals("v")) {
		    this.showImage();
		}else if(s.equals("n")) {
			System.out.println("Product not added to cart.");
		}else if(s.equals("y")) {
			System.out.println("Product added to cart.");
			
		}
	}

	public void showImage() {
		// TODO Auto-generated method stub
		 JFrame frame = new JFrame();
		    JPanel panel = new JPanel();
		    frame.add(panel);
		    frame.setVisible(true);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		           getNonFood();
		    frame.pack();
	}
}
