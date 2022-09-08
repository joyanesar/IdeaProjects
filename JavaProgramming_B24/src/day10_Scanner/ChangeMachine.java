package day10_Scanner;

import java.util.Scanner;

public class ChangeMachine {
    public static void main(String[] args) {
        /*

        how many
        quarters
        dimes
        nickles
        pennies
         */

        Scanner key = new Scanner(System.in);
        int userMoney, quarters,dimes,nickles,pennies;

        System.out.println("Hello welcome to the change machine");
        System.out.println("Enter your cents from 1-99");

        userMoney = key.nextInt(); // 83

        quarters = userMoney / 25; // 83 / 25 = 3   | 83 - 75
        userMoney %= 25;
        dimes = userMoney / 10; // 8 /10
        userMoney %= 10;       // 8 % 10 > 8
        nickles = userMoney / 5; // 8 /5 -> 1 | 8 -5 => 3
        userMoney %= 5;      // 3
        pennies = userMoney ;

        System.out.println("Your change is :");
        System.out.println("quarters :" + quarters);
        System.out.println("dimes " + dimes);
        System.out.println("nickles :" + nickles);
        System.out.println("pennies " + pennies);

        key.close();





    }
}
