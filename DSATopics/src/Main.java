import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Array, N-Array, Stack, Queue, Interface, HashSet
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //Declare the array, it can store the multiple value datatype should be same
        String [] nameArray;
        //initialization the values inside the array
        nameArray = new String[]{"Pawan Sharma", "Abhay", "Ashutosh", "risabh", "aman"};

        System.out.println(nameArray);
        for (String name :nameArray)
        {
            System.out.println(name);
        }

        //operation on array
        //1. Access the specific data from array
        //System.out.println(nameArray[5]);
        //arrayName[index]
        System.out.println(nameArray.length);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("pawan");
        arrayList.add("sakshi");
        arrayList.add("asmita");
        arrayList.add("anjali");
        System.out.println(arrayList);

        System.out.println(arrayList.size());
        System.out.println("before");
        for (String name :nameArray)
        {
            System.out.println(name);
        }
        Arrays.stream(nameArray).sorted();
        System.out.println("after");
        for (String name :nameArray)
        {
            System.out.println(name);
        }

        //to modify the given array
        nameArray[0] = "Satyam Sharma";
        for (String name :nameArray)
        {
            System.out.println(name);
        }

        // 1 2 3 4 5
        //to print the array in reverse order
        for (int i =nameArray.length - 1; i >= 0; i--)
        {
            System.out.println("Reverse Order "+ nameArray[i]);
        }

        //N dimensional Array
        //declaration and initilization of 2 dimensional array
        int [][] noArray = new int[2][2];
        //add the value in 2d array
        noArray = new int[][]{{1, 2}, {3, 4}};
        //row
        for (int i = 0; i < 2; i ++)
        {
            //col
            for (int j = 0; j < 2; j++)
            {
                System.out.print(noArray[i][j]);
            }
            System.out.println();
        }

//              col 0 col 1
//        row 0 [0,0][0,1]
//        row 1 [1,0][1,1]

        //Add these element into 3 dimensional array 2*2 = 4 , 3* 3 = 9

//         0 1 2
//     0   9 9 9
//     1   6 6 6
//     2   1 1 1


        int ar[][][] = {{{1,2,3},{4,5,6},{7,8,9}}};
        int sum = 0;
        for (int i =ar.length - 1; i >= 0; i--)
        {
            //col
            for (int j = ar[i].length - 1; j >= 0; j--)
            {
                for (int k = ar[i][j].length - 1; k >= 0; k--)
                {
                    System.out.print(ar[i][j][k] + " ");
                    //to print the sum of elements
                    sum = sum + ar[i][j][k];
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println(sum);

        //swap first row to col
        //find the every row addition is odd or even

        //Stack








    }
}