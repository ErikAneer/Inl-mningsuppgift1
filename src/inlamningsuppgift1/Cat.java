
package inlamningsuppgift1;

import javax.swing.*;

public class Cat extends Mammal{
    
         public Cat(String name, int weight){
                  super (name, weight);
                  this.food = food.CATFOOD; 
         }
    
         @Override // Användning av polymorfism i interfacemetod.
         public void printPetFoodToGive(){ 
         JOptionPane.showMessageDialog(null, "Katten " +getPetName()+ " ska få " 
                + (getPetWeight()*1000)/150 + " gram " + food.getPetFoodType() + ".");
         }
}
