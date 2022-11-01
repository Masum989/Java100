package Java100.First10;

import java.util.Scanner;

// if else in java
public class Ninth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You can vote");
        }else {
            System.out.println("You can't vote");
        }
    }
}
