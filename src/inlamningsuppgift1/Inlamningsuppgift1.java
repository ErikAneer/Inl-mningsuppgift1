/*
 * Java 2018
 */

package inlamningsuppgift1;

import java.util.*;

public class Inlamningsuppgift1 {
    
    /**
     * @param args the command line arguments
     */
    
    public static void PrintFood(IPetFood animal){
        animal.printPetFoodToGive();
    }
    
    
    public static void main(String[] args) {
       
        // Skapa instans av husdjurshotell(Healthy Pets).
        List<Pet> healthyPets = new LinkedList();
        // Skapa instanser av djuren.
        
        
        Dog hund1 = new Dog("Sixten", 5); // skapande av objekt genom polymorfism.
        Dog hund2 = new Dog("Dogge", 10);
        Cat katt1 = new Cat("Venus", 5);
        Cat katt2 = new Cat("Ove", 3);
        Snake orm1 = new Snake("Hypno", 1);
        
        healthyPets.add(hund1);
        healthyPets.add(hund2);
        healthyPets.add(katt1);
        healthyPets.add(katt2);
        healthyPets.add(orm1);
        
        // Be om inmatning av vilket husdjur som ska utfodras.
        //  ”Vilket djur ska få mat?” 
        
        
        
        // Anropa metod mata djur.
        PrintFood(katt1);
        PrintFood(hund1);
        // Skriv ut resultatet, djur (namn) ska ha XXX gr av typen mat.
        
        
        
    }

}
