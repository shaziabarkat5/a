import java.util.*;
public class Main
{
    public static void main(String args[])
    {
        Scanner a1= new Scanner(System.in);
        
        System.out.println("enter an yr :" );
        int  a2=a1.nextInt();
        if(a2 %4==0)
        {
            if(a2 %100==0 )
            {
                if(a2%400==0)
                System.out.println("yes it is a leap year");
                else
                System.out.println("no");
            }
            else
                {
                    System.out.println("yes");
                }
            
        }
        else
            System.out.println("no");
    }
}