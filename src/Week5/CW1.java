package Week5;
import java.util.ArrayList;
import java.util.Iterator;

import helpers.InputReader;
public class CW1 {
     public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        Music ariana = new Music( "ariana grande", "Into you", 956156387);
        Music xxxtentacion = new Music( "xxxtentacion", "SAD", 1186723041);
        Music biggie = new Music( "notorious big", "Juicy", 486963991);
        Music kendrick = new Music( "kendrick lamar", "Money tree", 104834424);
        Music pac = new Music( "2pac", "Hit 'Em Up", 562839095);
        Music eminem = new Music( "eminem", "Mockingbird", 648318604);
        Music drake = new Music( "drake", "God's Plan", 1452875826);
        Music travis = new Music( "travis scott", "SICKO MODE", 1049871890);
        Music joji = new Music( "joji", "YEAH RIGHT", 143270169);
        Music lilpeep = new Music( "lil peep", "Star Shopping", 77285420);
        
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

        String opening = InputReader.getString("Do you want to see listed songs? yes/no  ");
        opening.toLowerCase();
        if (opening.equals("y") || opening.equals("yes"))
        {
            for (Music music : musics)
            { music.print();}
        }
        
        System.out.println(" ");
        System.out.println(" Here is songs listed by playcount : ");
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
                Music temporary = new Music("", "", 0);
                int highestNumber=0;
                for (Music music : localMusics)
                {
                    if( highestNumber < music.getPlayCount())
                    {
                        highestNumber = music.getPlayCount();
                        temporary = music;

                    }
                }
                temporary.print();
                localMusics.remove(temporary);
            }
       }

    }

