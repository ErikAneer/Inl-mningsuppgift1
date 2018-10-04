
package inlamningsuppgift1;

import javax.swing.*;

public class Dog extends Mammal{
    
         public Dog(String name, int weight){
                  super (name, weight);
                  this.food = food.DOGFOOD;
         }
    
         @Override  // Användning av polymorfism i interfacemetod.
         public void printPetFoodToGive(){
         JOptionPane.showMessageDialog(null,  "Hunden " + getPetName()+ " ska få " 
                    + (getPetWeight()*1000)/100 +" gram " + food.getPetFoodType() + ".");
         }
}
