import java.util.ArrayList;
import java.util.Collections;

public class CustomArrayList {
    public static void main(String[] args) {
        //declare the arraylist
        ArrayList<String> arrayList = new ArrayList<>();
        //initialize the arraylist
        arrayList.add("Anshu");
        arrayList.add("Ivan");
        arrayList.add("Kunal");
        arrayList.add("Anjali");
        //to access the arraylist
        System.out.println(arrayList);
        for (String name : arrayList)
        {
            System.out.println(name);
        }

        //to access the specific record
        //System.out.println(arrayList.get(2));

        //sorting the data
        Collections.sort(arrayList);
        System.out.println(arrayList);


    }
}
