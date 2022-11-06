package Java100.Second10;

import java.util.Scanner;

//while loop using break and continue
public class Seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter an integer");
            int n = sc.nextInt();
            if(n!=0){
                System.out.println("You entered "+n);
                continue;
            }
            else {
                break;
            }
        }
    }
}
