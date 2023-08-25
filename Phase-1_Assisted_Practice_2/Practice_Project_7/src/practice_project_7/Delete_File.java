package practice_project_7;
import java.io.File;

public class Delete_File {
    public static void main(String[] args) {
        File file = new File("Java.txt");

        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
