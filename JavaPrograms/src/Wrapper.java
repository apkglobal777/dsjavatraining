import javax.crypto.spec.PSource;

public class Wrapper {
    public static void main(String[] args) {
        int a = 5;
        Integer b = 6;
        String c = String.valueOf(a) + b.toString();

        System.out.println(c);
    }
}
