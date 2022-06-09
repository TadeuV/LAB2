
// Write a program that asks the user for N and then sum all the integers (inclusive) between 1 and N.

// Input the N: 10

// Expected Output :

// The sum of 1 to 10 is 55

import java.util.Scanner;

public class LAB2e2 {
    public static void main(String[] args) {
        
    int n;
    int sum = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("Type the number desired: ");
    n = scan.nextInt();

    for (int i=1; i<=n; i++) {
        sum+=i;
    }
    System.out.println("The sum of the number is: "+sum);

    scan.close();

    }
}
