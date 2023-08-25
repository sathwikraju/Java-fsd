package practice_project_7;
import java.io.FileWriter;
import java.io.IOException;

public class Update_File {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("File_Name.txt", true);
            writer.write("New content to append\n");
            writer.close();
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while updating the file.");
            e.printStackTrace();
        }
    }
}
