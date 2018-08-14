import java.util.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Open a file called "my-file.txt"
        // Write your name in it as a single line
        // If the program is unable to write the file,
        // then it should print an error message like: "Unable to write file: my-file.txt"
        List<String> content = new ArrayList();
        content.add("Koch Robert");
        try{
            Path filePath = Paths.get("my-file.txt");
            Files.write(filePath,content);

        }catch(Exception e){
            System.out.println("no file found");

        }


    }
}
