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
        
    }
    
    public int getNumberOfLegs()
    {
        int numberOfLegs = 0;
        
        for(Animal al : animalList)
        {
            numberOfLegs += 4;
        }
        
        return numberOfLegs;
    }
}
