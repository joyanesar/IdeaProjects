package day29_Array;

public class MaxNumber {
    public static void main(String[] args) {


        int [] numbers =  {6, 2, 8, 4};

        int max = 0;

        if(numbers[0] > max){   // 6 > 0
            max = numbers[0];   // max =6

        }
        if(numbers[1] > max){   // 2 > 6
            max += numbers[1];  // max = 2
        }
        if(numbers[2] > max){  // 8 >0
            max = numbers[2];
        }
        if(numbers[3] > max){
            max = numbers[3];
        }
        System.out.println(max);
    }

}
