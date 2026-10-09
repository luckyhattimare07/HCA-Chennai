package class03;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // Switch Statement

        //switch(checkVariable){
        // write cases like case 1, case 2 likewise
        // }

        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter your day: ");
//        int day = sc.nextInt();
//
//        switch (day) {
//            case 1:
//                System.out.println("Monday");
//                break;
//
//            case 2:
//                System.out.println("Tuesday");
//                break;
//
//            case 3:
//                System.out.println("Wednesday");
//                break;
//
//            case 4:
//                System.out.println("Thursday");
//                break;
//
//            case 5:
//                System.out.println("Friday");
//                break;
//
//            case 6:
//                System.out.println("Saturday");
//                break;
//
//            case 7:
//                System.out.println("Sunday");
//                break;
//
//            default:
//                System.out.println("Invalid Input");
//
//        }


        System.out.print("Enter your month: ");
        int month = sc.nextInt();

        switch (month){
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            default:
                System.out.println("Semester is over");

        }











    }
}
