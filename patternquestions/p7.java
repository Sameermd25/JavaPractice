package patternquestions;

import java.util.Scanner;

public class p7{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //outr loop
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print(j);  
            }  
            System.out.println();
        }
    }
}


//Output:-
//1234
//123
//12
//1



