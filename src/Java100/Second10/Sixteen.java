package Java100.Second10;

import java.util.Scanner;

//while loop using break program
public class Sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter an integer");
            int n = sc.nextInt();

            if(n==0){
                break;
            }
            System.out.println("You entered "+n);
        }
    }
}
