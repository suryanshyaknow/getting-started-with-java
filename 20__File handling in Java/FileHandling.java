import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

import javax.annotation.processing.Filer;

public class FileHandling {

    public static void main(String[] args) {

        // Creating a new file
        File newfile = new File("sample_file.txt");
        System.out.println("newFile" + newfile); // Prints out the file name
        try {
            newfile.createNewFile();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Unable to create this file!");
            e.printStackTrace();
        }

        // Writing into a file
        try {
            FileWriter fileWriter = new FileWriter("sample_file.txt");
            System.out.println("fileWriter" + fileWriter); // --> java.io.FileWriter@36baf30c
            fileWriter.write(
                    "This is a sample file created via java code for the implementation of file handling in java.\nCheers!");
            fileWriter.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // Reading a file: Method 1
        try {
            FileReader fileReader = new FileReader("sample_file.txt");
            System.out.println("fileReader = " + fileReader);

            /**
             * The `FileReader` is wrapped in a `BufferedReader` for efficient reading.
             * The `BufferedReader` reads the file line by line using the readLine() method.
             */
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println("bufferedReader = " + bufferedReader);

            // System.out.println(fileReader.readLine()); // --> 84, God knows why!

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();

        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // Reading a file: Method 2
        File myFile = new File("sample_file.txt");
        try {
            Scanner scanner = new Scanner(myFile);
            System.out.println("scanner = " + scanner);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        // Deleting a file
        System.out.println(myFile.delete());
    }

}
