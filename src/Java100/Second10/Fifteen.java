package Java100.Second10;

import java.util.Scanner;

// print reverse number in java
public class Fifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int  reverse = 0;
        System.out.println("Enter the number to reverse");
        int n = sc.nextInt();
        while(n !=0){
            reverse = reverse*10;
            reverse = reverse+n %10;
            n= n/10;

        }
        System.out.println("Reversed number is " + reverse);
    }
}
