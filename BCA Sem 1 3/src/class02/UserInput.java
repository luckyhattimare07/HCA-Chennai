package class02;

import java.util.Scanner; //for accessing scanner class

public class UserInput {
    public static void main(String[] args) {
//        int age = 50;
//        System.out.println(age>=18 ? "Eligible" : "Not ELigible");

        // className objName = new className();

        Scanner sc = new Scanner(System.in);

//        int age  = sc.nextInt();
//        System.out.println(age>=18 ? "Eligible" : "Not ELigible");

//        long balance = sc.nextLong();
//        System.out.println("Your balance is: " + balance);

//        byte bcaYear = sc.nextByte();
//        System.out.println("Your bca year is: " + bcaYear);

//        short semester = sc.nextShort();
//        System.out.println("Your semester is: " + semester);

//        float percentage = sc.nextFloat();
//        System.out.println("Your percentage is: " + percentage);

//        double percentage = sc.nextDouble();
//        System.out.println("Your percentage is: " + percentage);

//        String name = sc.next();
//        System.out.println("Your name is: " + name);

//        String name = sc.nextLine();
//        System.out.println("Your name is: " + name);

        char sec = sc.next().charAt(0);
        System.out.println("Your sec is: " + sec);
    }
}
