package thirdhometask.secondpart;

public class Visitor {
    private Integer id;
    private String name;
    private Book borrowedBook;

    public Visitor(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void setBorrowedBook(Book borrowedBook) {
        this.borrowedBook = borrowedBook;
    }

    @Override
    public String toString() {
        return "Visitor{" +
                "id: " + id +
                ", name: '" + name + '\'' +
                ", borrowedBook: " + borrowedBook +
                '}';
    }
}
