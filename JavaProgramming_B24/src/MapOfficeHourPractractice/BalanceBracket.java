package MapOfficeHourPractractice;
import day53_Inheritance.Rules.C;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalanceBracket {
    /*
     * [IQ] Create a method that will accept a String of brackets. Determine if the brackets are balanced. Brackets are balanced if the closing bracket matches the opening one.
     * Ex: {([])} -> balanced
      {[(])} -> not balanced
     */
    public boolean isBalanced(String  str){
        Map<Character,Character> map = new HashMap<>();
        map.put('{','}');
        map.put('(',')');
        map.put('[',']');
        Stack<Character> stack = new Stack<>(); //stack

        for(int i = 0; i <str.length(); i++){
            if(map.containsKey(str.charAt(i))){
                stack.push(str.charAt(i));
            }else {

                if(stack.isEmpty() || str.charAt(i) != map.get(stack.pop()));// ] != map.get('[')
                return false;
        }

        }
       return stack.isEmpty();

    }


    }


