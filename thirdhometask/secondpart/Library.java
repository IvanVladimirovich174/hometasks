package thirdhometask.secondpart;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashSet;

public class Library {
    private final HashSet<Book> books = new HashSet<>();
    private int lastVisitorId = 1;

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        return null;
    }

    public void delBookByTitle(String title) {
        Book bookToDel = getBookByTitle(title);

        if (bookToDel != null && !bookToDel.isBorrowed()) {
            books.remove(bookToDel);
        }
    }

    public HashSet<Book> getBooksByAuthor(String author) {
        HashSet<Book> booksByAuthor = new HashSet<>();

        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }

    public HashSet<Book> getAllBooks() {
        return books;
    }

    public void borrowBookToVisitor(String title, Visitor visitor) {
        Book book = getBookByTitle(title);

        if (book != null
                && !book.isBorrowed()
                && visitor.getBorrowedBook() == null) {
            book.setBorrowed(true);
            if (visitor.getId() == null) {
                visitor.setId(lastVisitorId++);
            }
            book.setBorrowedByVisitorId(visitor.getId());
            visitor.setBorrowedBook(book);
        }
    }

    public void takeBookFromVisitor(String title, Visitor visitor, Integer visitorRating) {
        Book book = getBookByTitle(title);

        if (book != null
                && book.isBorrowed()
                && book.equals(visitor.getBorrowedBook())) {
            book.setBorrowed(false);
            book.setBorrowedByVisitorId(null);
            visitor.setBorrowedBook(null);
            book.rate(visitorRating);
        }
    }

    public double getBookAvgRating(String title) {
        Book book = getBookByTitle(title);

        if (book != null) {
            BigDecimal bookAvgRating = new BigDecimal(book.getAvgRating());
            bookAvgRating = bookAvgRating.setScale(2, RoundingMode.HALF_UP);
            return bookAvgRating.doubleValue();
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Book book : books) {
            sb.append(book).append("\n");
        }
        return sb.toString();
    }
}
