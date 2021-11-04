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
        ArrayList<Item> stock=new ArrayList<>();
        stock.add(new Item("Computer Monitor",159.99,5));
        stock.add(new Item("Keyboard",29.95,100));
        stock.add(new Item("Mouse",15.00,0));
        
        for (Item i:stock){
            i.display();
        }
    }
    
}
