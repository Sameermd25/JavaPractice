package patternquestions;

import java.util.Scanner;

public class p10{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //upper half
        for(int i=1;i<=n;i++)
        {
            //1st part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");   
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");   
            }
            System.out.println();
        }
        //lower half
        for(int i=n;i>=1;i--)
        {
            //1st part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");   
            }
            //spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //2nd part
            for(int j=i;j>=1;j--)
            {
                System.out.print("*");   
            }
            System.out.println();
        }
    }
}

//Output:-
// *------*
// **----**
// ***--***
// ********
// ********
// ***--***
// **----**
// *------*
