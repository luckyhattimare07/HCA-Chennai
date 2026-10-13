package class03;

public class IfElse {
    public static void main(String[] args) {
        // if - else

        // if (condition) {
        // logic
        // }
        // else{
        // logic
        // }

//        int age = 20;
//        if(age>= 18){
//            System.out.println("Adult");
//        }
//        else{
//            System.out.println("Minor");
//        }

//        int marks = 45;
//        if(marks>=50){
//            System.out.println("pass");
//        }
//        else{
//            System.out.println("Fail");
//        }


//        int attendance = 80;
//        if(attendance>=75){
//            System.out.println("Eligible to give exam");
//        }
//        else {
//            System.out.println("Not eligible to give exam");
//        }


//        int num = 21;
//        if(num%2 ==0){
//            System.out.println("EVEN");
//        } else {
//            System.out.println("ODD");
//        }

//        int num = 20;
//        if(num>0){
//            System.out.println("Positive");
//        } else {
//            System.out.println("Negative");
//        }

        // else - if

        int marks = 95;
        if(marks>=90){
            System.out.println("Grade A");
        } else if (marks>=70) {
            System.out.println("Grade B");
        } else if (marks >= 40) {
            System.out.println("Grade C");
        } else {
            System.out.println("Fail");
        }

    }
}
