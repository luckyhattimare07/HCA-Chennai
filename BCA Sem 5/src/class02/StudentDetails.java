package class02;

import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        String name  = sc.nextLine();

        int age = sc.nextInt();

        float marks = sc.nextFloat();

        char sec = sc.next().charAt(0);

        System.out.println("Your details are ->");

        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
        System.out.println("Your marks: " + marks);
        System.out.println("Your sec: " + sec);


    }
}
