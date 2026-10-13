package class05;

public class FunctionsParameter {
    //functions with parameters

//    static void getName(String name){
//        System.out.println("Name: " + name);
//    }

//    static void printNum(int n){
//        for(int i=1; i<=n; i++){
//            System.out.println(i);
//        }
//    }

//    static void square(int n ){
//        System.out.println("Square: " + n*n);
//
//    }


//    static void getMerge(String s1, String s2){
//        String newString  = s1 + " " + s2;
//        System.out.println(newString);
//    }

    static void add(int a, int b){
        System.out.println(a+b);
    }

    static void sub(int a, int b){
        System.out.println(a-b);
    }

    public static void main(String[] args) {
        add(5,6);
        sub(20,10);
//        getMerge("Hindustan", "College");

//        square(10);

//        printNum(10);

//        getName("Ball");
//        getName("Apple");

    }
}
