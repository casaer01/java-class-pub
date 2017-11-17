package exercise8;

/**
 * Class Item
 * @author casaer01
 */
public abstract class Item {
  protected final long id;
  protected final String title;
  protected int quantity;

    public Item(long id, String title, int quantity) {
        this.id = id;
        this.title = title;
        this.quantity = quantity;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
  /**
   * Get the item availability
   * @return true if quantity > 0
   */
  public boolean isAvailable() {
    boolean isAvaible = false;
    if (quantity > 0) {
        isAvaible = true;
    }
    return isAvaible;
  }

  /**
   * Check out an item (decrease quantity by 1, if possible
   */
  public void checkout() {
    if (this.quantity >= 2){
        this.quantity -= 1;   
    }
  }

  /**
   * Check in an item
   */
  public void checkin() {
      this.quantity += 1;
  }
  
  @Override
  public String toString() {
      String printout;
      if (quantity >= 2){
          printout = String.format("We have %s copies of %s", quantity, title);
      }else {
          printout = String.format("We have a copy of %s", title);
      }
      return printout;
  }

  /**
   * Get the item information
   * @return item information, type-specific
   */
  public abstract String getInfo();
  
}
