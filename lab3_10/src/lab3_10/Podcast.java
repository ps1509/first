/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_10;


import java.util.List;
import java.util.ArrayList;

public class Podcast{
    String author;
    String genre;
    public enum updateFrequency{  //enum for collection of constants
        Daily, Weekly, Unchecked
    };
    updateFrequency freq;
    List<PodcastEpisode> episodeList = new ArrayList();
    public Podcast(updateFrequency freq, String author, String genre){
        this.author = author;
        this.freq = freq;
        this.genre = genre;
    }
    public void createEpisode(int episodeNumber, String title, String duration){
        episodeList.add(new PodcastEpisode(episodeNumber, title, duration));
    }
    public void printInfo(){
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Number of Episodes: " + episodeList.size());
        System.out.println("Frequency: " + freq);
        for(PodcastEpisode epd : episodeList){
            epd.printInfo();
        }   
    }
}
