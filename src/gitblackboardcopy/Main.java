/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitblackboardcopy;

/**
 *
 * @author Rasmus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Zoo z = new Zoo();
        
        Lion l = new Lion("male", 4, "Rawr");
        Bear b = new Bear("male", 4, "Raowr");
        
        z.getAnimalList().add(l);
        z.getAnimalList().add(b);
        
        System.out.println(z.getNumberOfGender("male"));
        System.out.println(z.getNumberOfGender("female"));
        System.out.println(z.countLegs());;
        z.allAnimalsMakeSound();
        
    }
    
}
