/*
 * Javautveckling 2018
 */
package inlamningsuppgift1;

/**
 *
 * @author Erik Aneer
 */
public class Dog extends Mamal implements IPetFood{
    
    public Dog(String name, int weight){
        super (name, weight);
    }
    
    @Override
    public void printPet(){
        System.out.println("Hunden " + this.getPetName() 
                + " väger " + this.getPetWeight() + " kg.");
    }
    @Override
    public void printPetFoodToGive(){
        System.out.println("Hunden " + this.getPetName()+ " ska få " 
                + (this.getPetWeight()*1000)/100 + " gram hundfoder.");
    }
}
