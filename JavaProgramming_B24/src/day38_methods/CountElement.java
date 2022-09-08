package day38_methods;

public class CountElement {
    /*
     Create a method that accepts an int array and a number

    count and return the number of times the given number is found in the array

    return type: int
    method name: frequencyOfElement
    parameters: int [], int

    Ex: Input:
            {1, 2, 5, 1, 4, 1}, 1
        Output:
            3
     */
    public static void main(String[] args) {
        int[] arr =  {1, 2, 5, 1, 5, 1, 3,7};
        System.out.println(frequencyOfElement(arr,1));
        System.out.println(frequencyOfElement(arr, 5));
        System.out.println(frequencyOfElement(arr, 4));
        getUniqueElement(arr);
    }
    public static int frequencyOfElement(int[] nums, int element){  // it counted  how many each number in the array found

        int counter = 0;

        for(int each: nums){
            if(each == element){
                counter++;
            }

        }

        return counter;
    }
    /*
    Given a int array find and print all of  unique elements
     */

    public static void getUniqueElement(int[] nums){

        for(int each : nums){

            int counter = frequencyOfElement(nums,each); // counting

            if(counter == 1){

                System.out.println(each);
            }

        }

    }
}
