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
        Scanner in = new Scanner(System.in);
        Cart c = new Cart();
        System.out.println("Welcome to Milana's clothing shop!\n");
        ArrayList<Item> stock = new ArrayList<>();
        stock.add(new Item("(1) Butterfly Print Crop Tee \n", 10.99, 43));
        stock.add(new Item("(2) Contrast Stitch Bustier Tee \n", 12.99, 27));
        stock.add(new Item("(3) Skeleton Graphic Tee \n", 14.99, 0));
        stock.add(new Item("(4) Graphic Print Wide Leg Pants \n", 34.99, 4));
        stock.add(new Item("(5) Pleated Varisty Skirt \n", 9.99, 5));
        stock.add(new Item("(6) Shirred Puff Sleeve Dress \n", 15.99, 10));
        stock.add(new Item("(7) 1pc Off Shoulder Lace Dress \n", 29.99, 0));
        
        for (Item i : stock) {
            i.display();
        }
        System.out.println("\nWhat item would you like to choose? Please pick from item number 1-7.");
        int options = in.nextInt();
        c.addItem(stock.get(options - 1));
        System.out.println("Are you done shopping? Yes(y), No(n)");
        char choice = in.nextLine().toLowerCase().charAt(0);
        if ('y' == choice) {
            
        }
    }
}
