import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {
        System.out.println("Enter student marks");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();
        switch (marks)
        {
            case 10:
                System.out.println("Fail");
                break;
            case 50:
                System.out.println("D grade");
                break;
            case 80:
                System.out.println("B grade");
                break;
            default:
                System.out.println("mark not match");

        }
    }
}
