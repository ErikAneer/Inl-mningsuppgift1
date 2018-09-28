/*
 * Java 2018
 */
package inlamningsuppgift1;

/**
 *
 * @author Erik Aneer
 */
public class Cat extends Mamal{
    
    @Override   // Användning av polymorfism 
    public void printPet(){
        System.out.println("Katten " + this.getPetName() 
                + " väger " + this.getPetWeight() + " kg.");
    }
    public int getPetFoodToGive(){  // Användning av interface-metod
        return (this.getPetWeight()*1000)/150;
    };
}
