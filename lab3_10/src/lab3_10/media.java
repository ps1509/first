package lab3_10;



class time{
    int hr;
    int min;
    int sec;
    public time(String T){
        String[] parts = T.split(":"); //spilts the string whenever ":" encountered and stores in parts[]
        hr = Integer.parseInt(parts[0]);
        min = Integer.parseInt(parts[1]); //parseInt converts string to integer 
        sec = Integer.parseInt(parts[2]);
    }
    public void printTime(){
        System.out.print(hr + ":" + min + ":" + sec);
    }
    public String displayTime(){
        return (hr + ":" + min + ":" + sec);
    }
}

public abstract class media {
    String title;
    time duration;
}

