package class02;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter you age: ");
        int age = sc.nextInt();

        System.out.println("Enter your marks: ");
        float marks = sc.nextFloat();

        System.out.println("Enter your sec: ");
        char sec = sc.next().charAt(0);

        System.out.println("Your name is: " + name);
        System.out.println("Your marks is: " + marks);
        System.out.println("Your age is: " + age);
        System.out.println("Your sec is: " +sec);

    }
}
