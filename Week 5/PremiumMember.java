public class PremiumMember extends Member {

    public PremiumMember(String name, String memberId) {
        super(name, memberId);
    }

    @Override
    public boolean borrowBook(Book book) {
        if (book.isAvailable() && getBorrowedBooks().size() < 10) { 
            // Premium member can borrow up to 10 books
            getBorrowedBooks().add(book);
            book.setAvailable(false);
            return true;
        }
        return false;
    }
}
