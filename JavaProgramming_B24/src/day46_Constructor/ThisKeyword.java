package day46_Constructor;

public class ThisKeyword {

    int a = 100;    // instance variable

    public ThisKeyword(int a){ // a is local variable here
        System.out.println(a + " a  local");
       a = 400;    // reassign the local a to be 400

    }

    public static void main(String[] args) {
        ThisKeyword obj = new ThisKeyword(200);
        System.out.println(obj.a + " instance");
        System.out.println();
    }

}
