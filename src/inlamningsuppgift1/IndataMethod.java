/*
 * Java 2018
 */
package inlamningsuppgift1;

import java.util.*;
import javax.swing.*;

/**
 * @author Erik Aneer
 */
public class IndataMethod {
    
    public static Pet validateIndata (List<Pet> animals){ 
        
        String message =  "Vilket djur ska få mat? Skriv in djurets namn: ";
        boolean again = true;
        Pet temp = null;
        
        while (again){
        String s = JOptionPane.showInputDialog(message);
            if (s == null || s.equals(""))
                System.exit(0);

                s = s .trim()
                      .toLowerCase();
                 
                for(Pet pet : animals){
                    if(pet.getPetName().toLowerCase().matches(s))
                        return pet;
                  } 
                JOptionPane.showMessageDialog(null, 
                                "Du har inte skrivit in namnet på ett djur vi har."
                                + " Försök igen");
                        again = true;
        }                                
        return temp; // Kan inte nås.
    }  
}
