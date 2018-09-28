/*
 * Java 2018
 */
package inlamningsuppgift1;

/**
 *
 * @author Erik Aneer
 */
public class Snake extends Reptile implements IPetFood {
    
    public Snake(String name, int weight){
        super (name, weight);
    }
    
    @Override   // Användning av polymorfism
    public void printPet(){
        System.out.println("Ormen " + this.getPetName() 
                + " väger " + this.getPetWeight() + " kg.");
    }
    @Override
    public void printPetFoodToGive(){
        System.out.println("Ormen " + this.getPetName()
                + " ska få 20 gram ormpellets.");
    }
}
