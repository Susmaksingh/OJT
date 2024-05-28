import java.util.Scanner;

class Discount {
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the quantity: ");
        int quantity = s.nextInt();
        
        int PerunitPrice = 100;
        int totalCost = quantity * PerunitPrice;
        
        if (totalCost > 1000) {
            double discount = totalCost * 0.1;
            totalCost -= discount;
        }
        
        System.out.println("Total cost: " + totalCost);
        
    }
}

    

