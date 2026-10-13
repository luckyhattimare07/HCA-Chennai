package class06;
import java.util.Arrays;
public class OneDProblems {
    public static void main(String[] args) {
        // even and odd elements are there
//        int [] arr = {22, 29, 45, 42, 50, 11};
//
//        int even = 0;
//        int odd = 0;
//        for(int i= 0; i<arr.length; i++){
//            if(arr[i]%2 == 0){
//                even++;
//            }
//            else{
//                odd++;
//            }
//        }
//        System.out.println("EVEN: " + even);
//        System.out.println("ODD: " + odd);


        // copy of array
//        int [] arr = {2,4,6,8,10};
//        int [] newarr = new int[arr.length];
//
//        for (int i=0; i< arr.length; i++){
//            newarr[i] = arr[i];
//        }
//
//        System.out.println("Previous Array: " + Arrays.toString(arr));
//        System.out.println("New Array: " + Arrays.toString(newarr));


        // find the target :- an element is given you to find in array

//        int [] arr = {20, 50, 30, 60, 10, 40};
//        int target = 500;
////        int check = 0;
//        boolean check = false;
//
//        for (int i=0; i<arr.length; i++){
//            if(arr[i] == target){
////                check = target;
//                check = true;
//            }
//        }
//
//        if(check){
//            System.out.println("True");
//        } else{
//            System.out.println("False");
//        }




        // (1) (logn) (n)


        // find the largest element in array
//        int [] arr = { 80, 40, 20 , 90 , 300, 50};

         // Brute Force
//        Arrays.sort(arr); // 20 , 30, 40 , 80 ,90   O(nlogn)
//        System.out.println("Largest Element is: " + arr[arr.length-1]);


        //Optimal Approach :- 0(n)

//        int max = arr[0];
//
//        for(int i = 1; i<arr.length; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//
//        System.out.println("Max ELement is: " + max);




        //reverse an array
        int [] arr = {1,2,3,4,5};




    }
}
