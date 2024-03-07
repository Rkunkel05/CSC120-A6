import java.util.Hashtable;
import java.util.Enumeration;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;
  String title;
  Boolean status;

    // Creates library building
    public Library(String name, String address, int floors) {
      super(name, address, floors); 
      System.out.println("You have built a library: 📖");
      this.collection = new Hashtable<>();
    }

    // Adds title to collection
    public void addTitle(String title, Boolean status) {
      collection.put(title, status);
    }

    // Checks to see if title is in collection -> Removes it 
    public String removeTitle(String title) { 
      if (collection.containsKey(title)) {
        collection.remove(title, status);
        return title;
      }
    }

    // Checks if title is in library -> Updates status to false, otherwise prints error
    public void checkOut(String title) {
      if (collection.containsKey(title) & status == true) {
        status = false;
      } else {
        throw new RuntimeException(title + "is already checked out!");
      }
    }

    // Checks if title is out of library -> Updates status to true, otherwise prints error
    public void returnBook(String title) {
      if (!collection.containsKey(title) & status == true) {
        status = true;
      } else {
        throw new RuntimeException(title + "is already returned!");
      }
    }

    // returns true if the title appears as a key in the Libary's collection, false otherwise
    public boolean containsTitle(String title) {
      if (collection.containsKey(title)) {
        return true;
      } else {
        return false;
      }
    }
    
    // returns true if the title is currently available, false otherwise
    public boolean isAvailable(String title) {
      return status; 
    }

    // prints out the entire collection in an easy-to-read way (including checkout status)
    public void printCollection() {
      System.out.println("------------");
      System.out.println("Neilson Library's Collection:");
      // figuring out iterating over a hashtable: https://www.tutorialspoint.com/how-to-iterate-through-hashtable-in-java
      Enumeration<String> enumeration = collection();
        while (enumeration.hasMoreElements()) {
            String title = enumeration.nextElement();
            System.out.println(title);
        }
      System.out.println("------------");
    }

    public static void main(String[] args) {
      Library Neilson = new Library("Neilson Library", "7 Neilson Drive", 5);
      Neilson.addTitle("Animal Farm by George Orwell", true);
      Neilson.addTitle("Don Quixote by Miguel de Cervantes", true);
      Neilson.addTitle("Dune by Frank Herbert", true);
      Neilson.printCollection();
      System.out.println("Animal Farm is in the collection: " + Neilson.containsTitle("Animal Farm by George Orwell"));
      System.out.println("Don Quixote is available to check out: " + Neilson.isAvailable("Don Quixote by Miguel de Cervantes"));
      Neilson.checkOut("Don Quixote by Miguel de Cervantes");

    }
  
  }