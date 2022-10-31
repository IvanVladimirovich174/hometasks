package basicmodule.thirdhometask.secondpart;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book a = new Book("First Book", "First Author");
        Book b = new Book("Second Book", "Second Author");
        Book c = new Book("Third Book", "Third Author");
        Book d = new Book("Awesome Book", "First Author");

        library.addBook(a);
        library.addBook(b);
        library.addBook(c);
        library.addBook(d);

        System.out.println("Initial library:");
        System.out.println(library);
        System.out.println();

        Book book = new Book("Fourth Book", "Fourth Author");
        library.addBook(book);
        System.out.println("Library after adding one more book");
        System.out.println(library);

        library.delBookByTitle("Fourth Book");
        System.out.println("Library after deleting previously added book");
        System.out.println(library);

        System.out.println("Get book by title: First Book");
        System.out.println(library.getBookByTitle("First Book"));
        System.out.println();

        System.out.println("Get books by author: First Author");
        HashSet<Book> booksByAuthor = library.getBooksByAuthor("First Author");
        System.out.println(booksByAuthor);
        System.out.println();

        System.out.println("Borrow book to visitor1");
        Visitor visitor1 = new Visitor("Vasya");
        library.borrowBookToVisitor("First Book", visitor1);
        System.out.println(library);
        System.out.println(visitor1);
        System.out.println();

        System.out.println("Borrow second book to visitor1");
        library.borrowBookToVisitor("Second book", visitor1);
        System.out.println(library);

        System.out.println("Borrow book to visitor2");
        Visitor visitor2 = new Visitor("Petya");
        library.borrowBookToVisitor("Second Book", visitor2);
        System.out.println(library);

        System.out.println("Visitor2 returns random book");
        library.takeBookFromVisitor("First Book", visitor2, 5);
        System.out.println(library);
        System.out.println(visitor2);
        System.out.println();

        System.out.println("Visitor2 returns his book");
        library.takeBookFromVisitor("Second Book", visitor2, 5);
        System.out.println(library);
        System.out.println(visitor2);
        System.out.println();

        System.out.println("Borrow book to visitor2");
        library.borrowBookToVisitor("Second Book", visitor2);

        System.out.println("Visitor2 returns his book");
        library.takeBookFromVisitor("Second Book", visitor2, 2);

        System.out.println("Borrow book to visitor2");
        library.borrowBookToVisitor("Second Book", visitor2);

        System.out.println("Visitor2 returns his book");
        library.takeBookFromVisitor("Second Book", visitor2, 2);

        System.out.println("Avg book rating");
        System.out.println(library.getBookAvgRating("Second Book"));

        System.out.println(library.getBookByTitle("Second Book"));
    }
}
