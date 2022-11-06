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

        String adding = InputReader.getString("Do you want to add songs to the list? yes/no  ");
        adding.toLowerCase();
        if (adding.equals("y") || adding.equals("yes"))
        {
            String artistname = InputReader.getString("Please enter artist's name : ");
            String song = InputReader.getString("Please enter song name : ");
            int playcount = InputReader.getInt("Please enter song's playcount : ");

            Music newsong = new Music(artistname, song, playcount); 
            musics.add(newsong);
           
            for (Music music : musics)
            { 
                music.print();
            }


        }



        System.out.println(" ");
        String countlist = InputReader.getString("\tDo you want to see songs listed by its playcount? yes/no  ");
        countlist.toLowerCase();
        if (countlist.equals("y") || countlist.equals("yes"))
        {
            System.out.println("\t Here is songs listed by playcount : ");
            PrintListByCount(musics);
        }
        

        System.out.println(" ");

        String remove = InputReader.getString("\tplease insert the artist's name if you want to remove a song : ");
        remove.toLowerCase();
        for (Music music : musics)
        {
            
            if(music.getname().toLowerCase().contains(remove))
            {
                System.out.println(remove +" " + music.getname()); 
                musics.remove(music);
                System.out.println("song has been found and removed. "); 
                PrintList(musics);
                
            }
            else 
            System.out.println("song hasn't found. "); 
        }
    

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

