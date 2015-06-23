/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aman mahajan
 */
import java.util.Scanner;
public class atme{
    public static void main(String arg[])
    {
        System.out.println("Welcome to HPES Bank....");
        System.out.println("Type \"yes\" to enter the bank and \"no\" to exit....");
        String s=new Scanner(System.in).nextLine();
        s=s.toLowerCase();
        while(true)
        {
            if(s.equals("yes"))
            {
                System.out.println("Please wait.... redirecting you...");
                new panel().setVisible(true);
                break;
            }
            else if(s.equals("no"))
            {
                 System.out.println("Thank you.....exiting....");
                 System.exit(0);
            }
            else
            {
                System.out.println("Wrong choice entered...Please enter again..");
                s=new Scanner(System.in).nextLine();
            }          
        }    
    }
}
