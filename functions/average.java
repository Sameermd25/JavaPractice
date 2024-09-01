//Enter 3 numbers from the user & make a function to print their average.

package functions;

import java.util.Scanner;

public class average {
    public static void calculateavg(float a,float b,float c)
    {
        float avg=(a+b+c)/3;
        System.out.println(avg);
        return;
    }
     public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        float a=sc.nextInt();
        float b=sc.nextInt();
        float c=sc.nextInt();
        calculateavg(a,b,c);
    }
}
