package basicmodule.thirdhometask.secondpart;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private boolean isBorrowed;
    private Integer borrowedByVisitorId;
    private List<Integer> ratings = new ArrayList<>();

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    public Integer getBorrowedByVisitorId() {
        return borrowedByVisitorId;
    }

    public void setBorrowedByVisitorId(Integer borrowedByVisitorId) {
        this.borrowedByVisitorId = borrowedByVisitorId;
    }

    public List<Integer> getRatings() {
        return ratings;
    }

    public void setRatings(List<Integer> ratings) {
        this.ratings = ratings;
    }

    public void rate(Integer rate) {
        ratings.add(rate);
    }

    public double getAvgRating() {
        int sum = 0;

        for (int rating : ratings) {
            sum += rating;
        }

        if (sum != 0) {
            BigDecimal bookAvgRating = new BigDecimal(1.0 * sum / ratings.size());
            bookAvgRating = bookAvgRating.setScale(2, RoundingMode.HALF_UP);
            return bookAvgRating.doubleValue();
        }
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title: '" + title + '\'' +
                ", author: '" + author + '\'' +
                ", isBorrowed: " + isBorrowed +
                ", borrowedByUserId: " + borrowedByVisitorId +
                ", ratings: " + ratings +
                '}';
    }
}
