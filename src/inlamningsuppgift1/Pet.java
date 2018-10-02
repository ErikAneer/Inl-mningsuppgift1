/*
 * Java 2018
 */
package inlamningsuppgift1;

import javax.swing.*;
/**
 * @author Erik Aneer
 */
abstract class Pet implements IPetFood{
    
    protected String name;    // inkapsling av variabel genom protected
    protected int weight;        // inkapsling av variabel genom protected
    
    public Pet(String name, int weight){ // För att förhindra skapande av tomma objekt
        this.name = name;                       // finns ingen default-konstruktor.
        this.weight = weight;                    
    }
    public void setName(String name){ // setter för att kunna justera felaktigt namn.
        this.name = name;
    }
        public void setWeight(int weight){ // setter för att kunna justera vikt.
        this.weight = weight;
    }
    public String getPetName(){ 
        return name;
    }
    public int getPetWeight(){ 
        return weight;
    }
    public void printPet(){
         JOptionPane.showMessageDialog(null,this.getPetName() + " väger " + this.getPetWeight() + " kg.");
    } 
}
