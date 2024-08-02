import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
    public static void main(String[] args) {
        //add your 5 friends name
        ArrayList<String> namelist = new ArrayList<>();
        //to add 5 friends name into arraylist
        namelist.add("Anshu");
        namelist.add("Ivan");
        namelist.add("Rahul");
        namelist.add("Kunal");
        namelist.add("Mudit");
        //print the arraylist name using for each loop
        for (String name : namelist)
        {
            System.out.println(name);
        }
        //to get the specific value using index
        System.out.println(namelist.get(namelist.size() - 1));
        //sort the arraylist
        Collections.sort(namelist);
        System.out.println(namelist);
        //reverse the arraylist element
        for (int i = namelist.size() - 1; i >= 0 ; i--) {
            System.out.println(namelist.get(i));
        }
        //find the repeated elements in arraylist
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Pawan");
        arrayList.add("Raman");
        arrayList.add("Chaman");
        arrayList.add("Naman");
        arrayList.add("Pawan");

    }
}
