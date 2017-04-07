/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_10;


public class Song extends media{
    String genre;
    public Song(String title, String duration, String genre){
        this.title = title;
        this.duration = new time(duration);
        this.genre = genre;
    }
    public void printInfo(){
        System.out.println(">> " + title + " ("+duration.displayTime() + ") " + "["+ genre + "] ");
    }
    public void getDetails(){
        System.out.println("Enter title: ");
        System.out.println("Enter duration: ");
    }
}

