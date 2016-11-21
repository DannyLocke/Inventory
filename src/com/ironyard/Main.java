package com.ironyard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<InventoryItem> items = new ArrayList<>(); //to store inventory items
        Scanner scanner = new Scanner(System.in); //to receive user input

        while(true){

            //DISPLAY TO USER
            System.out.println("Options: ");
            System.out.println("[1] Add an inventory item");
            System.out.println("[2] Remove inventory item");
            System.out.println("[3] Update an inventory item quantity");
            System.out.println("[4] List inventory items");

            String option = scanner.nextLine(); //receive user input

            //ADD AN INVENTORY ITEM
            if(option.equals("1")){
                System.out.println("Add an inventory item: ");
                String text = scanner.nextLine();

                System.out.println("Enter inventory item quantity: ");
                int quantity = Integer.parseInt(scanner.nextLine());   //take string from user and turn into an int

                InventoryItem item = new InventoryItem(text, quantity);
                items.add(item);
            }

            //REMOVE AN INVENTORY ITEM
            else if (option.equals("2")){
                System.out.println("Enter the number of the item you want to remove:");
                int itemNum = Integer.parseInt(scanner.nextLine());

                items.remove(itemNum - 1);
            }

            //UPDATE INVENTORY QUANTITY
            else if(option.equals("3")){
                System.out.println("Enter the number of the item you would like to update: ");
                int itemNum = Integer.parseInt(scanner.nextLine());

                InventoryItem item = items.get(itemNum -1);

                System.out.println("Enter the new quantity:");
                int itemQuan = Integer.parseInt(scanner.nextLine());

                item.quantity = itemQuan;
            }

            //LIST INVENTORY ITEMS
            else if(option.equals("4")){
                int i = 1;
                for(InventoryItem item : items){

                    System.out.println(i  + ".  Item: " + item.text + " / Quantity: " + item.quantity);
                    i++;
                }
            }

            //IF ANYTHING OTHER THAN 1, 2, 3 OR 4 ARE ENTERED
            else {
                System.out.println("Invalid Option"); //end and loops to the top
            }

        }//end while loop

    }//end main()

}//end public class main