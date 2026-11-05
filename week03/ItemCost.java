/*
 * Student Name: Oshunbajo Owomide Oluwagbotemi
 * Matric No: 25/18326
 * Programme: COMPUTER SCIENCE
 * Course: COS 201 - Week 3
 */
import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter item name: ");
        String itemName = input.nextLine();
        
        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();
        
        System.out.print("Enter unit price: ");
        double unitPrice = input.nextDouble();
        
        double totalCost = quantity * unitPrice;
        
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Unit price: %.2f%n", unitPrice);
        System.out.printf("Total cost: %.2f%n", totalCost);
        input.close();
    }
}
