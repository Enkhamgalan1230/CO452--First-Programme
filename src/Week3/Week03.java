package Week3;
import java.util.ArrayList;
public class Week03 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("CO452 Programming Concepts 2022/23");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" Week 3 Classes, Objects, Constructors ");
        System.out.println();
        System.out.println(" by Nicholas Day and Derek Peacock");
        System.out.println();

        Student entwan = new Student( 22135347, "entwan");
        //entwan.print();

        Student nick = new Student( 221353, "nick");
       // nick.print();

        Student mustafa = new Student( 696969, "mustafa");
        //mustafa.print();

        ArrayList<Student> students = new ArrayList<Student>();
        students.add(entwan);
        students.add(nick);
        students.add(mustafa);
        for(Student student : students)
        {
            student.print();
        }
    }     
    

}
