package exercise10;

import java.text.DecimalFormat;
import java.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Class Book
 * @author casaer01
 */
public class Book {
    final String Title;
    final String Author;
    double price;
    final Integer Year;

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

    @Override
    public String toString() {
        DecimalFormat priceFormat = new DecimalFormat("0.00");
        return (Title + " " + Year + " by " + Author + " costs $" + priceFormat.format(price));
    }
}


class ByTitle implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.Title.compareTo(b2.Title);
    }
}

class ByAuthor implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.Author.compareTo(b2.Author);
    }
}

class ByPrice implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        String b01 = Double.toString(b1.price);
        String b02 = Double.toString(b2.price);
        
        return b01.compareTo(b02);
    }
}

class ByYear implements Comparator<Book> {
    @Override
    public int compare(Book b1, Book b2) {
        return b1.Year.compareTo(b2.Year);
    }
}
