import java.io.FileWriter;
import java.io.IOException;

public class utils {
    public static void writeToFile(String filePath, String data){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            writer.write(data+"\n");
            writer.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
