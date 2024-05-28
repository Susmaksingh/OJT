public class Item {
    
    public String itemId;
    public String name;
    public int quantity;
    public double price;
    

    // Constructor
    public Item(String itemId, String name, int quantity, double price) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Method to update the quantity
    public void updateQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
            System.out.println("Quantity updated to: " + this.quantity);
        } else {
            System.out.println("Quantity cannot be negative.");
        }
    }

    // Method to display item details
    public void displayItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Name: " + name);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        // Create some item objects
        Item item1 = new Item("A001", "Laptop", 10, 999.99);
        Item item2 = new Item("A002", "Smartphone", 20, 499.99);

        // Display item details
        item1.displayItemDetails();
        item2.displayItemDetails();

        // Update quantities
        item1.updateQuantity(15);
        item2.updateQuantity(25);

        // Display updated item details
        item1.displayItemDetails();
        item2.displayItemDetails();

        // Attempt to set negative quantity
        item1.updateQuantity(-5);
    }
}
