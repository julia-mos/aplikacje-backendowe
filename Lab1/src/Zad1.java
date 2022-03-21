import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Zad1 {
    public static void main(String[] args) {
        File file = new File("plik.txt");
        try (
                FileInputStream inputStream = new FileInputStream(file);
                InputStreamReader fileReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8))
        {
            StringBuffer builder = new StringBuffer();
            char[] buffer = new char[1024];
            while (true) {
                int count = fileReader.read(buffer, 0, buffer.length);
                if (count == -1) {
                    break;
                }
                builder.append(buffer, 0, count);
            }
            String text = builder.toString();
            System.out.println(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
