package _02_Generics_Store;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DisneyCMF extends NonFood {
	Scanner scanner = new Scanner(System.in);
	public DisneyCMF() {
		Random ran = new Random();
		int BlindBag = ran.nextInt(7);
		
	this.item = "DisneyCMF"+BlindBag+".jpeg";
	this.price = 4.99;
	} 

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage(this.item));
	}
	
	public JLabel getNonFoodCover() {
		// TODO Auto-generated method stub
		return new JLabel(loadImage("DisneyCMFCover.jpeg"));
	}

	@Override
	public void advertise() {
		// TODO Auto-generated method stub
		System.out.println("Product 4 is a mystery pack of 2023 Disney minifigures celebrating 100 years of Disney. The cost is $4.99. Press 'v' to view, 'y' to add to cart, and 'n' to keep shopping.");
		String s = scanner.nextLine();
		if(s.equals("v")) {
			  this.showCover();
		}else if(s.equals("n")) {
			System.out.println("Product not added to cart.");
		}
		s = s.equals("y")? s.replace(s, "Please type 'YES' to confirm adding this product to your cart.") : s.replaceAll(s, "");
		System.out.println(s);
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
	
	public void showCover() {
		// TODO Auto-generated method stub
		 JFrame frame = new JFrame();
		    frame.setSize(200, 200);
		    JPanel panel = new JPanel();
		    frame.add(panel);
		    frame.setVisible(true);
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel.add(this.getNonFoodCover());
		    frame.pack();
	}
	public double returnPrice() {
		// TODO Auto-generated method stub
		return this.price;
	}
}
