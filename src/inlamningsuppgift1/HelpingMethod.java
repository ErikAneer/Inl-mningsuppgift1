
package inlamningsuppgift1;

import java.util.*;
import javax.swing.*;

public class HelpingMethod {
    
         public static Pet askUserForPetName( List<Pet> animals){
                 
                  boolean again = true;
                  Pet tempPet = null;
                  outer: while (again){

                           String input = JOptionPane.showInputDialog( "Vilket djur ska få mat? Skriv in djurets namn: ");

                           if (input == null || input.equals(""))
                                    System.exit(0);

                            input = input .trim()
                                       .toLowerCase();

                           for(Pet pet : animals){
                                  if(pet.getPetName().toLowerCase().matches(input)){
                                           tempPet = pet;
                                           again = false;
                                           break outer;
                                    }
                           } 
                           JOptionPane.showMessageDialog(null,  "Du har inte skrivit in namnet på ett djur vi har."
                                                                                          + "\nKontrollera stavningen och försök igen");
                                                                                          again = true; 
                  }           
         return tempPet;
         }
}
