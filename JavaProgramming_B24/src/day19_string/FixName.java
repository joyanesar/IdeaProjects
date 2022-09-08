package day19_string;

import java.util.Locale;
import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        /*
        Ask the user to enter their first name
         Ask the user to enter their last name

         make sure the name is properly formatting

         each first letter of both names is capital and the rest are lowercase
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.next();

        System.out.println("Enter your lastName");
        String lastName = input.next();


        String firstNameFirstLetter = firstName.substring(0,1);
        String lastNameFirstLetter  = lastName.substring(0,1);

        firstNameFirstLetter = firstNameFirstLetter.toUpperCase();
        lastNameFirstLetter = lastNameFirstLetter .toUpperCase();

        String  remainingFirstName = firstName.substring(1);
        String remainingLastName   = lastName.substring(1);

        remainingFirstName = remainingLastName.toLowerCase();
        remainingLastName = remainingLastName .toLowerCase();

        System.out.println(firstNameFirstLetter + remainingFirstName + " " + lastNameFirstLetter + remainingLastName);


    }
}
