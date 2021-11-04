/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop;
import java.util.*;
/**
 *
 * @author SPH_SHSM
 */
public class Item {
    String name;
    double price;
    
    int inventory;

    public Item(String name, double price, int inventory) {
        this.name = name;
        this.price = price;
        this.inventory = inventory;
    }
    
    public void display(){
        System.out.print(this.name+": $"+this.price);
        if (this.inventory==0){
            System.out.println(" Sold out");
        }else if (this.inventory<10){
            System.out.println(" Limited Quantities");
        }else{
            System.out.println(" In Stock");
        }
    }
    
}
