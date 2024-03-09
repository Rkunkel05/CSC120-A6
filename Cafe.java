/* This is a stub for the Cafe class */

public class Cafe extends Building {

    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;

    public Cafe(String name, String address, int floors, int nCoffeeOunces, int nSugarPackets, int nCups, int nCreams) {
        super(name, address, floors); 
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCups = nCups;
        this.nCreams = nCreams;
        System.out.println("You have built a cafe: ☕");
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces += nCoffeeOunces;
        this.nSugarPackets += nSugarPackets;
        this.nCreams += nCreams;
        this.nCups += nCups;
    }

    // Confused by this... Erm...
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (size <= nCoffeeOunces && nSugarPackets <= this.nSugarPackets && nCreams <= this.nCreams) {
            System.out.println("Selling coffee...");
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
        }
        else {
            System.out.println("Not enough in stock... \nRestocking...");
            restock(20,50,25,15);
        }
    }
    
    public static void main(String[] args) {
        Cafe Woodstar = new Cafe("Woodstar Cafe", "60 Masonic St", 1, 20, 50, 25, 15);
        System.out.println(Woodstar);
        // Printing the stock
        System.out.println("-----------");
        System.out.println("Wood star has " + Woodstar.nCoffeeOunces + " ounces of coffee, " + Woodstar.nSugarPackets + " packets of sugar, " + Woodstar.nCreams + " 'splashes' of cream, " + "and " + Woodstar.nCups + " cups of coffee.");
        System.out.println("-----------");
        Woodstar.sellCoffee(10, 5, 13);
        System.out.println("-----------");
        System.out.println("Wood star has " + Woodstar.nCoffeeOunces + " ounces of coffee, " + Woodstar.nSugarPackets + " packets of sugar, " + Woodstar.nCreams + " 'splashes' of cream, " + "and " + Woodstar.nCups + " cups of coffee.");
        System.out.println("Wood star has " + Woodstar.nCups + " cups of coffee.");
        System.out.println("-----------");
        Woodstar.sellCoffee(10, 5, 13);
        System.out.println("Wood star has " + Woodstar.nCoffeeOunces + " ounces of coffee, " + Woodstar.nSugarPackets + " packets of sugar, " + Woodstar.nCreams + " 'splashes' of cream, " + "and " + Woodstar.nCups + " cups of coffee.");
        System.out.println("-----------");
    }
    
}
