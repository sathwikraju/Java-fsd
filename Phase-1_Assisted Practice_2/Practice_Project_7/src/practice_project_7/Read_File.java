package practice_project_7;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read_File {
    public static void main(String[] args) {
        File file = new File("File_Name.txt");

        try {
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
