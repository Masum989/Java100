package Java100.First10;

import java.util.Scanner;

// how to check odd and even number
public class Tenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("The given number is even");
        }else {
            System.out.println("The given number in odd");
        }
    }
}
