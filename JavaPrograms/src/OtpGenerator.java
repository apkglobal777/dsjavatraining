import java.util.Random;

public class OtpGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int myOtp = random.nextInt(100000);
        System.out.println(myOtp);
    }
}
