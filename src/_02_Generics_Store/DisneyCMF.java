package _02_Generics_Store;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JLabel;

public class DisneyCMF extends NonFood {
	Scanner scanner = new Scanner(System.in);
	public DisneyCMF() {
		if(new Random().nextBoolean()) {
			this.item = "toy1.jpeg";
		}
		else {
			this.item = "toy2.jpeg";
		}
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}

	@Override
	public void advertise() {
		// TODO Auto-generated method stub
		System.out.println("Product 4 is a mystery pack of 2023 Disney minifigures celebrating 100 years of Disney. The cost is $4.99. Press 'v' to view, 'y' to add to cart, and 'n' to keep shopping.");
	}
}
