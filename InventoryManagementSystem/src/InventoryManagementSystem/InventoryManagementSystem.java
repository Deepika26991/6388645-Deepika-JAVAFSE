package InventoryManagementSystem;
//InventoryManagementSystem.java

import java.util.Scanner;

//Main class to interact with the user
public class InventoryManagementSystem {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Inventory inventory = new Inventory(); // Create inventory object

     // Infinite loop for menu
     while (true) {
         System.out.println("\n--- Inventory Menu ---");
         System.out.println("1. Add Product");
         System.out.println("2. Update Product");
         System.out.println("3. Delete Product");
         System.out.println("4. Display Inventory");
         System.out.println("5. Exit");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();

         switch (choice) {
             case 1:
                 // Add product logic
                 System.out.print("Enter Product ID: ");
                 int id = scanner.nextInt();
                 scanner.nextLine(); // Consume newline

                 if (inventory.productExists(id)) {
                     System.out.println("Product already exists.");
                     break;
                 }

                 System.out.print("Enter Product Name: ");
                 String name = scanner.nextLine();
                 System.out.print("Enter Quantity: ");
                 int qty = scanner.nextInt();
                 System.out.print("Enter Price: ");
                 double price = scanner.nextDouble();

                 Product p = new Product(id, name, qty, price);
                 inventory.addProduct(p);
                 System.out.println("Product added successfully.");
                 break;

             case 2:
                 // Update product logic
                 System.out.print("Enter Product ID to update: ");
                 int upId = scanner.nextInt();
                 if (!inventory.productExists(upId)) {
                     System.out.println("Product not found.");
                     break;
                 }
                 System.out.print("Enter New Quantity: ");
                 int newQty = scanner.nextInt();
                 System.out.print("Enter New Price: ");
                 double newPrice = scanner.nextDouble();

                 inventory.updateProduct(upId, newQty, newPrice);
                 System.out.println("Product updated successfully.");
                 break;

             case 3:
                 // Delete product logic
                 System.out.print("Enter Product ID to delete: ");
                 int delId = scanner.nextInt();
                 if (inventory.deleteProduct(delId)) {
                     System.out.println("Product deleted successfully.");
                 } else {
                     System.out.println("Product not found.");
                 }
                 break;

             case 4:
                 inventory.displayInventory();
                 break;

             case 5:
                 System.out.println("Exiting...");
                 scanner.close();
                 return;

             default:
                 System.out.println("Invalid choice.");
         }
     }
 }
}
