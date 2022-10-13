package Week1;

import helpers.InputReader;
public class Week1 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    /**
     * @param args
     */
    private static final String Int = null;
    /**
     * @param args
     */
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println("  Week 1 Java Basic Input/Output ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        System.out.println( "hello world");

        String name = InputReader.getString( "Whats yo name : " );
        System.out.println( "Hi " + name); 

        String Id = InputReader.getString( "Enter your id : ");
        System.out.println( " Your id is " +Id + " right? Thanks" );

        System.out.println("Lets do some math now");
    
        int length = InputReader.getInt("Enter length for your rectangle > " );

        int height = InputReader.getInt("Enter height for your rectangle > " );

        int area = length*height ;
        int perimeter = (length+height)*2 ;

        System.out.println(" So your Area for rectangle is " +area + " and perimeter is " + perimeter);
        
        double number1 = InputReader.getInt(" enter the first number > ");
        double number2 = InputReader.getInt(" enter the second number > ");
        
        double average = ( number1 + number2 )/2 ;
        
        System.out.println( " THE average is " + average );
    
        int value1 = InputReader.getInt("enter first value"); 
        int value2 = InputReader.getInt("enter second value");
        System.out.println(value1 + value2 );
        System.out.println(value2 + value1);
   
        int mark;

        int Year = InputReader.getInt(" What year were you born ? ");
        int Month = InputReader.getInt(" What month were you born ? ");
        int Day = InputReader.getInt(" What day of the month were you born ? ");
        System.out.println("You have been alive for " + ((2022-Year)*365 + Month*30 + Day) + " Days " );

        double Feet = InputReader.getInt("Enter the feet : ");
        double Mile = ( Feet/5280);
        System.out.println("it is " +Mile + "in Mile");

       
        


    } 
}
