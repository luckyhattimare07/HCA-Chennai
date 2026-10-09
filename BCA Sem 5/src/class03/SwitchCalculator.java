package class03;

import java.util.Scanner;

public class SwitchCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int a = sc.nextInt();

        System.out.print("Enter your second number: ");
        int b = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulus");

        System.out.print("Tell me your choice: ");
        int choice = sc.nextInt();


        switch (choice){
            case 1:
                System.out.println("Addition is: " + (a+b));
                break;

            case 2:
                System.out.println("Subtraction is: " + (a-b));
                break;

            case 3:
                System.out.println("Multiply is: " + (a*b));
                break;

            case 4:
                System.out.println("Divide is: " + (a/b));
                break;

            case 5:
                System.out.println("Modulus is: " + (a%b));
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
