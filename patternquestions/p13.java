package patternquestions;

import java.util.Scanner;

public class p13{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");   
            }
            //1st half numbers
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);   
            }
            //2nd half numbers
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);   
            }
            System.out.println();
        }
    }
}

//Output:-
// ----1----
// ---212---
// --32123--
// -4321234-
// 543212345


