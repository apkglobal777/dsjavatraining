import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class RishabhFile {
    public static void main(String[] args) {
        //create the file
        File file = new File("Rishabh.txt");
        try {
            if(file.createNewFile())
            {
                System.out.println("File is created");
            }
            else{
                System.out.println("File is already existed");
            }
            //To write the file
            FileWriter writer = new FileWriter(file);
            System.out.println("Enter the msg in your file");
            Scanner scanner = new Scanner(System.in);
            writer.write(scanner.nextLine());
            writer.close();

            // to read the file
            Scanner scanner1 = new Scanner(file);
            String data="";
            while(scanner1.hasNextLine())
            {
                data = scanner1.nextLine();
            }

            // to update the file
//            System.out.println("Enter your update msg");
//            String update = scanner.nextLine();
//            FileWriter updatewriter = new FileWriter(file,true);
//            updatewriter.append( " "+update+" ");
//            updatewriter.close();

            //search the string exists in the file or not
            System.out.println("what you want to search");
            String search = scanner.nextLine();
            if (data.contains(search))
            {
                System.out.println("Found");
            }else {
                System.out.println("not found");
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
