package OOPS;

public class InheritanceJava extends Calc {
    public static void main(String[] args) {
        Calc calc = new Calc();
        System.out.println(calc.add(4,2));
        System.out.println(calc.sub(4,2));
        System.out.println(calc.div(4, 2));
        System.out.println(calc.mul(4,2));
    }
}
//class Parents extends GrandParents{
//    void printParent(){
//        System.out.println("im parent");
//    }
//}
class Calc{
    int add(int a, int b)
    {
        return a+b;
    }
    int sub(int a, int b)
    {
        return a-b;
    }
    int mul(int a, int b)
    {
        return a*b;
    }
    int div(int a, int b)
    {
        return a/b;
    }
}
