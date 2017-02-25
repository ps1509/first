/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Puja Kumari
 */
public class Cat implements Vegetarian , Object{
    @Override
    public void getBehaviour(String sound){
       if(sound=="mew")
            System.out.println("Its a cat");
    }
    @Override
    public void getThingType(){

    }
    @Override
    public void IsVegetarian(String s) {
        if(s == "grass")
            System.out.println("Vegetarian animal");
        else 
            System.out.println("carnivorous");
        
    }
}
