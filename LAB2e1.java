
// Write a program that asks the user for a starting value and an ending value and then writes all the integers (inclusive) between those two values.

// Input the start: 3 Input the End: 9

// Expected Output :

// 3 4 5 6 7 8 9

import java.util.Scanner;

public class LAB2e1 {
    public static void main(String[] args) {
    
    int st;
    int en;

    Scanner scan = new Scanner(System.in);
    System.out.println("Type here the start number: ");
    st = scan.nextInt();

    System.out.println("Type here the end number: ");
    en = scan.nextInt();

    for (int i = st; i <= en; i++){

        System.out.println(i);
    }
    scan.close();
    }
}
