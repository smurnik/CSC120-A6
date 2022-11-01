import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building{

  private ArrayList<String> residents; // The <String> tells Java what kind of data we plan to store IN the ArrayList
  private boolean hasDiningRoom; // param
  

  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    //constructors
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
    
    System.out.println("You have built a house: 🏠");
  }


  public boolean hasDiningRoom(){ //checks to see if there is a dining room
    if (hasDiningRoom == true){
      System.out.println("There is a diningroom in this house");
      return true;
    }
    return hasDiningRoom;
  }
  public int nResidents(){ //Outputs the number of residents
    if (residents.size()> 1){
      System.out.println("There are " + residents.size() + "residents");

    } else if (residents.size() == 1) {
      System.out.println("There is " + residents.size() + " resident");

    } else {
      System.out.println("There are no residents in this house");
    }
    return residents.size();
  }


  public void moveIn(String name){ //moves someone in
    residents.add(name);
    System.out.println(name + " is now a resident");

  }

  public String moveOut(String name){ // return the name of the person who moved out
    if (residents.contains(name)){
      residents.remove(name);
      System.out.println(name + "is no longer a resident");
      return (name);
    } else {
      System.out.println("There is no resident that goes by that name in this house");
      return("There is no resident that goes by that name in this house");
    }
    
  }
  public boolean isResident(String person){ // checks to see if a person is a resident
    if (residents.contains(person)){
      System.out.println(person + " is a resident");
      return true;
    } else{
      System.out.println(person + " is not a resident");
      return false;
    }
  }

    public void printResidents(){ // prints out residents in an easy-to-read way (including checkout status)
      System.out.print(this.residents);
     }

  public static void main(String[] args) {
    House myHouse = new House("Cushing", "100 Elm Street", 4, true);
    myHouse.moveIn("Silas");
    myHouse.moveIn("Reilly");
   // myHouse.moveOut("Silas");
   // myHouse.hasDiningRoom();
    //myHouse.nResidents();
    //myHouse.isResident("Silas");
    myHouse.printResidents();
  }

}
