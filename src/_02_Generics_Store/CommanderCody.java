package _02_Generics_Store;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import _06_Console_Store.ConsoleStore;

public class CommanderCody extends NonFood {
	Scanner scanner = new Scanner(System.in);
	public CommanderCody() {
			this.item = "CommanderCody.jpeg";
	}
ConsoleStore cs = new ConsoleStore();
Rivendell pic = new Rivendell();
	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}

	boolean browsed = false;
	@Override
	public void advertise() {
		// TODO Auto-generated method stub
		System.out.println("Product 1 is an authentic 2022 Commander Cody minifigure. The cost is only $39.99. Press 'v' to view, 'y' to add to cart, and 'n' to keep shopping.");
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
		    frame.setSize(200, 200);
		    JPanel panel = new JPanel();
		    frame.add(panel);
		    frame.setVisible(true);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(this.getNonFood());
		    frame.pack();
	}
}
