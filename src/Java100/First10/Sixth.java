package Java100.First10;

import java.util.Scanner;

// swap two number without using third variable
public class Sixth {
    public static void main(String[] args) {

        int x ,y;
        System.out.println("Enter x and y");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        x = x+y;
        y = x-y;
        x = x-y;
        System.out.println(x+" "+y);
    }
}
