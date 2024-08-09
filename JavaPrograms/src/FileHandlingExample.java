import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingExample {
    public static void main(String[] args) {
        //file handling work on file:- create, write, read, update, delete, access, search
        System.out.println("Enter the file name: ");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        //1. To create the file :- filename and extension
        File file = new File(filename+".txt");
        //to check the file is already created or not
        try {
            if (file.createNewFile())
            {
                System.out.println("File is created");
            }else{
                System.out.println("File already exists");
            }
            //2. write the data in your file
            //write the file using filename and extension
            //check the file is exists with same name or not
            if (file.exists())
            {
                FileWriter writer = new FileWriter(filename+".txt");
                System.out.println("Write the message in your file");
                String message = scanner.nextLine();
                //to write the msg in your file
                writer.write(message);
                writer.close();
            }else {
                System.out.println("File not found");
            }

            //3. read the file using scanner
            Scanner reader = new Scanner(file);
            String data = "";
            while (reader.hasNextLine()){
                 data= reader.nextLine();
            }
            System.out.println(data);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
