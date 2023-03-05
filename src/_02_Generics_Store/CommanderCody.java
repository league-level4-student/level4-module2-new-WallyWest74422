package _02_Generics_Store;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JLabel;

public class CommanderCody extends NonFood {
	Scanner scanner = new Scanner(System.in);
	public CommanderCody() {
			this.item = "toy1.jpeg";
	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}

	boolean browsed = false;
	@Override
	public void advertise() {
		// TODO Auto-generated method stub
		System.out.println("Product 1 is an original 2022 Commander Cody minifigure. The cost is only $39.99. Press 'v' to view, 'y' to add to cart, and 'n' to keep shopping.");
		 scanner.nextLine();
	}
}
