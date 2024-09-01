package functions;

import java.util.Scanner;

public class printname {
    public static void printthename(String name)
    {
        System.out.println(name);
        return;
    }
     public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        printthename(name);
        
    }
}

