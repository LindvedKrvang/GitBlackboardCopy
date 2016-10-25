/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitblackboardcopy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rasmus
 */
public class Zoo 
{
    private List<Animal> animalList = new ArrayList();
    
    
    
    public void allAnimalsMakeSound()
    {
        for(Animal am : animalList)
        {
            am.makeSound();
        }
    }
    
    public List<Animal> getAnimalList()
    {
        return animalList;
    }
    
    public int countLegs()
    {
        int numberOfLegs = 0;
        
        for(Animal al : animalList)
        {
            numberOfLegs += 4;
        }
        
        return numberOfLegs;
    }
    
    public String getNumberOfGender(String gender)
    {
        int amountOfMaleGender = 0;
        int amountOfFemaleGender = 0;
        
        for(Animal am : animalList)
        {
            if(am.getGender().equals("male"))
            {
                amountOfMaleGender++;
            }
            
            if(am.getGender().equals("female"))
            {
                amountOfFemaleGender++;
            }
        }
        if(gender.equals("male"))
        {
            return "There is " + amountOfMaleGender + " male animals.";
        }
        else
        {
            return "There is " + amountOfFemaleGender + " female animals.";
        }
    }
}
