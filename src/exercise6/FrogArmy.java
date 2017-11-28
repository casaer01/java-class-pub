package exercise6;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class FrogArmy
 * @author yasiro01
 */
public class FrogArmy {
    private String filename;
    private final ArrayList<Frog> frogList;

    public FrogArmy(String filename) throws FileNotFoundException, IOException {
        this.filename = filename;
        frogList = new ArrayList();
        
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = inputFile.readLine()) != null) {
            /* Turn each line into an array of Strings and print it */
            String[] lineContent = line.split(",");
            for (String item: lineContent) {
              //placeholder
            }
        }
    }
    
    
    
    
    
}
