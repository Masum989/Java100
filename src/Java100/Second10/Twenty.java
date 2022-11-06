package Java100.Second10;

import java.util.Scanner;

//print multiplication table
public class Twenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to get multiplication table");
        int n = sc.nextInt();
        System.out.println("Multiplication table of "+n + "is:-");
        for(int i =1;i<=10;i++){
            System.out.println(n+"*"+i+" = "+(n*i));
        }
    }
}
