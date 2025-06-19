package InventoryManagementSystem;
//Inventory.java

import java.util.HashMap;

//This class handles all inventory-related operations
public class Inventory {
 // HashMap to store products using productId as the key
 private HashMap<Integer, Product> inventory;

 // Constructor to initialize the HashMap
 public Inventory() {
     inventory = new HashMap<>();
 }

 // Add a new product to the inventory
 public boolean addProduct(Product p) {
     if (inventory.containsKey(p.productId)) {
         return false; // Product already exists
     }
     inventory.put(p.productId, p);
     return true;
 }

 // Update quantity and price of an existing product
 public boolean updateProduct(int id, int newQty, double newPrice) {
     Product p = inventory.get(id);
     if (p == null) {
         return false; // Product not found
     }
     p.quantity = newQty;
     p.price = newPrice;
     return true;
 }

 // Delete a product from the inventory
 public boolean deleteProduct(int id) {
     return inventory.remove(id) != null;
 }

 // Display all products
 public void displayInventory() {
     if (inventory.isEmpty()) {
         System.out.println("Inventory is empty.");
         return;
     }
     System.out.println("Current Inventory:");
     for (Product p : inventory.values()) {
         p.display();
     }
 }

 // Check if a product exists
 public boolean productExists(int id) {
     return inventory.containsKey(id);
 }
}
