//Two numbers are entered by the user, x and n. 
//Write a function to find the value of one number raised to the power of another i.e. x^n.

package functions;

import java.util.Scanner;

public class xpowern {
    public static void calculatepower(int x,int n)
    {
        int p=1;
        for(int i=1;i<=n;i++){
            p*=x;
        }
        System.out.println(p);
        return;
    }
     public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        calculatepower(x,n);
    }
}
