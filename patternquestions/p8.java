package patternquestions;

import java.util.Scanner;

public class p8{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int number=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                 System.out.print(number);
                 number++;  
            }  
            System.out.println();
        }
    }
}

//Floyd's Triangle:
//Output:-
//1
//23
//456
//78910

