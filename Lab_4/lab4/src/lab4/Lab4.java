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
public class Lab4 {

   
    public static void main(String[] args) {
        System.out.println(args[0] + " " + args[1]);
        Animal obj = new Animal("Deer","cluck");
        Deer d = new Deer();
        obj.getType();
        obj.getSound();
        d.getBehaviour("cluck");
        d.IsVegetarian("grass");
        Animal obj1 = new Animal("Cat","mew");
        obj1.getType();
        obj1.getSound();
        Animal obj2 = new Animal("Tiger","bark");
        obj2.getType();
        obj2.getSound();
        
        
    }
}
    

