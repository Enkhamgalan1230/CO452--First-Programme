package Week5;
import java.util.ArrayList;
import java.util.Iterator;

import helpers.InputReader;
public class CW1 {
     public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        Music ariana = new Music( "Ariana Grande", "Into you     ", 955507809);
        Music xxxtentacion = new Music( "XXXTENTACION", "SAD          ", 1186079489);
        Music biggie = new Music( "Notorious BIG", "Juicy        ", 486309193);
        Music kendrick = new Music( "Kendrick Lamar", "Money tree    ", 114593544);
        Music pac = new Music( "2Pac           ", "Hit 'Em Up   ", 561790810);
        Music eminem = new Music( "Eminem     ", "Mockingbird    ", 646154834);
        Music drake = new Music( "Drake        ", "God's Plan    ", 1452369081);
        Music travis = new Music( "Travis Scott", "SICKO MODE    ", 1048820838);
        Music joji = new Music( "Joji         ", "YEAH RIGHT    ", 143051257);
        Music lilpeep = new Music( "Lil Peep    ", "Star Shopping", 120851437);
        
        ArrayList<Music> musics = new ArrayList<Music>();
        musics.add(ariana);
        musics.add(xxxtentacion);
        musics.add(biggie);
        musics.add(kendrick);
        musics.add(pac);
        musics.add(eminem);
        musics.add(drake);
        musics.add(travis);
        musics.add(joji);
        musics.add(lilpeep);
        
        for(Music music : musics)
        {
            music.print();
        }
        String remove = InputReader.getString("please insert the artist's first name if you want to remove a song : ");
        remove.toLowerCase();
        for (Music music : musics)
        {
            if(music.getmusic() == musics)
            return musics;
        }
        return null; 

       }

        


        
    

    }
}
