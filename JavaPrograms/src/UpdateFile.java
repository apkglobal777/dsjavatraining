import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UpdateFile {
    public static void main(String[] args) {
        //to write in the file directly
        System.out.println("Enter the file name: ");
        Scanner scanner = new Scanner(System.in);
        String filename = scanner.nextLine();
        try {
            FileWriter fileWriter = new FileWriter(filename+".txt");
            System.out.println("Enter the message in file");
            String message = scanner.nextLine();
            fileWriter.write(message);
            fileWriter.close();
            //to read the data from file
            File file = new File("updatefile.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine())
            {
                String readData = reader.nextLine();
                if (readData.contains("java"))
                {
                    System.out.println("Java keyword exists");
                }else{
                    System.out.println("Java keyword not exists");
                }
                System.out.println("read data:"+ readData);
            }
            //to update the existing file
            if (file.exists())
            {
                //to update the file
                FileWriter updateWrite = new FileWriter(file, true);
                System.out.println("Enter the update message");
                String updateData = scanner.nextLine();
                updateWrite.append(updateData + " ");
                updateWrite.close();
            }else{
               //file not found
                System.out.println("File not exists");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
