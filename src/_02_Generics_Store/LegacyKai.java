package _02_Generics_Store;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JLabel;

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
	}
}
