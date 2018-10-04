
package inlamningsuppgift1;

import javax.swing.*;

abstract class Pet implements IPetFood{
    
         protected String name;   
         protected int weight;        
         public PetFoodType food;

         public enum PetFoodType {
                  CATFOOD ("kattfoder"), DOGFOOD("hundfoder"), SNAKEFOOD("ormpellets");

                  public final String foodType;

                  PetFoodType(String foodType){
                           this.foodType = foodType;
                  }
                  public String getPetFoodType(){
                           return foodType;
                  }
         }

         public Pet(String name, int weight){
                  this.name = name;                     
                  this.weight = weight; 
         }
         
         public String getPetName(){ 
                  return name;
         }

         public int getPetWeight(){ 
                  return weight;
        }

         public void printPet(){
                  JOptionPane.showMessageDialog(null,this.getPetName()
                                           + " väger " + this.getPetWeight() + " kg.");
         } 
}
