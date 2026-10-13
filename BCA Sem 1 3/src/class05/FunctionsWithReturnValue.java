package class05;

public class FunctionsWithReturnValue {
    // functions having return ,but no parameter
//    static int getNum(){
//        return 10;
//    }
//
//    static String getName(){
//        return "Hello";
//    }

//    static boolean check(){
//        return 18>=20;
//    }

    //Functions with parameter and return value
//    static int add(int a, int b){
//        return a+b;
//    }
//
//    static int sub(int a, int b){
//        return a-b;
//    }
//
//    static int mul(int a, int b){
//        return a*b;
//    }

    static String getMerge(String s1, String s2){
        return s1 + " " + s2;
    }

    public static void main(String[] args) {
        System.out.println(getMerge("Hindustan","College"));

//        System.out.println(mul(10,5));
//
//        System.out.println(sub(10,5));
//
//        System.out.println(add(10,20));

//        System.out.println(getNum());
//
//        System.out.println(getName());

//        System.out.println(check());
    }
}
