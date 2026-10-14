package com.pluralsight;

public class Receipt {
    public static void main(String[] args) {
        String itemName = "cookies";
        double itemPrice = 3.39;
        int quantity = 6;

        double total = itemPrice * quantity;
        System.out.println("You bought: " + quantity + " " + itemName + " for " + total);
    }
}
