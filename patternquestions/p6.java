package patternquestions;

import java.util.Scanner;

public class p6{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //outr loop
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);  
            }  
            System.out.println();
        }
    }
}


//Output:-
//1
//12
//123
//1234


