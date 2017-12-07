package exercise6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Class CrowMurder
 * @author casaer01
 */
public class CrowMurder {
    private final ArrayList<Crow> crowList;

    public CrowMurder(String filename) throws FileNotFoundException, IOException {
        crowList = new ArrayList();
        BufferedReader inputFile = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = inputFile.readLine()) != null) {
            String[] lineContent = line.split(",");
            for (String item: lineContent) {
                if ("Crow".equals(lineContent[2])){
                    crowList.add(new Crow(lineContent[0],Integer.parseInt(lineContent[1])));
                }
              
            }
        }
        for (Crow crow:crowList) {
            System.out.println(crow);
        }
    }
    public int size() {
        return crowList.size();
    }
    
    public Crow getChief() {
        int minAge = 0;
        Crow maxCrow = new Crow("crow",0); 
        for (Crow crow:crowList){
            if (crow.getAge() > minAge){
                minAge = crow.getAge();
                maxCrow = crow;
            }
        }
        return maxCrow;
    }
    
}
