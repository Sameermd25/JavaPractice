//Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.

package functions;

import java.util.Scanner;

public class vote {
    public static void calculateeligible(int age)
    {
        if(age>=18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }
        return;
    }
     public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        calculateeligible(age);
    }
}
