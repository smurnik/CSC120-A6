/* This is a stub for the Cafe class */
public class Cafe extends Building {

    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory

    //constructors
    public Cafe(String name, 
                String address, 
                int nFloors, 
                int nCoffeeOunces, 
                int nSugarPackets, 
                int nCreams, 
                int nCups) {

        super(name, address, nFloors);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams){ //sells coffee, checks inventory, restocks if necessary
        if (this.nCoffeeOunces >= size && this.nSugarPackets >= nSugarPackets && this.nCreams >= nCreams && this.nCups >= nCups){
            this.nCoffeeOunces -= size;
            this.nSugarPackets -= nSugarPackets;
            this.nCreams -= nCreams;
            this.nCups -= 1;
            System.out.println("Order successful: one " + size + " oz coffee with " + nSugarPackets + " sugar and " + nCreams + " cream");
        } else {
            System.out.println("Sorry we are out, please try again later");
            restock(size, nSugarPackets, nCreams, nCreams);

        }
    }

    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){ //restocks inventory
        this.nCoffeeOunces += 640;
        this.nSugarPackets += 75;
        this.nCreams += 75;
        this.nCups += 40;
    }
    
    public static void main(String[] args) {
        Cafe compassCafe = new Cafe("compass cafe", "7 Neilson Drive, Northampton, MA 01063", 4, 640, 75, 75, 40);
        //compassCafe.sellCoffee(16, 1, 3);
        compassCafe.sellCoffee(700, 80, 80);
    }
    
}
