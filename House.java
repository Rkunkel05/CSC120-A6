import java.util.ArrayList;

public class House extends Building {

  private ArrayList<String> residents;
  private boolean hasDiningRoom;

  public House(String name, String address, int floors, boolean hasDiningRoom) {
    super(name, address, floors); 
    this.hasDiningRoom = hasDiningRoom;
    this.residents = new ArrayList<String>();
    System.out.println("You have built a house: 🏠");
  } 

  // checks if there's a dining room in the house 
  public boolean hasDiningRoom() {
    return hasDiningRoom;
  }
  
  public int nResidents() {
    return residents.size();
  }

  public void moveIn(String name) {
    if (!residents.contains(name)) {
      residents.add(name);
      System.out.println(name + " has moved in!");
    } else {
      throw new RuntimeException(name + " already lives here!");
    }
  }

  public String moveOut(String name){
    if (residents.contains(name)) {
      residents.remove(name);
      return name + " has move out.";
    } else {
      throw new RuntimeException(name + " doesn't live in this house.");
    }
  }

  public boolean isResident(String person) {
    return residents.contains(person);
  }

  public static void main(String[] args) {
    House Lamont = new House("Lamont House", "17 Prospect St.", 3, true);
    System.out.println("Lamont has a dining room: " + Lamont.hasDiningRoom());
    System.out.println("Moving residents in...");
    Lamont.moveIn("Rachel");
    Lamont.moveIn("Leah");
    System.out.println("Lamont has: " + Lamont.nResidents() + " resident(s).");
    System.out.println("Rachel lives in Lamont: " + Lamont.isResident("Rachel"));
    System.out.println("Moving a resident out...");
    Lamont.moveOut("Leah");
    System.out.println("Lamont has: " + Lamont.nResidents() + " resident(s).");
    System.out.println("Leah lives in Lamont: " + Lamont.isResident("Leah"));
  }

}