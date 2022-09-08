package Office_Hours;

import java.util.Scanner;

public class ReverseEachWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words separate by a space");

        String original = input.nextLine();

        String[] words = original.split(" ");

        //String[] words = input.nextLine().trim().split(" ");

        String result = " ";

        for(String eachWord : words){
           // System.out.println(eachWord);  // reverse word

            String reverse = " ";

            for (int i = eachWord.length() -1; i >= 0; i--){
                reverse += eachWord.charAt(i);
            }
            result += reverse + " ";
        }
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + result);
    }
}
