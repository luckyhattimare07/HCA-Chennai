package class06;

import java.util.Arrays;

public class OneDArrayProblems {
    public static void main(String[] args) {

        //find even and odd elements :-  T.C -> O(N)
//        int[] arr = {20,25,38,40,67};
//
//        int odd = 0;
//        int even = 0;
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] % 2 == 1){
//                odd++;
//            } else {
//                even++;
//            }
//        }
//        System.out.println("Even: " + even);
//        System.out.println("Odd: " + odd);



        // sum of all elements of array T.C -> O(N)
//
//        int [] arr = {10,20,30,40,50};
//
//        int sum =0;
//        for(int i=0; i< arr.length; i++){
//            sum = sum + i;
//        }
//        System.out.println("SUM IS: " + sum);




        // Average of all elements of array T.C -> O(N)

//        int [] arr = {10,20,30,40,50};
//
//        int sum =0;
//
//        for(int i=0; i< arr.length; i++){
//            sum = sum + arr[i];
//        }
//
//        System.out.println("SUM IS: " + sum);
//        int average = sum/ arr.length;
//        System.out.println("Average is " + average);




        // copy of array

        int [] arr = {10,20,30,40,50};

        int [] newarr = new int[arr.length];

        for(int i=0; i< arr.length; i++){
            newarr[i] = arr[i];
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newarr));




    }
}
