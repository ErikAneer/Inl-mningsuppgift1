/*
 * Java 2018
 */
package inlamningsuppgift1;

/**
 *
 * @author Erik Aneer
 */
abstract class Pet {
    
    private String name;
    private int weight;
    
    public Pet(){} // Default constructor, needed at all?
    
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
        System.out.println(this.getPetName() + " väger " + this.getPetWeight() + " kg.");
    } 
}
