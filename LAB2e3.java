
// Write a program that asks the user to enter a word. The program will then repeat the word for as many times as its characters: Sample Output:

// Enter a word: Hello

// Expected Output :

// Hello Hello Hello Hello Hello
import java.util.Scanner;

public class LAB2e3 {
    public static void main(String[] args) {
        
    String word;
    int l;
    Scanner scan = new Scanner(System.in);
    System.out.println("Type here the word you would like: ");
    word = scan.nextLine();
    
    l = word.length();

    for (int i=0; i<l; i++){
        System.out.printf("%s ", word);
    }

    scan.close();
    }
}
