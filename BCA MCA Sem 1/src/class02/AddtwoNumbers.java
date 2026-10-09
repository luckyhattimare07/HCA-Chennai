package class02;

import java.util.Scanner;

public class AddtwoNumbers {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter your first number: " );
        int first = sc.nextInt();

        System.out.print("Enter your second number: " );
        int second = sc.nextInt();

        System.out.println("Your sum is: "  + (first + second));
    }
}
