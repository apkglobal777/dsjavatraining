import java.util.Random;

public class GenerateOTP {
    public static void main(String[] args) {
        Random random = new Random();
        //to store the random no
        int myOTP = random.nextInt(1000000);
        System.out.println("Your OTP is: "+ myOTP);
    }
}
