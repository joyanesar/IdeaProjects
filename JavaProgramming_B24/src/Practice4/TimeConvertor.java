package Practice4;
import java.util.Scanner;
public class TimeConvertor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputSeconds, hours, minutes, seconds;
        System.out.println("Enter seconds:");

        inputSeconds = scan.nextInt();

        hours = inputSeconds / 3600;
        minutes = (inputSeconds % 3600) / 60;
        seconds = (inputSeconds % 3600) % 60;

        System.out.println(hours + " hours, "+ minutes + " minutes, and " + seconds + " seconds");
    }
}
