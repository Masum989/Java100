package Java100.Second10;

import java.util.Scanner;

// find factorial number of given number in java
public class Eleventhh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to calculate it's factorial");
        int n =sc.nextInt();
        int fact = 1;
        if(n<0)
            System.out.println("Number should not be negative");
        else{
            for(int i =1;i<=n;i++)
                fact = fact*i;
                System.out.println("Factorial is " + fact);

        }
    }
}
