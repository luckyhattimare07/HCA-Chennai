package class02;

import java.util.Scanner;

public class canteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Item Name: ");
        String item  = sc.nextLine();

        System.out.print("Enter price: ");
        int price = sc.nextInt();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();


        System.out.println("You have to pay: " + (price * quantity) + "rs");

    }

}
