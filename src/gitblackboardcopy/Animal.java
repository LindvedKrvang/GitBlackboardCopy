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
public abstract class Animal 
{
    private int amountOfLegs;
    private String gender;
    
    public Animal(String gender, int amountOfLegs)
    {
        this.gender = gender;
        this.amountOfLegs = amountOfLegs;
        
    }
    
    public abstract void makeSound();
    
    public String getGender()
    {
        return gender;
    }
}
