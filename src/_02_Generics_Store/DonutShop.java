package _02_Generics_Store;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JLabel;

public class DonutShop extends NonFood {
	Scanner scanner = new Scanner(System.in);
	public DonutShop() {
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
		System.out.println("Product 6 is a Donut Shop from the 2023 Friends line. The cost is $9.99. Press 'v' to view, 'y' to add to cart, and 'n' to keep shopping.");
	}
}
