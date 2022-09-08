package day15_statements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which browser do you want to use");
        String browser = input.next();
        System.out.println("Enter the url:");
        String url = input.next();

        switch (browser){
            case "chrome  || CHROME":
                System.out.println("Opening " + url + " in chrome");
                break;
            case "firefox":
                System.out.println("Opening " + url + "in firefox");
                break;
            case "safari":
                System.out.println("Your max opening safari");
                System.out.println("Going to " + url);
                break;
            case "ie":
                System.out.println("IE is no longer supported");
                break;
            case "edge":
                System.out.println("Edge is opening " + url);
                break;
            default:
                System.out.println("Invalid browser");
        }

    }
}
