package class05;

public class FunctionsWithReturnTYpe {
//    static int getNumber(){
//       return 4;
//    }

//    static String getName(){
//        return "Apple";
//    }

//    static char getChar(){
//        return 'a';
//    }

    //functions with parameter and return value
    static int add(int a, int b){
//        System.out.println(a+b);
        return  a+b;
    }

    static int sub(int a, int b){
//        System.out.println(a+b);
        return  a-b;
    }

    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(sub(10,20));
//        System.out.println(getChar());
//        System.out.println(getNumber());
//        System.out.println(getName());

    }
}
