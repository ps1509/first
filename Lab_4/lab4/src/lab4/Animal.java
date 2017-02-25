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
public class Animal {
    String type,sound;
    Animal(String t,String s){
        type=t;
        sound=s;
    }
    void getType(){
        if(type =="Deer"|| type =="Cat"|| type =="Chick")
            System.out.println("Valid farm animal"+" "+ type);
        else
            System.out.println("invalid farm animal");
        
    }
    void getSound(){
        if(sound=="moo" ||sound =="mew" || sound=="cluck")
            System.out.println("Valid farm animal's sound"+ " "+ sound);
        else
         System.out.println("invalid farm animal's sound");   
    }
}
