package day25_For_Loops;

public class Syllables {
    public static void main(String[] args) {
/*


        Syllables
        Given a String separated by dashes calculate how many syllables the words are
        Ex:
        Input:
        ja-va Output:
        2
        */

        String str = "ja-va";
        String syllabes = " ";

        int count = 0;

        for (int i =0 ; i < str .length(); i++ ){

           if (str.charAt(i) == '-'){
               count++;
           }

        }
        System.out.println(count + 1);
    }
}
