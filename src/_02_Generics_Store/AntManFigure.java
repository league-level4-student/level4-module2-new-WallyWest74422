package _02_Generics_Store;
import java.util.Scanner;

import javax.swing.JLabel;

public class AntManFigure extends NonFood {
	Scanner scanner = new Scanner(System.in);
	public AntManFigure() {
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
		System.out.println("Product 5 is a buildable Ant-Man figure from Ant-Man and the Wasp: Quantummania. The cost is only $29.99. Press 'v' to view, 'y' to add to cart, and 'n' to keep shopping.");
	}
}
