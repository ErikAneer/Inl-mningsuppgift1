/*
 * Java 2018
 */
package inlamningsuppgift1;

import javax.swing.*;
/**
 *
 * @author Erik Aneer
 */
public class Snake extends Reptile {
    
    public Snake(String name, int weight){
        super (name, weight);
    }
    
    @Override    // Användning av polymorfism i instansmetod.
    public void printPet(){
         JOptionPane.showMessageDialog(null,"Ormen " + this.getPetName() 
                + " väger " + this.getPetWeight() + " kg.");
    }
    @Override   // Användning av polymorfism i interfacemetod.
    public void printPetFoodToGive(){
        JOptionPane.showMessageDialog(null,"Ormen " + this.getPetName()
                + " ska få 20 gram ormpellets.");
    }
}
