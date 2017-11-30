package exercise10;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Comparator;
import java.util.HashSet;
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
              catalog.add(new Book(lineContent[0],
                                      lineContent[1],
                                      Double.parseDouble(lineContent[2]),
                                      Integer.parseInt(lineContent[3])));
            }
        }
    }

    public BookShop(BookShop anotherBookShop) {
        this();
        for (int i = 0; i < anotherBookShop.size(); i++){
            catalog.add(anotherBookShop.getCatalog().get(i));
        }
    }

    public void addNewTitle(Book book) {
        catalog.add(book);        
    }

    public int size() {
        return catalog.size();
    }

    public void discountAll(Double discountPercent) {
        double discount = discountPercent / 100;
        for (int i = 0; i < catalog.size();i++) {
            double currentPosition = catalog.get(i).getPrice();
            double newPrice = currentPosition * discount;
            catalog.get(i).setPrice(newPrice);
        }
    }

    public void printCatalog() {
        for (int i = 0; i < catalog.size(); i++) {
            System.out.println(catalog.get(i));
        }
    }

    public void order(Comparator<Book> comp) {
        Collections.sort(catalog, comp);
    }

    public ArrayList<Book> getCatalog() {
        return catalog;
    }

}
