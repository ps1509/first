/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_10;



public class PodcastEpisode extends media{
    int episodeNumber;
    public PodcastEpisode(int episodeNumber, String title, String duration){
        this.episodeNumber = episodeNumber;
        this.title = title;
        this.duration = new time(duration);
    }
    public void printInfo(){
        System.out.println(episodeNumber + ". " + title + " ("+duration.displayTime() + ") ");
    }
}
