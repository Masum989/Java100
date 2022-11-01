package Java100.Second10;

import java.util.Scanner;

// print star using loop
public class Fourteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j;

        for(i=1;i<=n;i++){
            for(j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(); // for going to next line
        }
    }
}
