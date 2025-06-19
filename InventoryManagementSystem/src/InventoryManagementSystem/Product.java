package InventoryManagementSystem;
//Product.java

//This class represents a single product in the inventory
public class Product {
 public int productId;       // Unique ID for the product
 public String productName;  // Name of the product
 public int quantity;        // Quantity in stock
 public double price;        // Price per unit

 // Constructor to initialize product details
 public Product(int productId, String productName, int quantity, double price) {
     this.productId = productId;
     this.productName = productName;
     this.quantity = quantity;
     this.price = price;
 }

 // Method to display product information
 public void display() {
     System.out.println("ID: " + productId + ", Name: " + productName +
                        ", Quantity: " + quantity + ", Price: ₹" + price);
 }
}
