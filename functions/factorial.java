package functions;

import java.util.Scanner;

public class factorial {
    public static void factorialof(int n)
    {
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        int f=1;
        for(int i=1;i<=n;i++){
            f*=i;
        }
        System.out.println(f);
        return;
    }
     public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        factorialof(n);
    }
}
