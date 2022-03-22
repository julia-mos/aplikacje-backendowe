import java.io.*;
import java.nio.charset.StandardCharsets;

public class Zad2 {
    public static void main(String[] args) {
        File file = new File("zad2.txt");
        try (
                FileOutputStream outputStream = new FileOutputStream(file);
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        )
        {
            String text = reader.readLine();

            outputStream.write(text.getBytes(StandardCharsets.UTF_8));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
