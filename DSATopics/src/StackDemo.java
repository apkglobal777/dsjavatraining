import java.util.ArrayList;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        //to add the data into stack
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(1);
        stack.push(3);
        stack.push(5);
        stack.push(7);

        System.out.println(stack);

        //pop will remove the element from stack
        //stack.clear();
        System.out.println(stack);

//        while (!stack.isEmpty())
//        {
//            stack.pop();
//        }
//        System.out.println(stack);

        //to display the first element in stack
        System.out.println(stack.peek());

        //print 3 7 1 -> count no of pop push peek
        // 1  3  5  7  1  3  5  7
        // 3  7  1

        //print 7 pop - wrong approach

//        stack.pop(); // 7 remove
//        stack.pop(); // 5 remove// access 3
//        stack.pop(); // remove 1
//        stack.pop();
//        stack.pop();
//        stack.pop(); // remove 1
//        stack.pop();
//        stack.pop();
//        stack.push(3);
//        stack.push(7);
//        stack.push(1);


        //right approach
        stack.pop();
        stack.pop();
        int value = stack.peek();
        stack.pop();
        stack.pop();
        int value2 = stack.peek();
        stack.pop();
        stack.pop();
        stack.pop();
        int value3 = stack.peek();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(value);
        arrayList.add(value2);
        arrayList.add(value3);
        System.out.println(arrayList);











    }
}
