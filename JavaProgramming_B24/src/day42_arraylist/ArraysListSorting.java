package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysListSorting {
    public static void main(String[] args) {

        // How did you sort arrays?
        // we used Arrays.sort()

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4,50,6,45,87,20,36,98,77,95,-20));

        Collections.sort(nums);
        System.out.println(nums);
    }
}
