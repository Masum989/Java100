package Java100.First10;

import java.util.Scanner;

// swap two number using third variable
public class Fifth {
    public static void main(String[] args) {
        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();

        System.out.println("Before swapping\nx = " +x+"\ny = " +y);
        temp = x;
        x = y;
        y=temp;
        System.out.println("After swapping \nx = "+ x+"\ny ="+y);
    }
}
