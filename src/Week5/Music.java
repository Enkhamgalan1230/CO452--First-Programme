package Week5;
import java.util.ArrayList;


public class Music {
    private String  artistname;
    private String song ;
    private int playcount;
    

    public Music(String artistname, String song, int playcount)
    {
        this.artistname = artistname;
        this.song = song;
        this.playcount = playcount;

    }
    public void print(){
        System.out.println("Artist name: " +this.artistname + "\tSong name: " +this.song + "\tPlay count: " +this.playcount );
        

    }
    public String getname() {
        return artistname; 
    }
     public int getPlayCount() {
        return playcount; 
     }
}
