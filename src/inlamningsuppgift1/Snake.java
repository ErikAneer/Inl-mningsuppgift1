/*
 * Java 2018
 */
package inlamningsuppgift1;

/**
 *
 * @author Erik Aneer
 */
public class Snake extends Reptile {
    
    @Override   // Användning av polymorfism
    public void printPet(){
        System.out.println("Ormen " + this.getPetName() 
                + " väger " + this.getPetWeight() + " kg.");
    }
    public int getPetFoodToGive(){
        return 20;
    }
}
