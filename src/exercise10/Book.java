package exercise10;

import java.util.Objects;

/**
 * Class Book
 * @author yasiro01
 */
public class Book {
    private final String Title;
    private final String Author;
    private double price;
    private final Integer Year;

    public Book(String Title, String Author, double price, Integer Year) {
        this.Title = Title;
        this.Author = Author;
        this.price = price;
        this.Year = Year;
    }

    public Book(Book oldBook) {
        this.Title = oldBook.Title;
        this.Author = oldBook.Author;
        this.price = oldBook.price;
        this.Year = oldBook.Year;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public double getPrice() {
        return price;
    }

    public Integer getYear() {
        return Year;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.Title);
        hash = 29 * hash + Objects.hashCode(this.Author);
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.price) ^ (Double.doubleToLongBits(this.price) >>> 32));
        hash = 29 * hash + Objects.hashCode(this.Year);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.Title, other.Title)) {
            return false;
        }
        if (!Objects.equals(this.Author, other.Author)) {
            return false;
        }
        if (!Objects.equals(this.Year, other.Year)) {
            return false;
        }
        return true;
    }
    
}

class ByTitle implements Comparator<Book> {
}

class ByAuthor implements Comparator<Book> {
}

class ByPrice implements Comparator<Book> {
}

class ByYear implements Comparator<Book> {
}
