package _06_Console_Store;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import _02_Generics_Store.AntManFigure;
import _02_Generics_Store.Cart;
import _02_Generics_Store.CommanderCody;
import _02_Generics_Store.DisneyCMF;
import _02_Generics_Store.DonutShop;
import _02_Generics_Store.LegacyKai;
import _02_Generics_Store.NonFood;
import _02_Generics_Store.Rivendell;
import _02_Generics_Store.Toy;

public class ConsoleStore extends NonFood {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	static Scanner scanner = new Scanner(System.in);
	static Scanner scan = new Scanner(System.in);
//	static Cart<NonFood> Cart;
	String s;
static boolean checkout = false;
static double moneySpent = 0;
static double previousMoneySpent = 0;
static ArrayList<String> receiptItems =
new ArrayList<String>();
static ArrayList<String> items = new ArrayList<String>();
static ArrayList<NonFood> items1 = new ArrayList<NonFood>();

	/*
	 * Write a program that simulates shopping in a store using the Scanner and the
	 * classes in Generics_Store.
	 * 
	 * Note: You may need to modify existing code in Generics Store and/or add
	 * additional items and pictures to fulfill all the requirements. You are also
	 * free to add any additional methods or classes in Console Store that might be
	 * helpful to you.
	 * 
	 * Requirements:
	 * 
	 * -Use Ternary operators in place of simple if/else statements and do-while
	 * loops instead of while loops where appropriate.
	 * 
	 * - There should be at least four unique items the user can buy. These can be
	 * food items, nonfood items or both.
	 * 
	 * - The user should have a stipend of money to spend and each item should have
	 * its own price.
	 * 
	 * -The user should have the ability to add items to their cart, remove items,
	 * view items or check out.
	 * 
	 * -The program should continue until the user chooses to check out.
	 * 
	 * -When the user checks out you should let them know if they do not have enough
	 * money to purchase all their items and offer to put items back.
	 * 
	 * -If the user successfully purchases the items you should remove the amount
	 * from their stipend, show them the pictures of what they bought and print out
	 * a receipt showing their name, the individual prices of the items and their
	 * total.
	 */

	public static void main(String[] args) {
		System.out.println(
				"Welcome to the LEGO shop! Your current balance is $500. Type 1-6 to browse our range of products and press '0' whenever you wish to check out. Happy shopping!");

		CommanderCody p1 = new CommanderCody();
		LegacyKai p2 = new LegacyKai();
		Rivendell p3 = new Rivendell();
		DisneyCMF p4 = new DisneyCMF();
		AntManFigure p5 = new AntManFigure();
		DonutShop p6 = new DonutShop();
	Cart<NonFood> cart = new Cart<NonFood>(100);
		int product;

		do {
			product = scanner.nextInt();
			if (product == 1) {
				p1.advertise();
				String s = scan.nextLine();
				if (s.equals("YES")) {
					cart.add(p1);
					System.out.println("Item added to cart.");
					previousMoneySpent = moneySpent;
					moneySpent += p1.returnPrice();
					String one = "Commander Cody - $39.99";
					items.add("p1");
					items1.add(p1);
					receiptItems.add(one);
				}
			} else if (product == 2) {
				p2.advertise();
				String s = scan.nextLine();
				if (s.equals("YES")) {
					cart.add(p2);
					System.out.println("Item added to cart.");
					previousMoneySpent = moneySpent;

					moneySpent += p2.returnPrice();
					String two = "Legacy Kai - $2.99";
					items.add("p2");
					items1.add(p2);
					receiptItems.add(two);
				}
			} else if (product == 3) {
				p3.advertise();
				String s = scan.nextLine();
				if (s.equals("YES")) {
					cart.add(p3);
					System.out.println("Item added to cart.");
					previousMoneySpent = moneySpent;

					moneySpent += p3.returnPrice();
					String three = "Rivendell - $499.99";
					items.add("p3");
					items1.add(p3);
					receiptItems.add(three);
				}
			} else if (product == 4) {
				p4.advertise();
				String s = scan.nextLine();
				if (s.equals("YES")) {
					cart.add(p4);
					System.out.println("Item added to cart.");
					previousMoneySpent = moneySpent;

					moneySpent += p4.returnPrice();
					String four = "Disney CMF - $4.99";
					items.add("p4");
					items1.add(p4);
					receiptItems.add(four);
				}
			} else if (product == 5) {
				p5.advertise();
				String s = scan.nextLine();
				if (s.equals("YES")) {
					cart.add(p5);
					System.out.println("Item added to cart.");
					previousMoneySpent = moneySpent;

					moneySpent += p5.returnPrice();
					String five = "Ant-Man Figure - $29.99";
					items.add("p5");
					items1.add(p5);
					receiptItems.add(five);
				}
			} else if (product == 6) {
				p6.advertise();
				String s = scan.nextLine();
				if (s.equals("YES")) {
					cart.add(p6);
					System.out.println("Item added to cart.");
					previousMoneySpent = moneySpent;

					moneySpent += p6.returnPrice();
					String six = "Donut Shop - $9.99";
					items.add("p6");
					items1.add(p6);
					receiptItems.add(six);
				}

			} else if (product == 0) {
				checkout = true;
			}
		} while (checkout == false);
	
		if (checkout == true) {
	checkout(cart);
		}

	}

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void checkout(Cart<NonFood> cart) {
		if (checkout == true){
			if (moneySpent <= 500.00) {
				System.out.println("Please enter your name below to complete the transaction.");
				String name = scan.nextLine();
				System.out.println("       RECEIPT PRINTING");
				System.out.println("Customer - " + name);
				for (int i = 0; i < receiptItems.size(); i++) {
					System.out.println(receiptItems.get(i));
				}
				System.out.println("    Total Cost - $" + moneySpent);
				System.out.println("Thank you and have a good day!");
				cart.showCart();
			} else if (moneySpent > 500.00) {
				for (int i = 0; i < receiptItems.size(); i++) {
					System.out.println(receiptItems.get(i));
				}
				System.out.println("    Total Cost - $" + moneySpent);
				System.out.println(
						"Unfortunately, your current cart exceeds the limit of $500.00. Press 'r' to remove the first item from your cart to be able to attempt checkout again.");
				String s = scan.nextLine();
				if (s.equals("r")) {
					receiptItems.remove(receiptItems.size()-1);
					String lastItem = items.get(items.size()-1);
					items.remove(lastItem);
					moneySpent = 0;
					cart = new Cart<NonFood>(100);
					for(int i = 0; i< items.size(); i++) {
						cart.add(items1.get(i));
					}
					for(int i = 0; i< cart.length(); i++) {
//						System.out.println(i);
	//					System.out.println(cart.cart[i]);
						moneySpent += cart.cart[i].returnPrice();
					}
checkout(cart);
				}
			}
		}
	}
	
	@Override
	public void advertise() {
		// TODO Auto-generated method stub

	}

}
