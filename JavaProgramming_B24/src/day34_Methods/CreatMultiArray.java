package day34_Methods;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CreatMultiArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String [][] allWords = new String[3][]; // [4] create array elements  [2] how many pairs

        System.out.println(Arrays.deepToString(allWords));
        // today is sunday
        System.out.println("Enter multiple words seperated by a space");
        String [] first =input.nextLine().split(" ");
        //System.out.println(Arrays.toString(first));
        allWords[0] = first;

        System.out.println("Enter the next words");
        allWords[1]=input.nextLine().split(" ");

        System.out.println("Enter the last set of words");
        String word = input.nextLine();
        String [] wordArr = word.split(" ");
        allWords[2] = wordArr;


        System.out.println(Arrays.deepToString(allWords));


    }
}
