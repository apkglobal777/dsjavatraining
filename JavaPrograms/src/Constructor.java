import java.util.Scanner;

public class Constructor {
    public static void main(String[] args) {
        System.out.println("Enter a and b");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Enter your choice: \n 1 for addition \n 2 for subtraction \n 3 for multiply \n 4 for division");
        int choice = scanner.nextInt();
        Calculator c = new Calculator(a,b,choice);
    }
}

class Calculator
{
    public Calculator(int a, int b, int choice) {
        this.a = a;
        this.b = b;
        this.choice = choice;

        switch (choice)
        {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println( a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println(a/b);
                break;
        }
    }

    int a, b, choice;
}
