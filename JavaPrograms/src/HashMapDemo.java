import java.util.ArrayList;
import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
        String [] name = {"wani", "pawan", "harsh", "wani"};
        int [] age = {21,26,23,25};
        for (int i = 0; i<name.length; i++)
        {
            HashMap<String, Integer> myfriends = new HashMap<>();
            myfriends.put(name[i] , age[i]);
            arrayList.add(myfriends);
        }
        System.out.println(arrayList);
        //adding the friends name with age
//        myfriends.put("Wani", 5);
//        myfriends.put("Anjali", 28);
//        myfriends.put("Harsh", 21);
//        myfriends.put("Priyal", 19);
//        myfriends.put("Yash", 21);
//        myfriends.put("Wani", 6);
//        arrayList.add(myfriends);

        System.out.println(arrayList);
//        System.out.println(myfriends);
//        for (String name : myfriends.keySet())
//        {
//            System.out.println(name);
//        }
//
//        for (int age : myfriends.values())
//        {
//            System.out.println(age);
//        }
//
//        //to access the specific value from hashmap
//        System.out.println(myfriends.get("Wani"));

    }
}
