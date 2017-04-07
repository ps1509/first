package lab3_10;

public class Lab3_10 {
    
    public static void main(String[] args) {
       System.out.println("Album Demo ============================ ");
        Album PlanetPit = new Album("Planet Pit", "Pitbull", "J Records",2011, 3);
        PlanetPit.addSong("Rain Over Me","0:03:51", "Hip-Hop/Rap");
        PlanetPit.addSong("Give Me Everything", "0:04:13", "Hip-Hop");
        PlanetPit.addSong("Hey Baby (Drop it to the Floor)", "0:03:54", "Hip-Hop/Rap");
        PlanetPit.printInfo();
        System.out.println("\nPodcast Demo ============================= ");
        Podcast Ted = new Podcast(Podcast.updateFrequency.Weekly, "TED", "Talk Show");
        Ted.createEpisode(1, "Big Data Revolution", "00:52:30");
        Ted.createEpisode(2, "Failure is an Option", "01:24:57");
        Ted.printInfo();
        System.out.println("\nAudio Book Demo ============================= ");
        AudioBook HarryPotter = new AudioBook("Harry Potter", "03:25:41", "JK Recording Studio", 2006);
        HarryPotter.printInfo();
    }
    
}
