/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_10;



public class AudioBook extends media{
    String publisher;
    int yearOfRelease;
    public AudioBook(String title, String duration, String publisher, int yearOfRelease){
        this.title = title;
        this.duration = new time(duration);
        this.publisher = publisher;
        this.yearOfRelease = yearOfRelease;
    }
    public void printInfo(){
        System.out.println("Audio Book Title: " + title);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year Of Release: " + yearOfRelease);
        System.out.println("Duration: " + duration.displayTime());
    }
}
