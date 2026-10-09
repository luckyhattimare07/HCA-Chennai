package class05;

public class FunctionParameters {


    // functions with parameters

//    public static void printName(String name) {
//        System.out.println("Name: " + name);
//    }

//    static void square(int num){
//        System.out.println(num * num);
//    }


//    static void areOfCircle(float radius){
//        System.out.println(Math.PI * radius * radius);
//    }

//    static void studentDetails(String name, int age, float percentage, String collegename){
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//        System.out.println("Percentage: " + percentage);
//        System.out.println("College Name: " + collegename);
//    }

//    static void greater(int a,int b){
//        if(a>b){
//            System.out.println("A is greater");
//        } else {
//            System.out.println("B is greater");
//        }
//    }

//    static void printNum(int n){
//        for(int i=1; i<=n; i++){
//            System.out.println(i);
//        }
//    }


//    static void add(int a, int b){
//        System.out.println(a+b);
//    }
//
//    static void line(){
//        for(int i = 1; i<=10; i++){
//            System.out.print(" - ");
//
//        }
//    }


    static  void getMerge(String s1, String s2){
        String newString = s1 + " " + s2;
        System.out.println(newString);
    }

    public static void main(String[] args) {

        getMerge("Hindustan", "College");

//        add(20,30);
//        line();
//        System.out.println();
//        add(30,30);
//        line();
//        System.out.println();
//        add(50,30);

//        printNum(50);

//        greater(100,20);

//        printName("Apple");

//         square(5);

//        areOfCircle(5.6f);

//        studentDetails("Apple",10, 80.7f, "HCAS");
//        System.out.println();
//        studentDetails("Ball",10, 90.7f, "IIT");


    }
}
