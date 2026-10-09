package class02;

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        // 10 , 20  = sum 30
        Scanner sc =new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int first  = sc.nextInt();

        System.out.print("Enter your second number: ");
        int second  = sc.nextInt();

        System.out.println("your sum is: " + (first + second));

    }
}
