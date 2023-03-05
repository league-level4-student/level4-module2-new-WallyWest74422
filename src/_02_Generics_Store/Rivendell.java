package _02_Generics_Store;

import java.util.Scanner;

import javax.swing.JLabel;

public class Rivendell extends NonFood {
	Scanner scanner = new Scanner(System.in);
	public Rivendell() {	
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
		System.out.println("Product 3 is the iconic Rivendell from Lord of the Rings. The cost is only $499.99. Press 'v' to view, 'y' to add to cart, and 'n' to keep shopping.");
	}
}
