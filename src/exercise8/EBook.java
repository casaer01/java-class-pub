package exercise8;

/**
 * Class EBook
 * MediaLIbrary code 4
 * @author casaer01
 */
public class EBook extends Book {
    private final String format;

    public EBook(String format, String author, int publishingYear, long id, String title) {
        super(author, publishingYear, id, title, 1);
        this.format = format;
    }


    /**
    * Get the book format
    * @return the value of format
    */
    public String getFormat() {
    return format;
    }

    
    @Override
    public void checkin() { }

    @Override
    public void checkout() { }

    @Override
    public String getInfo() {
        return String.format("%s (%s). %s is available for %s", author, publishingYear, title, format);
    }
    //Hyeonseo Lee (2015). The Girl with Seven Names is available for Kindle
}
