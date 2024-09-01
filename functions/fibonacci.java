//Write a program to print Fibonacci series of n terms where n is input by user :
//0 1 1 2 3 5 8 13 21 ..... 
//In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.

package functions;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fibo=0;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        for(int i=2;i<n;i++){
            fibo=n1+n2;
            n1=n2;
            n2=fibo;
            System.out.print(fibo+" ");
        }
    }
}
