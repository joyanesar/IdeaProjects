package day38_methods;

public class TypePromotions {
    public static void main(String[] args) {

        use(3);
        use(5.3);
        use(3.8f);
        use(-1.5);

    }
    public static void use(float f){
        System.out.println("using the float method");
    }

    public static void use(double d){
        System.out.println("using the double method");
    }
    public static void use(long c){
        System.out.println("using the long method");
    }
}
