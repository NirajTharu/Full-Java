import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readAFile {
    public static void main(String[] args) {
        
        // How to read a file in a java
        // BufferedReader + FileReader: Best for reading text file line by line.
        // FileInputStream: Best for binary files. e.g.: video and audio files
        // RandomAccessFile: Best for read/write specific portion of a file. 

        String filePath = "/Users/nirajchaudhary/Downloads/test.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            
            String line;
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            
        } catch (FileNotFoundException e ) {
            System.out.println("Could not locate the file.");
        }
        catch(IOException e){
            System.out.println("Something went wrong.");
        }
    }
}
