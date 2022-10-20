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

        System.out.println("Exercise 1");


        int Year = InputReader.getInt(" How old are you? ");
        if (Year>= 18)
        {
            System.out.println("You are over 18");
        }
        else 
        System.out.println("You are under 18");

        System.out.println("Exercise 2");

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
         
        System.out.println("Exercise 3");

        int i = 0;
        while ( i <= 9)
        {
            System.out.println(i);
            i++ ;
        }
         
        System.out.println("Exercise 4");


        int n = 1;
        while (n <= 12)
        {
            System.out.println( n  + "*" + "7= " + n*7);
            n++;
        }

        System.out.println("Exercise 5");

        int a = 1;
       int b = InputReader.getInt("what number do you want to see? ");
       while (a <= 12)
       {
        System.out.println(b + "*" + a + "="+ a*b);
        a++;

       }

       System.out.println("Exercise 6");

       
      int number;
      String proceed; 
      do
       {
        number = InputReader.getInt( "enter a times table (1-12) : ");
        for (int z =1; z<= 12; z++)
        {
            System.out.println(z + "x" + number + "=" + (z* number) );
        }
        proceed = InputReader.getString(" Do you want to give an another go? ");
        proceed.toLowerCase();
    
      }
      while(proceed.equals("y") || proceed.equals("yes"));
 System.out.println("Thank you for using this program seeya bruv");





    }

    }  

