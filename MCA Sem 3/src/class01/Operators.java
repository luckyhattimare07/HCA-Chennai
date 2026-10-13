package class01;

public class Operators {
    public static void main(String[] args) {
        //Assignment operator
        // =, +=, -=, *=, /=, %=

//        int a = 10;
//        a = 20;
//
//        System.out.println(a);

//        int a = 10;
//         a += 5;
//         a -= 5;
//         a *= 10;
//         a /= 10;
//         a %= 7;
//        System.out.println(a);

        //Unary Operator
        // a++, ++a, --a, a--


//        int a  = 5;
//        System.out.println(a++);
//        System.out.println(a);

//        int a  = 5;
//        System.out.println(++a);
//        System.out.println(a);

//        int a = 5;
//
//        int c = a++ + ++a + a++;
//        System.out.println(c);

//        int a = 10;
//        System.out.println(a--);
//        System.out.println(a);

//        int a = 10;
//        System.out.println(--a);
//        System.out.println(a);


//        int a = 7;
//        int c = a++ + --a + a++;
//        System.out.println(c);

//        int a = 9;
//        int b = 3;
//        int result = a++ + ++b + a-- + --b;
//        System.out.println(result);


        //Relational operator
        // <, >, <=, >=, ==, !=

//        int a = 10;
//        int b = 20;
//        System.out.println(a<b);

//        int a = 10;
//        int b = 20;
//        System.out.println(a>b);


//        int a = 10;
//        int b = 10;
//        System.out.println(a<=b);

//        int a = 10;
//        int b = 20;
//        System.out.println(a>=b);

//        int a = 10;
//        int b = 10;
//        System.out.println(a==b);

//        int a = 10;
//        int b = 20;
//        System.out.println(a!=b);


        //Logical Operators
        // &&, ||, !
        // condition 1 LO condition 2

//        int marks  = 40;
//        System.out.println(marks>=50 && marks<=100);

//        int marks  = 40;
//        System.out.println(marks>=50 || marks<=100);

//        int age = 20;
//        System.out.println(!(age>=18));

        //Ternary Operator
        // condition ? value1 : value2

//        int age = 15;
//        System.out.println(age>=18 ? "Adult" : "Minor");
//
//        int marks = 80;
//        System.out.println(marks >=40 ? "Pass" : "Fail");

//        int num = 52;
//        System.out.println((num%2==0)? "Even" : "Odd");

//        int num = 50;
//        System.out.println(num < 0 ? "Negative" : "Positive");


//        int marks = 20;
//        String ans = marks >= 80 ? "A" :
//                     marks >= 50 ? "B" :
//                     marks >= 33 ? "C" : "Fail";
//
//        System.out.println(ans);

//        int a = 200;
//        int b = 100;
//        int c = 30;
//        System.out.println((a>b && a>c) ? "A" :
//                (b>a && b>c) ? "B" : "C");


        //Operator precedence
        //() has higher priority always, then * / % have same

        int ans = 10 / (5 * 2) - 10;
        System.out.println(ans);













    }
}
