package exercise10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class BookShop
 * @author yasiro01
 */
public class BookShop {
    ArrayList<Book> catalog;

    public BookShop() {
        catalog = new ArrayList();
    }

    public BookShop(String filename) throws FileNotFoundException, IOException {
        this();
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = inputFile.readLine()) != null) {
            /* Turn each line into an array of Strings and print it */
            String[] lineContent = line.split(",");
            for (String item: lineContent) {
              catalog.add(Book(item));
            }
        }
    }

    public BookShop(BookShop anotherBookShop) {
    }

    public void addNewTitle(Book book) {
    }

    public int size() {
    }

    public void discountAll(Double discountPercent) {
    }

    public void printCatalog() {
    }

    public void order(Comparator<Book> comp) {
    }

    public ArrayList<Book> getCatalog() {
    }

}
