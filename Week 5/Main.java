public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books
        library.addBook(new Book("Head First Java", "Kathy Sierra & Bert Bates", "123456"));
        library.addBook(new Book("Effective Java", "Joshua Bloch", "09654321"));

        // Adding members
        Member member1 = new Member("Sri", "R001");
        PremiumMember member2 = new PremiumMember("Archana", "R002");

        library.addMember(member1);
        library.addMember(member2);

        // Borrowing books
        System.out.println("Kathy Sierra & Bert Bates 'Head First Java': " + library.borrowBook("R001", "123456")); // true
        System.out.println("Joshua Bloch 'Effective Java': " + library.borrowBook("R002", "09654321")); // true

        // Trying to borrow a book that's already borrowed
        System.out.println("Joshua Bloch 'Effective Java': " + library.borrowBook("R002", "09654321")); // false

        // Returning books
        System.out.println("Kathy Sierra & Bert Bates 'Head First Java' " + library.returnBook("R001", "123456")); // true
    }
}
