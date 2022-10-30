package Week5;
import java.util.ArrayList;
import java.util.Iterator;

import helpers.InputReader;
public class CW1 {
     public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        Music ariana = new Music( "ariana grande", "Into you", 1);
        Music xxxtentacion = new Music( "xxxtentacion", "SAD", 9);
        Music biggie = new Music( "notorious big", "Juicy", 8);
        Music kendrick = new Music( "kendrick lamar", "Money tree", 7);
        Music pac = new Music( "2pac", "Hit 'Em Up", 6);
        Music eminem = new Music( "eminem", "Mockingbird", 5);
        Music drake = new Music( "drake", "God's Plan", 4);
        Music travis = new Music( "travis scott", "SICKO MODE", 1);
        Music joji = new Music( "joji", "YEAH RIGHT", 2);
        Music lilpeep = new Music( "lil peep", "Star Shopping", 3);
        
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
        
        //PrintList(musics);
        System.out.println(CONSOLE_CLEAR);

        System.out.println("Songs listed by playcount : ");
        PrintListByCount(musics);


        String remove = InputReader.getString("please insert the artist's first name if you want to remove a song : ");
        remove.toLowerCase();
        for (Music music : musics)
        {
            
            if(music.getname().toLowerCase() == remove)
            {
                System.out.println(remove +" " + music.getname()); 
                musics.remove(music);
                
            }
            else 
            System.out.println("song hasn't found. "); 
        }
        PrintList(musics);

       } 
       public static void  PrintList(ArrayList<Music> musics){
        for(Music music : musics)
        {
            music.print();
        }
       }
       public static void PrintListByCount(ArrayList<Music> localMusics){
        
        int howLong = localMusics.size();
            for(int highest=0 ; highest< howLong; highest++ )
            {
                Music temp = new Music("", "", 0);
                int highestNumber=0;
                for (Music music : localMusics)
                {
                    if( highestNumber < music.getPlayCount())
                    {
                        highestNumber = music.getPlayCount();
                        temp = music;

                    }
                }
                temp.print();
                localMusics.remove(temp);
            }
       }

    }

