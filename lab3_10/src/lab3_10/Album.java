/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_10;


import java.util.List;
import java.util.ArrayList;

public class Album {
    String albumName;
    String albumArtist;
    String publisher;
    int yearOfRelease;
    int noOfTracks;
    List<Song> songs = new ArrayList();
    public Album(String albumName, String albumArtist, String publisher, int yearOfRelease, int noOfTracks){
        this.albumName = albumName;
        this.publisher = publisher;
        this.noOfTracks = noOfTracks;
        this.yearOfRelease = yearOfRelease;
        this.albumArtist = albumArtist;
    }
    public void addSong(String name, String duration, String genre){ 
        songs.add(new Song(name, duration, genre));
    }
    public void printInfo(){
        System.out.println("Album Name: " + albumName);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year Of Release: " + yearOfRelease);
        System.out.println("Number of Tracks: " + noOfTracks);
        for (Song temp : songs) {  // printing from the "songs" list
            temp.printInfo();
        }
    }
}
