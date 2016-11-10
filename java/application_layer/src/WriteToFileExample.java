import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//http://www.mkyong.com/java/how-to-write-to-file-in-java-bufferedwriter-example/
public class WriteToFileExample {
    public static void main(String[] args) {
        try {

            String content = "Now this is the mother fucking content bitches!";

            File file = new File("C:\\test_folder\\filename.txt");

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}