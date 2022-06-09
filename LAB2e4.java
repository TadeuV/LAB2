
// Write a program that adds up integers that the user enters. First the programs asks how many numbers will be added up. Then the program prompts the user for each number. Finally it prints the sum. Sample output:

// How many integers will be added? 5 Enter an integer: 3 Enter an integer: 4 Enter an integer: -4 Enter an integer: -3 Enter an integer: 7

// Expected Output :

// The sum is 7

import java.util.Scanner;

public class LAB2e4 {
    public static void main(String[] args) {
        
    int many;
    int sum =0;

    Scanner scan = new Scanner(System.in);
    System.out.println("How many numbers would you like to add?");
    many = scan.nextInt();

    for (int i=1; i<=many; i++) {
        int num;

        System.out.printf("Type here the %d number:", i);
        num = scan.nextInt();
        sum = sum+num;


    }
    System.out.println("The total sum is: "+sum);

    scan.close();

    }
}
