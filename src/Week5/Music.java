package Week5;
import java.util.ArrayList;


public class Music {
    private String  artistname;
    private String song ;
    private Int playcount;

    public Music(String artistname, String song, int playcount)
    {
        this.artistname = artistname;
        this.song = song;
        this.playcount = playcount;

    }
    public void print(){
        System.out.println("ID: " +this.artistname);
        System.out.println("Name: " +this.song);
        System.out.println("Name: " +this.playcount);

    }
}
