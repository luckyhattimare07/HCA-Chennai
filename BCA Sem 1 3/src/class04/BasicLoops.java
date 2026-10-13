package class04;

public class BasicLoops {
    public static void main(String[] args) {
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");
//        System.out.println("Hello World");

//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);

//        int a = 1;
//        System.out.println(a);
//        a++;
//
//        System.out.println(a);
//        a++;
//
//        System.out.println(a);
//        a++;
//
//        System.out.println(a);
//        a++;
//
//        System.out.println(a);


        // while loop

        // intialize variable
        // while(condition){
        // logic part
        // increment
        // }

//        int a = 1;
//        while(a<=10){
//            System.out.println(a);
//            a++;
//        }

//        int a = 1;
//        while(a<11){
//            System.out.println(a);
//            a++;
//        }

        // 10 8 6 4 2 0
//        int a = 10;
//        while(a>=0){
//            System.out.println(a);
//            a = a - 2;
//        }

//        System.out.println("Heelo");
     // tell how many even and odd numbers there 1-50

//        int oddc = 0;
//        int evenc = 0;
//
//        int a = 1;
//        while(a<=50){
//            if(a%2 == 0){
//                evenc++;
//            }else {
//                oddc++;
//            }
//            a++;
//        }
//
//        System.out.println("Odd Numbers are: " + oddc);
//        System.out.print("Even Numbers are: " + evenc);



        // for loop

        //for( intialize ; condition ; incrementation){
        // logic part
        // }

//        for(int i = 1; i<=10; i++){
//            System.out.println(i);
//        }



//        for(int i = 10; i>=1; i--){
//            System.out.println(i);
//        }



        // 1 3 5 7 9
//        for(int i = 1; i<=9; i=i+2){
//            System.out.println(i);
//        }


        //  you have to find how many positive and negative numbers are there b/w -15 to 15

//        int neg = 0;
//        int pos = 0;
//
//        int i = -15;
//        while(i<=15){
//
//            if(i<0){
//                neg++;
//            } else {
//                pos++;
//            }
//            i++;
//        }
//        System.out.println("Negative: " + neg);
//        System.out.println("Positive: " + pos);


        //do - while loop

        // intialize variable
        // do{
        // logic part
        // increment
        // } while(condition);


//        int i = 1;
//        do{
//            System.out.println(i);
//            i++;
//        }while(i<=10);



//        int i = 10;
//        do{
//            System.out.println(i);
//            i--;
//
//        }while (i>=1);


//        int i = 1;
//        do{
//            System.out.println("5 * " + i + " = " + (i*5) );
//            i++;
//        }while (i<=10);


        //break and continue


//        for(int i=1; i<=10; i++){
//            if(i==3){
//                continue;
//            }
//            System.out.println(i);
//        }


//        for(int i=1; i<=10; i++){
//            if(i==3 || i==5){
//                continue;
//            }
//            System.out.println(i);
//        }



//        for(int i = 1; i<=20; i++){
//            if(i%2 == 1){
//                continue;
//            }
//            System.out.println(i);
//        }



//        for(int i=1; i<=100; i++){
//            if(i==51){
//                break;
//            }
//            System.out.println(i);
//        }
//
//
//        for (int i=5; i<=50; i=i+5){
//            if(i == 45){
//                break;
//            }
//            System.out.println(i);
//        }


     // Nested Loops

//        for (int i=0; i<=5; i++){
////            System.out.print(i + " ");
//            System.out.println(i);
//        }


        //outer loop for rows
        //inner loop for cols

//        int row = 10;
//        int col = 10;
//
//        for(int i =1; i<=row; i++){
//            for (int j = 1; j<=col; j++){
//                System.out.print("*" + " ");
//            }
//            System.out.println();
//        }


//        int row = 4;
//        int col = 4;
//
//        for(int i =1; i<=row; i++){
//            for (int j = 1; j<=col; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }





//        int row = 4;
//        int col = 4;
//
//        for(int i =1; i<=row; i++){
//            for (int j = 1; j<=col; j++){
//                System.out.print(i+" ");
//            }
//            System.out.println();
//        }



        int row = 4;
        int col = 4;

        for(int i =1; i<=row; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }


//        int row = 4;
//        int col = 4;
//
//        for(int i =4; i>=1; i--){
//            for (int j = 1; j<=i; j++){
//                System.out.print("*" +" ");
//            }
//            System.out.println();
//        }



    }
}
