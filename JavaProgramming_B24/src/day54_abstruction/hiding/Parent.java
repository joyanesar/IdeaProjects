package day54_abstruction.hiding;

public class Parent {

    public static void hello(){

        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    public static void hello() {

        System.out.println("Hello from Child");
    }
}
class Main{

    public static void main(String[] args) {
        Parent.hello();
        Child.hello();
    }
}
