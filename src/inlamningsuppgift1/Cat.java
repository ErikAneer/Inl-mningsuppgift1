/*
 * Java 2018
 */
package inlamningsuppgift1;

import javax.swing.*;

/**
 *
 * @author Erik Aneer
 */
public class Cat extends Mamal{
    
    public Cat(String name, int weight){
        super (name, weight);
    }
    
    @Override   // Användning av polymorfism i instansmetod.
    public void printPet(){
         JOptionPane.showMessageDialog(null,"Katten " + this.getPetName() 
                + " väger " + this.getPetWeight() + " kg.");
    }
    @Override // Användning av polymorfism i interfacemetod.
    public void printPetFoodToGive(){ 
        JOptionPane.showMessageDialog(null, "Katten " + this.getPetName()+ " ska få " 
                + (this.getPetWeight()*1000)/150 + " gram kattfoder.");
    };
}
