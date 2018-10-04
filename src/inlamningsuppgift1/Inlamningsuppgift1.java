
package inlamningsuppgift1;

import java.util.*;
import javax.swing.JOptionPane;

public class Inlamningsuppgift1 {
    
    public static void main(String[] args) {
        
         List<Pet> healthyPets = new LinkedList(); 
        
         healthyPets.add(new Dog("Sixten", 5));
         healthyPets.add(new Dog("Dogge", 10));
         healthyPets.add(new Cat("Venus", 5));
         healthyPets.add(new Cat("Ove", 3));
         healthyPets.add(new Snake("Hypno", 1));
        
         boolean again = true;
         
         while (again){
             
                  Pet petToFeed = HelpingMethod.askUserForPetName(healthyPets);

                   petToFeed.printPetFoodToGive(); // Användning av polymorfism då metoden käner av vilken typ av "pet" det är.
         }
    }
}  
