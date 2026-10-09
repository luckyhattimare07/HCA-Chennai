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


//        int num = 1;
//        System.out.println(num);
//        num++;
//
//        System.out.println(num);
//        num++;
//
//        System.out.println(num);
//        num++;
//
//        System.out.println(num);
//        num++;
//
//        System.out.println(num);


        // while loop

        // intialize variable
        // while(condition){
        // logic here
        // increment
        // }


//        int i = 1;
//        while(i<11){
//            System.out.println(i);
//            i++;
//        }


//        int i = 10;
//        while(i>0){
//            System.out.println(i);
//            i--;
//        }


//        int oddc = 0;
//        int evenc = 0;
//
//        int i = 1;
//        while(i<=10){
//            if(i%2 == 0){
//                evenc++;
//            } else {
//                oddc++;
//            }
//            i++;
//        }
//        System.out.println(oddc);
//        System.out.println(evenc);



//        int i= 1;
//        int count  = 0;
//        while(i<=50){
//            if( i%3 == 0 && i%5 == 0){
//                count++;
//            }
//            i++;
//        }
//        System.out.println(count);



//        int i = 1;
//
//        while(i<=5){
//            int first = i*2;
//            int second = i*8;
//            int ans =  first * second;
//            System.out.println(ans);
//            i++;
//        }


        // for loop

        // for(intialization ; condition ; incrementation ) {
        // logic part
        // }



//        for(int i = 1; i<=5; i++){
//            System.out.println(i);
//        }

//        for(int i = 10; i>=1; i--){
//            System.out.println(i);
//        }

//        int sum = 0;
//        for(int i = 1; i<=5; i++){
//            sum+=i;
//        }
//        System.out.println(sum);

//        int n = 15;
//        int ans = (n * (n+1)) / 2;
//        System.out.println(ans);

        // do - while

        //intialize variable
        // do {
        // logic part
        // increment
        // }
        // while(condition);

//        int a = 1;
//        do {
//            System.out.println(a);
//            a++;
//        } while (a<0);


//        int i = 1;
//        while(i<0){
//            System.out.println(i);
//            i++;
//        }


//        int a = -15;
//        int neg =0;
//        int pos = 0;
//        do{
//            if(a<0){
//                neg++;
//            }else {
//                pos++;
//            }
//            a++;
//
//        } while(a<=15);
//
//        System.out.println("Positive: " + pos);
//        System.out.println("Negative: " + neg);



        // sum all the even numbers b/w 1 to 50

//        int i  = 1;
//        int sum =0;
//        do{
//            if(i%2 == 0){
//                sum += i;
//            }
//            i++;
//        } while(i<=50);
//        System.out.println(sum);


        // break and continue

        // print 1 to 10 except 3
        // continue

//        for(int i = 1; i<=10; i++){
//            if(i==3){
//                continue;
//            }
//            System.out.println(i);
//        }


//        for(int i = 1; i<=10; i++){
//            if(i==3 || i == 7){
//                continue;
//            }
//            System.out.println(i);
//        }




//        for(int i = 1; i<=10; i++){
//            if(i%2 == 1){
//                continue;
//            }
//            System.out.println(i);
//        }



//        for(int i = 1; i<=10; i++){
//            if(i==51){
//                break;
//            }
//            System.out.println(i);
//        }


        int capacity = 20;
        int distance  = 20;

        for(int bike = 0; bike<= distance; bike++) {
            if(bike > capacity){
                System.out.println("Limit Exceed");
                break;
            }
            if(bike == distance){
                System.out.println("destination reached");
            }
        }



    }
}
