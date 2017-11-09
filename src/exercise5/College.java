package exercise5;

/**
 * Class College
 * Task 5: Create a class College with the following private data members: String name, int rank. Implement setter method for the rank.
 * @author yasiro01
 */
public class College {
    private String college;
    private int rank;
    
    public College(String college, int rank){
        this.college = college;
        this.rank = rank;
    }
    public String getName(){
        return college;
    }
    public int getRank(){
        return rank;
    }
    public void setRank(int rank){
        this.rank = rank;
    }
    public String toString(){
        return String.format("%s is ranked #%s",college,rank);
    }
}
