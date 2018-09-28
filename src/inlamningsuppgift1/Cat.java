/*
 * Java 2018
 */
package inlamningsuppgift1;

/**
 *
 * @author Erik Aneer
 */
public class Cat extends Mamal implements IPetFood{
    
    public Cat(String name, int weight){
        super (name, weight);
    }
    
    @Override   // Användning av polymorfism 
    public void printPet(){
        System.out.println("Katten " + this.getPetName() 
                + " väger " + this.getPetWeight() + " kg.");
    }
    @Override
    public void printPetFoodToGive(){  // Användning av interface-metod
        System.out.println("Katten " + this.getPetName()+ " ska få " 
                + (this.getPetWeight()*1000)/150 + " gram kattfoder.");
    };
}
