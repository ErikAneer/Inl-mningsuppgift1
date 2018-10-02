/*
 * Java 2018
 */

package inlamningsuppgift1;

import java.util.*;
import javax.swing.JOptionPane;

public class Inlamningsuppgift1 {
    
    /**
     * Husdjurshotellet Healthy Pets.
     */
    
    public static void PrintFood(IPetFood animal){  
        animal.printPetFoodToGive(); // Anvädning av polymorfism.
    }
    public static void main(String[] args) {
       
        List<Pet> healthyPets = new LinkedList(); 
        
        Dog hund1 = new Dog("Sixten", 5); 
        Dog hund2 = new Dog("Dogge", 10);
        Cat katt1 = new Cat("Venus", 5);
        Cat katt2 = new Cat("Ove", 3);
        Snake orm1 = new Snake("Hypno", 1);
        
        healthyPets.add(hund1);
        healthyPets.add(hund2);
        healthyPets.add(katt1);
        healthyPets.add(katt2);
        healthyPets.add(orm1);
        
        Pet temp = IndataMethod.validateIndata(healthyPets);
        
        PrintFood(temp); 
    }
}  
