package class06;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {
//        int marks1 = 10;
//        int marks2 = 20;
//        int marks3 = 30;
//        int marks4 = 40;
//        int marks5 = 50;
//
//        System.out.println(marks1);
//        System.out.println(marks2);
//        System.out.println(marks3);
//        System.out.println(marks4);
//        System.out.println(marks5);

//        int marks[] = new int[5];
//        marks[0] = 10;
//        marks[1] = 20;
//        marks[2] = 30;
//        marks[3] = 40;
//        marks[4] = 40;
//
//        // update
//        marks[2] = 100;
//
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);


//        String name[] = new String[5];
//        name[0] = "A";
//        name[1] = "B";
//        name[2] = "C";
//        name[3] = "D";
//        name[4] = "E";
//
//        System.out.println(name[0]);
//        System.out.println(name[1]);
//        System.out.println(name[2]);
//        System.out.println(name[3]);
//        System.out.println(name[4]);


//        char sec[] = new char[3];
//        sec[0] = 'A';
//        sec[1] = 'B';
//        sec[2] = 'C';
//
//        System.out.println(sec[0]);
//        System.out.println(sec[1]);
//        System.out.println(sec[2]);


//        int marks[] = new int[5];
//        marks[0] = 10;
//        marks[1] = 20;
//        marks[2] = 30;
//        marks[3] = 40;
//        marks[4] = 40;
//
//        int length = marks.length;
//        System.out.println(length);
//
//        for(int i=0; i< marks.length; i++) {
//            System.out.println(marks[i]);
//        }




//        int marks[] = {10,20,30,40,50};
//
//        for(int i=0; i< marks.length; i++) {
//            System.out.println(marks[i]);
//        }


//        String [] names = {"A", "B", "C", "D", "E"};
//
//        for(int i=0; i< names.length; i++){
//            System.out.println(names[i]);
//        }

//        char sec[] = {'a', 'b', 'c','d','e'};

//        for (int i=0; i< sec.length; i++){
//            System.out.println(sec[i]);
//        }


        // Take input in array and display
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Size: ");

        int size = sc.nextInt();
        int arr[] = new int[size];

        System.out.println("Enter your Array Elements");
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }



    }
}
