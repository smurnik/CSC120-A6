/* This is a stub for the Library class */
import java.util.Hashtable;
import java.util.Set;

public class Library extends Building{

   private Hashtable<String, Boolean> collection;

   //constructors
    public Library(String name, String address, int nFloors) {
      super(name, address, nFloors);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }

  public void addTitle(String title){ //adds book
    this.collection.put(title, true);
    System.out.println("The book " + title + " has been added");
  }


  public String removeTitle(String title){ // removes book and returns the title that we removed
    this.collection.remove(title);
    System.out.println("The book " + title + " has been removed");
    return title;
  }

  public void checkOut(String title){ //checks out book and updates status
    if (collection.contains(title)){
      collection.replace(title, true, false);
      System.out.println("The book " + title + " has been checked out");
    } else{
        System.out.println("The book " + title + " is not available");
    }
  }

  public void returnBook(String title){ //returns book and updates status
    collection.replace(title, false, true);
    System.out.println("The book " + title + " has been returned.");
  }

  public boolean containsTitle(String title){ // returns true if the title appears as a key in the Libary's collection, false otherwise
    if (collection.contains(title)){
        System.out.println("The library has the book " + title);
        return true;
      }
      System.out.println("Unfortunatly the library does not have the book " + title);
      return false;
  }
  public boolean isAvailable(String title){ // returns true if the title is currently available, false otherwise
    if (collection.contains(title) == true){
      System.out.println("The book " + title + " is available");
      return true;
   } else{
    System.out.println("The book " + title + " is not available");
    return false;
    }
  }
    public void printCollection(){ // prints out the entire collection in an easy-to-read way (including checkout status)
      System.out.print(this.collection);
      Set<java.lang.String> keys = this.collection.keySet();
      
      for (String key : keys) {
        System.out.println("Is " + key + " available: " + this.collection.get(key));
       }

     }
    
    public static void main(String[] args) {
      Library myLibrary = new Library("Neilson", "7 Neilson Drive, Northampton, MA 01063", 4);
      myLibrary.addTitle("Heart of Darkness");
      //myLibrary.removeTitle("Heard of Darkness");
      //myLibrary.checkOut("Heart of Darkness");
      //myLibrary.containsTitle("Heart of Darkness");
      //myLibrary.isAvailable("Heart of Darkness");
      //myLibrary.printCollection();
    }
  
  }
