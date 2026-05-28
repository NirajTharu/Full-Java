import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class writeAFile {
    public static void main(String[] args) {
        
        // Write a file in java
        // Ways: 
        // 1. FileWriter: Good for small or medium size text file
        // 2. BufferWriter: Better performance for large amounts of texts
        // 3. PrintWriter: Best for structured data, like reports or logs
        // 4. FileOutPutStream: Best for binary files (e.g.: audio, video files)


        // String filePath = "/Users/nirajchaudhary/Downloads";

        String textContent = """
                Hi there this one is the multi line comment. 
                Long time no see.
                Good to see you again.
                """;
        try(FileWriter fileWriter = new FileWriter("test.txt");){
            fileWriter.write(textContent);
            System.out.println("File has been wirtten.");
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found.");
        }
        catch(IOException e)
        {
            System.out.println("Could not open the file.");
        }
    }
}
