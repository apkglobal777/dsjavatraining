package OOPS;

import static java.awt.AWTEventMulticaster.add;
//total memory =
public class PolyMorphismMethodOverloading {
    public static void main(String[] args) {
        //method calling for addition integer
         // 8 int
         // 16 double
        System.out.println("M1" + add(5, 6)
                + "M2"+ add(2.5, 9.3));
    }

    private static double add(double v, double v1) {
        return v + v1;
    }

    private static int add(int i, int i1) {
        return i + i1;
    }
}
