import java.util.Scanner;

public class ConstructorDemo {
    public static void main(String[] args) {
        //call the constructor object
        System.out.println("Enter a and b value: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Choose the options \n 1 for Addition \n 2 for Subtraction \n 3 for division \n 4 for multiple");
        int c = scanner.nextInt();
        MyClass myClass = new MyClass(a,b,c);
    }
}
class MyClass{
    //parameter constructor
    public MyClass(int a, int b, int choice) {
        this.a = a;
        this.b = b;
        this.c = choice;
        switch (choice){
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a / b);
                break;
            case 4:
                System.out.println(a * b);
                break;
            default:
                System.out.println("You select wrong options");
        }

    }
     int a, b,c;
}
