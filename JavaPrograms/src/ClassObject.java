import java.security.spec.RSAOtherPrimeInfo;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ClassObject {
    public static void main(String[] args){
        //call the class and initializer the object
        Trainer trainer = new Trainer();
        System.out.println("Enter the trainer name");
        Scanner scanner = new Scanner(System.in);

        System.out.println(trainer.trainerName+trainer.trainerTechnology);

    }
}
class Trainer{
    String trainerName;
    String trainerTechnology;
}
class Student{
    String studentName;
    String enrolledTechnology;

}