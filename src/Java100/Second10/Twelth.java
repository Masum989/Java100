package Java100.Second10;

//import java.math.BigInteger;
import java.util.Scanner;

// how to compare two string in java
public class Twelth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        String s1 = sc.nextLine();
        System.out.println("Enter the second string");
        String s2 = sc.nextLine();

        if(s1.compareTo(s2) >0){
            System.out.println("First string is greater than second");
        }else if(s1.compareTo(s2) < 0){
            System.out.println("First string is smaller than second");
        }else
            System.out.println("Both string are equal");


    }
}
