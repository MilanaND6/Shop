/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shop;

import java.util.*;

/**
 *
 * @author SPH_SHSM
 */
public class Shop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Welcome to Milana's clothing shop!\n");
        ArrayList<Item> stock = new ArrayList<>();
        stock.add(new Item("Butterfly Print Crop Tee \n", 10.99, 43));
        stock.add(new Item("Contrast Stitch Bustier Tee \n", 12.99, 27));
        stock.add(new Item("Skeleton Graphic Tee \n", 14.99, 0));
        stock.add(new Item("Graphic Print Wide Leg Pants \n", 34.99, 4));
        stock.add(new Item("Pleated Varisty Skirt \n", 9.99, 5));
        stock.add(new Item("Shirred Puff Sleeve Dress \n", 15.99, 10));
        stock.add(new Item("1pc Off Shoulder Lace Dress \n", 29.99, 0));

        for (Item i : stock) {
            i.display();
        }
    }

}
