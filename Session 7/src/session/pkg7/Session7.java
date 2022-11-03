/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session.pkg7;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Session7 {

    /**
     * @param args the command line arguments
     */
    public static int main(String[] args) {
        // TODO code application logic here
        // Code dung
//        int[] a= {1,2,3,4,5};
//        int n=10;
//        try{
//        for(int i=0;i<n;i++)
//            System.out.print("" + a[i] + ",");
//    }
//        catch(Exception e)
//        {System.out.println(e);
//        }
//      //Code bi loi  
//        int[] a = {1,2,3,4,5};
//        int n = 10;
//        for(int i = 0; i<n; i++)
//            System.out.println("" + a[i] + ",");
//        int x = 6;
//        int y = 0;
//        try
//        {
//            System.out.println(x/y);
//            //other statements
//        }
//        catch( ArithmeticException i)
//        {System.out.println(i);
//        y = 2;
//        }
//        finally
//        {
//            System.out.println("Hello");
//            System.out.println(x/y);
//        }
        
//        int x = 6;
//        int y = 0;
//        try
//        {
//            System.out.println(x/y);
//        }
//        catch(Exception e)
//        {
//            e.printStackTrace();
//            y = 2;
//        }
//        finally 
//        {
//            System.out.println("Hello");
//            System.out.println(x/y);
//        }
        Scanner in = new Scanner(System.in);
        boolean cont;
        cont = true;
        int n = 0;
        do {
            try {
                System.out.println("Enter a whole number: ");
                n = Integer.parseInt(in.nextLine());
            } catch (Exception e) 
            {
                System.out.println("Required integer");
            }    
            while(cont == true|| n<10 || n>50);
            return n;
        }
    }
}
