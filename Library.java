/* This is a stub for the Library class */

import java.util.Hashtable;

public class Library extends Building {

  private Hashtable<String, Boolean> collection;
  String title;

    public Library(String name, String address, int floors) {
      super(name, address, floors); 
      System.out.println("You have built a library: 📖");
      Hashtable<String, boolean>;
    }

    public void addTitle(String title, boolean); {
      collection.put(key, value);
    }

    public String removeTitle(String title, boolean); { // return the title that we removed
      Hash_Table.remove(key, value);
      return title;
    }

    public void checkOut(String title);{

    }

    public void returnBook(String title); {

    }

    // returns true if the title appears as a key in the Libary's collection, false otherwise
    public boolean containsTitle(String title) {
      if (title :: collection) {
        return true;
      } else {
        return false;
      }
    }
    
    // returns true if the title is currently available, false otherwise
    public boolean isAvailable(String title) {

    }

    // prints out the entire collection in an easy-to-read way (including checkout status)
    public void printCollection() {
      System.out.println(collection);
    }

    public static void main(String[] args) {
      Library Neilson = new Library("Neilson Library", "7 Neilson Drive", 5);
      Neilson.addTitle("Animal Farm by George Orwell", true);
      Neilson.addTitle("Don Quixote by Miguel de Cervantes", true);
      Neilson.addTitle("Dune by Frank Herbert", true);


    }
  
  }