package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Class CrowMurder
 * @author yasiro01
 */
public class CrowMurder {
    private String filename;

    public CrowMurder(String filename) throws FileNotFoundException, IOException {
        this.filename = filename;
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = inputFile.readLine()) != null) {
            String[] lineContent = line.split(",");
            for (String item: lineContent) {
              ;
            }
        }
    }
    
    
}
