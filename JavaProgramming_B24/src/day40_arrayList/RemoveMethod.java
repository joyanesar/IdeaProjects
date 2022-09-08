package day40_arrayList;

import java.util.ArrayList;

public class RemoveMethod {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("water"); // here we add value to the String
        list.add("sun");
        list.add("wind");
        list.add("wood");
        System.out.println(list); // this print all string in one Array list

        list.remove(0); //removes the first element
        System.out.println(list);
        list.remove(list.size()-1); //This removes the last elements
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        System.out.println();

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(50);
        nums.add(70);
        nums.add(80);

        System.out.println(nums);

        int firstRemoved= nums.remove(1); //
        System.out.println("First remove element " + firstRemoved);
        System.out.println(nums);



    }
}
