public class ArrayDemo {
    public static void main(String[] args) {
        int [] no = {1, 12, 7, 11, 9};
        int sum = 0;
        for (int i = 0; i < no.length; i++) {
            sum+=no[i];
        }
        int avg = (sum/no.length);
        System.out.println(avg);
    }
}
