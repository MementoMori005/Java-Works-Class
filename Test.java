import java.util.Scanner;

/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Test
{
 public static void main(String[]arg)
    {
        Scanner ot = new Scanner(System.in);
        String Pass=null;
        String Fail=null;
        System.out.println("Entar grade");
        float Grade = ot.nextFloat();
        
        String f=(Grade>40)?"Pass":"Fail";
        System.out.println(f);
        
    }
}