import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {
    public static void main(String[] args) {
        //to write the data into file
        System.out.println("Enter the file name");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        System.out.println("Enter message in your file");
        String data = scanner.nextLine();
        FileWriter writer = null;
        try {
            writer = new FileWriter(filename+".txt");
            writer.write(data);
            writer.close();
            System.out.println("Successfully write");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //to read the data from file
        File myObj = new File(filename+".txt");
        Scanner myReader = null;
        try {
            myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data1 = myReader.nextLine();
                System.out.println(data1);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        //to delete the file
        File deleteFile = new File("vibha.txt");
        if (deleteFile.delete())
        {
            System.out.println("File is deleted");
        }
        else {
            System.out.println("File not found");
        }



        //file handling crud on file
       //File myFile = new File("sakshi.txt");
        //check the file is already exists with same name or not
//        try {
//            if (myFile.createNewFile())
//            {
//                System.out.println("New file is created with Pawan name");
//            }
//            else {
//                System.out.println("The file is already exists with same name");
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

    }
}
