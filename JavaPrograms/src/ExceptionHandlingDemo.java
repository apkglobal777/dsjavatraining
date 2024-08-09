public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        //to control over the errors
        //problem statement 1 divide by zero -> ArithmeticException
//        int a = 100/0;
//        System.out.println(a);

        //solution on divide by zero
//        try {
//            int b = 100/0;
//            System.out.println(b);
//        }catch (ArithmeticException e)
//        {
//            System.out.println(e);
//        }

        //problem statement 2 -> NumberFormatException
      //  String name = "Pawan Sharma";
//        int i = Integer.parseInt(name);
//        System.out.println(i);

        //solution statement 2
//        try {
//            int i = Integer.parseInt(name);
//            System.out.println(i);
//        }catch (NumberFormatException e)
//        {
//            System.out.println(e);
//        }catch (ArithmeticException arithmeticException)
//        {
//
//        }

        //comparision in between null and empty string
//        String fullname = null;
//        String fname = "";
//        if(fullname == fname)
//        {
//            System.out.println("Equal");
//        }else {
//            System.out.println("not equal");
//        }

        //problem statement 3->ArrayIndexOutOfBoundsException
//        int [] array = {1,3,5,7};
//        try {
//            System.out.println(array[4]);
//        }catch (ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println(e);
//        }

        //problem statement 4->
//        String collegename = null;
//        try {
//            System.out.println(collegename.length());
//        }catch (NullPointerException e)
//        {
//            System.out.println(e);
//        }

        try {
            String lname = null;
            int i = Integer.parseInt(lname);
            System.out.println(i);
            System.out.println(lname.length());
            int a = i/0;
            System.out.println(a);
            int arr [] ={1,2,3};
            System.out.println(arr[3]);
        }catch (NullPointerException nullPointerException)
        {
            System.out.println(nullPointerException);
        }catch (NumberFormatException numberFormatException)
        {
            System.out.println(numberFormatException);
        }catch (ArithmeticException arithmeticException)
        {
            System.out.println(arithmeticException);
        }catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
        {
            System.out.println(arrayIndexOutOfBoundsException);
        }
        finally {
            System.out.println("this is finally");
        }



    }
}
