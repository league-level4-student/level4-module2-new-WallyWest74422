package _02_Generics_Store;

import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/*
 * The Cart class is a Bounded Type Generic class
 * 
 * <T extends Food> means we can only create a Cart with objects part of the 
 * Food class
 */

@SuppressWarnings("unchecked")
public class Cart<T extends NonFood> {
    public T[] cart;

    public Cart(int maxItems) {
        cart = (T[]) new NonFood[maxItems];
    }
 
    // Adds an item to the cart
    public void add(T item) {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                cart[i] = item;
                return;
            }
        }
        JOptionPane.showMessageDialog(null,
                "Your cart is full!\nNo more than 5 items");
    }

    // Displays everything currently in the cart
    public  void showCart() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        frame.add(panel);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        for (int i = 0; i < cart.length; i++) {
            if (cart[i] != null) {
                panel.add(cart[i].getNonFood());
            }
        }
        frame.pack();
    }
    

    public int length() {
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                return i;
            }
        }
        return cart.length;
    }
}
