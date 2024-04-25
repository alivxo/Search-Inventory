package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInventory<Product> {
    public static void main(String[] args) {
//
//        ArrayList< Product> inventory= getInventory();
//        // creating an array list for the inventory
//        // we are going to also create a method to call this inventory
//
//        Scanner in = new Scanner(System.in);
//        // creating user input
//
//        System.out.println("We carry the following products: ");
//
//        for (int i = 0; i < inventory.size(); i++) {
//            // using for loop to get products of array
//            Product p = inventory.get(i);
//            // we are using .get to get the value of the array
//            System.out.printf("id %d %s - Price: $%.2f", p.getId(), p.getName(), p.getPrice());
//            // we are using print f to print the value of the inventory
//            // we are using p. as the varaible name
//            // we are using .get to get the values of ID, NAME and PRICE
//
//        }
//    }
//    public ArrayList<Product> getInventory(){
//        // we are making a new method to call Product and Inventory into the main method
//         ArrayList<Product> inventory = new ArrayList<Product>();
//         // this is used to be able to receive into the main method
//        // this method loads product objects into inventory
//
//        inventory.add((Product) "Water");
//
//        return inventory;

        // page 61 in Workbook 3-1
        Scanner scanner = new Scanner(System.in);

        System.out.println("These are the products we have available :");

        ArrayList<String> inventory = new ArrayList<>();

        // Below is an initialized arrayList
        inventory.add("4567|10' 2x4 (grade B)|9.99");
        inventory.add("1234|Hammer|19.49");
        inventory.add("2345|Box of nails|9.29");

        for (int i = 0; i < inventory.size(); i++) {
            // you can find out how many elements there are using the size() method
            System.out.println((i + 1) + " : " + inventory.get(i));
            //  get() method to access elements in a loop


        }
    }
}
