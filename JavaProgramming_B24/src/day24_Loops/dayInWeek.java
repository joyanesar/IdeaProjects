package day24_Loops;

public class dayInWeek {
    public static void main(String[] args) {



        for(int day = 1; day <= 7; day++){
            System.out.println(day);


            switch (day){
                case 1:
                    System.out.println("Monday");break;
                case 2:
                    System.out.println("Tuesday");break;
                case 3:
                    System.out.println("Wednesday");break;
                case 4:
                    System.out.println("Thursday");break;
                case 5:
                    System.out.println("Friday");break;
                case 6:
                    System.out.println("Satruday");break;
                case 7:
                    System.out.println("Sunday");break;
                default:
                    System.out.println("Wrong day");

            }

        }

    }
}
