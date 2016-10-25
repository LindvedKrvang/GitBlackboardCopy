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
public class Bear extends Animal
{
    private String sound;
    
    public Bear(String gender, int amountOfLegs, String sound) 
    {
        super(gender, amountOfLegs);
        this.sound = sound;
    }


    @Override
    public void makeSound() 
    {
        System.out.println(sound);
    }

}
