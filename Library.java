import java.util.Hashtable;
import java.util.Enumeration;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;
  String title;
  Boolean status;

    public Library(String name, String address, int floors) {
      super(name, address, floors); 
      System.out.println("You have built a library: 📖");
      this.collection = new Hashtable<>();
      Enumeration<String> e = collection.keys();
    }

    public void addTitle(String title, Boolean status) {
      collection.put(title, status);
    }

    public String removeTitle(String title, Boolean status) { // return the title that we removed
      collection.remove(title, status);
      return title;
    }

    public void checkOut(String title, Boolean status) {
      // check if book is in library 
      // if book is -> update boolean of specified title to false (check out)
      // if book is not in the library -> error
    }

    public void returnBook(String title, Boolean status) {
      // if book is not in library -> update boolean of specified title to true (return)
      // if book is in the library -> error 
    }

    // returns true if the title appears as a key in the Libary's collection, false otherwise
    public boolean containsTitle(String title) {
      if (collection.contains(title)) {
        return true;
      } else {
        return false;
      }
    }
    
    // returns true if the title is currently available, false otherwise
    public boolean isAvailable(String title, Boolean status) {
      // checks boolean of given title
      return status; 
    }

    // prints out the entire collection in an easy-to-read way (including checkout status)
    public void printCollection() {
      // nice formatting here \/\/\/\/
      System.out.println("------------");
      System.out.println("Neilson Library's Collection:");
      // figuring out iterating over a hashtable: https://www.tutorialspoint.com/how-to-iterate-through-hashtable-in-java
      for (i :: e) {
        System.out.println(title);
      System.out.println("------------");
      }
    }

    public static void main(String[] args) {
      Library Neilson = new Library("Neilson Library", "7 Neilson Drive", 5);
      Neilson.addTitle("Animal Farm by George Orwell", true);
      Neilson.addTitle("Don Quixote by Miguel de Cervantes", true);
      Neilson.addTitle("Dune by Frank Herbert", true);
      Neilson.printCollection();
      System.out.println("Animal Farm is in the collection: " + Neilson.containsTitle("Animal Farm by George Orwell"));
    }
  
  }