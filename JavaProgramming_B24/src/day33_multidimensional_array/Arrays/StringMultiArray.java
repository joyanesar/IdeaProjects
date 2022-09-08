package day33_multidimensional_array.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMultiArray {
    public static void main(String[] args) {
        String [][] cybertek = new String[4][]; //  4 it has four size element empty
                                                  // 2 shows how many pairs
        String [] groupOne = {"Sergii", "Nisso", "Rano"};
        String [] groupTwo = {"Mubarek", "Ibrahim"};
        String [] groupThree = {"Nadir", "Saim"};
        String [] groupFour= {"Nicole", "Tach", "Ailya", "Mohammed"};

        cybertek[0] = groupOne;
        cybertek[1] = groupTwo;
        cybertek[2] = groupThree;
        cybertek[3] = groupFour;

        System.out.println(cybertek.length);
        System.out.println(Arrays.deepToString(cybertek));

        for(String[] groups: cybertek){  // printed each loop in spared
            //System.out.println(Arrays.toString(groups));
            System.out.println("Group members:");

            for(String member: groups){
                System.out.println(member);

            }
        }
    }
}
