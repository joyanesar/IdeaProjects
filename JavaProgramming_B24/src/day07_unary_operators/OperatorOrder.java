package day07_unary_operators;

public class OperatorOrder {
    public static void main(String[] args) {


        System.out.println( 5 + 2 * 3 );
//                         5   + 6
//                          11

        System.out.println(5 * 4 -10 / 2);

//                          20 - 10 / 2
//                          15

        System.out.println(5 * (4 - 10) / 2 );
    }
}
