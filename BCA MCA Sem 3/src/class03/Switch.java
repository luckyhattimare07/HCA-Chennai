package class03;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // switch syntax

        // switch(checkVariable){
        // write cases
        // }

        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Your Day: ");
//        int day = sc.nextInt();
//
//        switch (day){
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
//                System.out.println("Invalid input");
//
//        }



//        System.out.print("Enter your Month: ");
//        int month = sc.nextInt();
//
//        switch (month){
//            case 1:
//                System.out.println("January");
//                break;
//
//            case 2:
//                System.out.println("February");
//                break;
//
//            case 3:
//                System.out.println("March");
//                break;
//
//            case 4:
//                System.out.println("April");
//                break;
//
//            default:
//                System.out.println("Summer vacation");
//
//        }




//        System.out.print("Enter Your Character: ");
//        char alphabet = sc.next().charAt(0);
//
//        switch (alphabet){
//            case 'A':
//                System.out.println("Apple");
//                break;
//
//            case 'B':
//                System.out.println("Ball");
//                break;
//
//            case 'C':
//                System.out.println("Cat");
//                break;
//
//            case 'D':
//                System.out.println("Dog");
//                break;
//
//            case 'E':
//                System.out.println("Elephant");
//                break;
//
//            default:
//                System.out.println("Cannot Access");
//
//        }


        System.out.print("Enter your Day: ");
        String day = sc.next();

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                System.out.println("Weekday");
                break;

            case "Saturday":
            case "Sunday":
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Invalid");
        }











    }
}
