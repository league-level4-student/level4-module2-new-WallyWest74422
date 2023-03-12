package _02_Generics_Store;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Rivendell extends NonFood {
	Scanner scanner = new Scanner(System.in);
	public Rivendell() {	
			this.item = "CommanderCody.jpeg";
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
		String s = scanner.nextLine();
		if(s.equals("v")) {
		    JFrame frame = new JFrame();
		    JPanel panel = new JPanel();
		    frame.add(panel);
		    frame.setVisible(true);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		           getNonFood();
		    frame.pack();
		}else if(s.equals("n")) {
			System.out.println("Product not added to cart.");
		}else if(s.equals("y")) {
			System.out.println("Product added to cart.");
			
		}
	}
}
