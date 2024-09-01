//Write a function that calculates the Greatest Common Divisor of 2 numbers.

package functions;

import java.util.Scanner;

public class gcd {
    public static void calculategcd(int n1,int n2)
    {
        // initially set to gcd
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) 
        {
            // check if i perfectly divides both n1 and n2
            if (n1 % i == 0 && n2 % i == 0)
            gcd = i;
        }
        System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
        return;
    }
     public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        calculategcd(n1,n2);
    }
}

