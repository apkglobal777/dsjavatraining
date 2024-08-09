import java.util.ArrayList;
import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        //to store the data in key value pair
        //HashMap<String, int> hashMap = new HashMap<String, int>();
        ArrayList<HashMap<String, Integer>> arrayList = new ArrayList<>();
        String [] name = {"wani", "anshu", "wani", "anshu", "ivan"};
        int [] age = {5, 27, 16, 20, 37};
        for (int i=0; i<name.length; i++)
        {
            HashMap<String, Integer> myfriends = new HashMap<>();
            myfriends.put(name[i], age[i]);
            arrayList.add(myfriends);
        }

        System.out.println(arrayList);
        //to add the values in hashmap
//        myfriends.put("wani", 5);
//        myfriends.put("anshu", 27);
//        myfriends.put("ivan", 37);

//        System.out.println(myfriends);
        //to access the name as keys
//        for (String name : myfriends.keySet()){
//            System.out.println(name);
//        }
        //to access the values from hashmap
//        for (int age : myfriends.values()){
//            System.out.println("before"+age);
//        }

        //myfriends.put("wani", 6);

        //to access the values from hashmap
//        for (int age : myfriends.values()){
//            System.out.println("after"+age);
//        }

        //to access the specific value
//        System.out.println(myfriends.get("ivan"));
//        //myfriends.clear();
//        System.out.println("after clear"+ myfriends);

//        if (myfriends.containsKey("wani"))
//        {
//            System.out.println("name already exists");
//        }

        //to iterate the given hashmap based on keys
//        for (String name: myfriends.keySet()){
//            //to check the age is greater than 20
//            if (myfriends.get(name) > 20)
//            {
//                System.out.println(name);
//            }
//        }

    }
}
