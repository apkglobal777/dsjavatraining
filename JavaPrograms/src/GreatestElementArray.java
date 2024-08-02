public class GreatestElementArray {

    static int arr[] = {1, 3, 4, 9, 10};

    // Method to find maximum in array
    static int largestElement()
    {
        int i;

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    // Driver method
    public static void main(String[] args)
    {
        System.out.println("Largest element " + largestElement());
    }
}
