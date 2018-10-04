
package inlamningsuppgift1;

import javax.swing.*;

abstract class Pet implements IPetFood{
    
         private String name;   // Inkapsling av instansvariabler.(skydda genom åtkomstdirektiv och get-metoder nedan).
         private int weight;        
         protected PetFoodType food; // Satt till protected föratt kunna komma åt djurfoder-variabeln.

         public enum PetFoodType {
                  CATFOOD ("kattfoder"), DOGFOOD("hundfoder"), SNAKEFOOD("ormpellets");

                  public final String foodType;

                  PetFoodType(String foodType){
                           this.foodType = foodType;
                  }
                  public String getPetFoodType(){ // Inkapsling, get-metod för att komma åt  djurfoder-variabeln.
                           return foodType;
                  }
         }

         public Pet(String name, int weight){
                  this.name = name;                     
                  this.weight = weight; 
         }
         
         public String getPetName(){ // Inkapsling, get-metod för att komma åt instansvariabel.
                  return name;
         }

         public int getPetWeight(){ // Inkapsling, get-metod för att komma åt instansvariabel.
                  return weight;
        }
}
