public class ExceptionHandling {
    //to control the error in programs
    public static void main(String[] args) {
        //divide by zero exceptions
        //System.out.println(100/0);
        //read the exception name / by zero
        //how to control the exception
        try {
            System.out.println(100/0);
        }catch (Exception exception)
        {
            System.out.println(exception);
        }

        //null pointer or value exceptions
        String name = null;
        try {
            System.out.println(name.length());
        }catch (Exception e)
        {
            System.out.println(e);
        }

        //number format exception
        String fullname =  "Pawan Sharma";
        try {
            int z = Integer.parseInt(fullname);
            System.out.println(z);
        }catch (Exception e)
        {
            System.out.println(e);
        }

        //out of bounds exceptions
        int array [] = {1, 2, 3, 4};

        try {
            System.out.println(array[4]);
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("This is finally code");
        }







    }
}
