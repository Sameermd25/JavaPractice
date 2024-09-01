package functions;

import java.util.Scanner;

public class prodof2nos {
    public static void calculateprod(int a,int b)
    {
        int sum=a*b;
        System.out.println(sum);
        return;
    }
     public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calculateprod(a,b);
    }
}
