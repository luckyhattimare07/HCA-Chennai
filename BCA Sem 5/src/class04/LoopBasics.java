package class04;

import java.util.Scanner;

public class LoopBasics {
    public static void main(String[] args) {

//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");

//        int num = 1;
//        System.out.println(num * 2);
//        num++;
//
//        System.out.println(num * 2);
//        num++;
//
//        System.out.println(num * 2);
//        num++;
//
//        System.out.println(num * 2);
//        num++;
//
//        System.out.println(num * 2);


        // initialize , condition, incrementation

        //while loop

        // first we declare/intialize variable
        //while(condition){
        // logic here
        // increment variable
        // }

//        int i = 1;
//        while(i<=10){
//            System.out.println("Hello world");
//            i++;
//        }

//        int i = 1;
//        while(i<=100){
//            System.out.println(i);
//            i++;
//        }

//        int i = 1;
//        while(i<=10){
//            System.out.println(i*2);
//            i++;
//        }


//        int i = 10;
//        while(i>=1){
//            System.out.println(i);
//            i--;
//        }

        // print even only
//        int i =1;
//        while(i<=10){
//            if(i%2 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }


        //tell me how many even and odd numbers are there between 1 to 15

//        int oddCount = 0;
//        int evenCount = 0;
//
//        int i= 1;
//        while(i<=100){
//            if(i%2 == 0){
//                 evenCount++;
//            }
//            else{
//               oddCount++;
//            }
//            i++;
//        }
//
//        System.out.println("Even count is: " + evenCount);
//        System.out.println("Odd count is: " + oddCount);



        //print the count of numbers that are divisible by 5

//        int count = 0;
//
//        int i= 1;
//        while(i<=100){
//            if(i%5 == 0){
//                count++;
//            }
//            i++;
//        }
//
//        System.out.println("Count is: " + count);


       //infinite loop
//        while(true){
//            System.out.println("Hello");
//        }







        //For loop

        // for(initialization; condition; incrementation){
        // logic here
        // }

//        for(int i=1; i<=5; i++){
//            System.out.println("Hello world");
//        }


//        for(int i=1; i<=10; i++){
//            System.out.println(i);
//        }


//        for(int i=5; true; i+=2){
//            System.out.println(i);
//        }


//        for(int i=10; i>0; i--){
//            System.out.println(i);
//        }



//      sum of first n natural number

//        int sum = 0;
//        for(int i= 1; i<=50; i++){
//            sum = sum + i;
////            System.out.println(sum);
//        }
//        System.out.println(sum);


//        n(n+1)/2
//         int n = 50;
//        System.out.println(n*(n+1)/2);




        // 6 - 10

//        int first = 6;
//        int second = 10;
//
//        int ans = (second*(second+1)/2) - ((first-1) * ((first-1) + 1 )/ 2);
//        System.out.println(ans);


//        int evenc = 0;
//        int oddc = 0;
//        for(int i = 1; i< 20; i++){
//            if(i%2 == 0){
//                evenc++;
//            } else {
//                oddc++;
//            }
//        }



        // Do - While Loop

        //intialize your variable
        // do{
        // logic here
        // increment
        // }while(condition);

//        int num = 1;
//        do{
//            System.out.println(num);
//            num++;
//        }while(num>=5);

//        int num = 5;
//        do{
//            System.out.println(num);
//            num--;
//
//        }while(num >= -5);


//        int neg= 0;
//        int pos = 0;
//
//        int n = -25;
//        do{
//            if(n<0){
//                neg++;
//
//            } else {
//                pos++;
//            }
//
//            n++;
//        }while(n<=20);
//
//        System.out.println("Negatives are: " + neg);
//        System.out.println("Positives are: " + pos);




//        int i =1;
//
//        do{
//            int first  = 2 * i;
//            int second = 4 * i;
//            i++;
//
//            System.out.println(first * second);
//        }while(i<=5);





//        int ans = 0;
//
//        int num = 1;
//        do{
//            if(num%3==0 && num%5==0){
//                ans++;
//            }
//            num++;
//
//        }while(num<=50);
//
//        System.out.println("Ans is: " + ans);





        // break and continue


//        for(int i = 1; i<= 10; i++){
//
//            if (i == 3 || i == 7){
//                continue;
//            }
//            System.out.println(i);
//        }


//        for ( int i = 1; i<=20; i++){
//            if(i%2 == 1){
//                 continue;
//            }
//            System.out.println(i);
//        }


//        for (int i = 1; i<= 100; i++){
//            if(i == 50){
//                break;
//            }
//            System.out.println(i);
//        }




//         you are logging in to the interface , only 3 attempts are there for password

//        if your password is correct then print log in successfully, otherwise print incorrect password and how many attempt left

//        Scanner sc = new Scanner(System.in);
//        String correctPassword = "Java@123";
//
//        int attempts = 0;
//
//        while (attempts<3){
//            System.out.print("Enter your password: ");
//            String password = sc.next();
//
//            if(password.equals(correctPassword)){
//
//                System.out.println("Log in Successfully");
//                break;
//
//            } else {
//                attempts++;
//                System.out.println("Incorrect password");
//                System.out.println("Attempts left: " + (3-attempts) );
//            }
//        }



//        nested Loop

//        for(int i =1; i<=5; i++){
//            System.out.print(i + " ");
//        }


        int rows = 4;
        int cols = 4;

//        for(int i = 1; i<=rows; i++){
//            for(int j=1; j<=cols; j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }


//        for(int i = 1; i<=rows; i++){
//            for(int j=1; j<=cols; j++){
//                System.out.print(j + " ");
//            }
//            System.out.println();
//        }



//        for(int i = 1; i<=rows; i++){
//            for(int j=1; j<=cols; j++){
//                System.out.print(i + " ");
//            }
//            System.out.println();
//        }


//        for(int i = 1; i<=rows; i++){
//            for(int j=1; j<=i; j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }


//        for(int i = 4; i>=1; i--){
//            for(int j=1; j<=i; j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }


        for(int i = 1; i<=rows; i++){
            for(int k=1; k<=4-i ; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*" + "");
            }
            System.out.println();
        }



        for(int i = rows; i>=1; i--){
            for(int k=1; k<=4-i ; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*" + "");
            }
            System.out.println();
        }


    }
}
