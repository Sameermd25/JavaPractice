//Write a function which takes in 2 numbers and returns the greater of those two

package functions;

import java.util.Scanner;

public class greatest {
    public static void calculategreater(int a,int b)
    {
        if(a>b){
            System.out.println(a+" is greater than "+b);
            System.out.println(a);
        }
        else{
            System.out.println(b+" is greater than "+a);
            System.out.println(b);
        }
        return;
    }
     public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        calculategreater(a,b);
    }
}
