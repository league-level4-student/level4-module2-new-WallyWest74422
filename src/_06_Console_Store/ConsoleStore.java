package _06_Console_Store;

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
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

public class ConsoleStore extends NonFood{

    /*
     * Write a program that simulates shopping in a store using the Scanner and
     * the classes in Generics_Store.
     * 
     * Note: You may need to modify existing code in Generics Store and/or add
     * additional items and pictures to fulfill all the requirements. You are
     * also free to add any additional methods or classes in Console Store that
     * might be helpful to you.
     * 
     * Requirements:
     * 
     * -Use Ternary operators in place of simple if/else statements and do-while
     * loops instead of while loops where appropriate.
     * 
     * - There should be at least four unique items the user can buy. These can
     * be food items, nonfood items or both.
     * 
     * - The user should have a stipend of money to spend and each item should
     * have its own price.
     * 
     * -The user should have the ability to add items to their cart, remove
     * items, view items or check out.
     * 
     * -The program should continue until the user chooses to check out.
     * 
     * -When the user checks out you should let them know if they do not have
     * enough money to purchase all their items and offer to put items back.
     * 
     * -If the user successfully purchases the items you should remove the
     * amount from their stipend, show them the pictures of what they bought and
     * print out a receipt showing their name, the individual prices of the
     * items and their total.
     */

    public static void main(String[] args) {
System.out.println("Welcome to the LEGO shop! Your current balance is $500. Type 1-6 to browse our range of products. Happy shopping!");
CommanderCody p1 = new CommanderCody();
LegacyKai p2 = new LegacyKai();
Rivendell p3 = new Rivendell();
DisneyCMF p4 = new DisneyCMF();
AntManFigure p5= new AntManFigure();
DonutShop p6 = new DonutShop();
JFrame frame = new JFrame();
JPanel panel = new JPanel();
Scanner scanner = new Scanner(System.in);
Cart<NonFood> Cart;
Cart = new Cart<NonFood>();
int product;
product = scanner.nextInt();
if(product == 1) {
	p1.advertise();
}else if(product == 2) {
	p2.advertise();
}else if(product == 3) {
	p3.advertise();
}else if(product == 4) {
	p4.advertise();
}else if(product == 5) {
	p5.advertise();
}else if(product == 6) {
	p6.advertise();
}
    }

	@Override
	public JLabel getNonFood() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void advertise() {
		// TODO Auto-generated method stub
		
	}
	
	

}
