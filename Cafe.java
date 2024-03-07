/* This is a stub for the Cafe class */
public class Cafe extends Building {

    public Cafe(String name, String address, int floors) {
        super(name, address, floors); 
        System.out.println("You have built a cafe: ☕");
    }
    
    public static void main(String[] args) {
        Cafe Woodstar = new Cafe("Woodstar Cafe", "60 Masonic St", 1);
        System.out.println(Woodstar);
    }
    
}
