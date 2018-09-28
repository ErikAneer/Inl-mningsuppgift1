/*
 * Javautveckling 2018
 */
package inlamningsuppgift1;

/**
 *
 * @author Erik Aneer
 */
public class Dog extends Mamal implements IPetFood{
    
    @Override
    public void printPet(){
        System.out.println("Hunden " + this.getPetName() 
                + " väger " + this.getPetWeight() + " kg.");
    }
    public int getPetFoodToGive(){
        return (this.getPetWeight()*1000)/100;
    }
}
