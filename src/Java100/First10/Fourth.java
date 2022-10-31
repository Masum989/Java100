package Java100.First10;

import java.util.Scanner;

// convert fahrenheit to celsius
public class Fourth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        float temp = sc.nextFloat();
        temp = ((temp - 32) * 5) / 9;
        System.out.println("Temperature in Celsius = " + temp);
    }
}
