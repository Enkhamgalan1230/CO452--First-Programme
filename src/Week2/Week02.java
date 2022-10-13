package Week2;
import helpers.InputReader;
public class Week02 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 2 Java Selection & Iteration ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();


        int Year = InputReader.getInt(" How old are you? ");
        if (Year>= 18)
        {
            System.out.println("You are over 18");
        }
        else 
        System.out.println("You are under 18");

        char Grade = InputReader.getChar("please enter your grade in capital : ");
        if (Grade== 'A')
        {
            System.out.println("You are 1st");
        }
        else 
        if (Grade== 'B')
        {
            System.out.println("You are 2:1");
        }
        else 
        if (Grade== 'C')
        {
            System.out.println("You are 2:2");
        }
        else 
        if (Grade== 'D')
        {
            System.out.println("You are ordinary");
        }
        else 
        if (Grade== 'F')
        {
            System.out.println("You failed");
        }



        int i = 0;
        while( i <= 9 )
        {

            if (i%2 == 1)
            {
                System.out.println( i );
                
            }
            i++ ;
        }



         
    }

    }  

