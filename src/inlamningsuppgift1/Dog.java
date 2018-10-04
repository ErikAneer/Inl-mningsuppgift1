
package inlamningsuppgift1;

import javax.swing.*;

public class Dog extends Mammal{
    
         public Dog(String name, int weight){
                  super (name, weight);
                  this.food = food.DOGFOOD;
         }
    
         @Override   // Användning av polymorfism i instansmetod.
         public void printPet(){
         JOptionPane.showMessageDialog(null, "Hunden " + this.getPetName() 
                                                       + " väger " + this.getPetWeight() + " kg.");
         }
    
         @Override  // Användning av polymorfism i interfacemetod.
         public void printPetFoodToGive(){
         JOptionPane.showMessageDialog(null,  "Hunden " + this.getPetName()+ " ska få " 
                    + (this.getPetWeight()*1000)/100 +" gram " + food.getPetFoodType() + ".");
         }
}
