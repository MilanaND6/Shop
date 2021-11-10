/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop;

import java.util.*;

/**
 *
 * @author S288981
 */
public class Cart {

    Scanner in = new Scanner(System.in);
    ArrayList<Item> cart;

    public Cart() {
        cart = new ArrayList<>();
    }

    public void addItem(Item i) {
        cart.add(i);
    }

    public void removeItem() {

        for (Item i : cart) {
            System.out.println(i.name);
        }
        System.out.println("Which item would you like to remove?");
        int x = in.nextInt();
        cart.remove(x - 1);
    }

    public Cart(ArrayList<Item> cart) {
        this.cart = cart;
        
    }
}
