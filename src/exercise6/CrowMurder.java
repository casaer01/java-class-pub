package exercise6;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Class CrowMurder
 * @author yasiro01
 */
public class CrowMurder {
    private final ArrayList<Crow> crowList;
    
    public CrowMurder (String filename) throws FileNotFoundException, IOException {
        crowList = new ArrayList();
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = inputFile.readLine()) != null) {
        /* Turn each line into an array of Strings and print it */
        String[] lineContent = line.split(",");
        for (String item: lineContent) {
          if(lineContent[3] == "Frog"){
              crowList.add(new Crow(Integer.parseInt));
          }
        }
    }
        
        
}
    public int size(){
        return crowList.size();
    }
    
}
