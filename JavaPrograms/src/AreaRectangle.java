import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        System.out.println("enter width height");
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();
        int area = areaRectangle(width, height);
        System.out.println(area);
    }
    private static int areaRectangle(int width, int height) {
        return (width*height);
    }
}
