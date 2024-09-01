//Write a function that takes in the radius as input and returns the circumference of a circle.

package functions;

import java.util.Scanner;

public class circumferencecircle {
    public static void calculatecircumference(float r)
    {
        double circumference=(2)*(3.14)*(r);
        System.out.println(circumference);
        return;
    }
     public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        float r=sc.nextInt();
        calculatecircumference(r);
    }
}
