import java.util.Scanner;

public class StringStatement {
    public static void main(String[] args) {
      /*  String name = "Pawan Sharma";
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println("Enter ur name");
        Scanner scanner = new Scanner(System.in);
        String sname = scanner.nextLine();
        if (sname.equals("pawan sharma"))
        {
            System.out.println("allowed");
        }
        else {
            System.out.println("not allowed");
        }*/

        printMyName();
    }

    private static void printMyName() {
        Scanner scanner = new Scanner(System.in);
        String myName = scanner.nextLine();
        System.out.println(myName);
    }
}
