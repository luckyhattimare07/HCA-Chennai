package class05;

public class CalculatorFuntcions {
    static void add(int a, int b){
        System.out.println(a+b);
    }

    static void subtract(int a, int b){
        System.out.println(a-b);
    }

    static void multiply(int a, int b){
        System.out.println(a*b);
    }

    static void divide(int a, int b){
        System.out.println(a/b);
    }

    static void mod(int a, int b){
        System.out.println(a%b);
    }

    public static void main(String[] args) {
        add(5,6);
        add(10,20);
        subtract(20,10);
        multiply(10,5);
        divide(12,6);
        mod(10,4);
    }
}
