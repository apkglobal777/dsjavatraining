import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CSVFile {
    public static void main(String[] args) {
        //to create the csv file
        File file = new File("myFile.csv");
        //to check the file is already exists or not
        try {
            if (file.createNewFile())
            {
                System.out.println("File is created");
            }else {
                System.out.println("File already exists");
            }

            //to insert the data into csv file
            System.out.println("Enter students name: ");
            Scanner scanner = new Scanner(System.in);
            FileWriter writer = new FileWriter(file);
            writer.write(scanner.nextLine());
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
