import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Zad6 {
    public static void main(String[] args) {
        String content = readFile();
        splitFile(content);
    }

    private static String readFile(){
        File file = new File("plik.txt");
        try (
                FileInputStream inputStream = new FileInputStream(file);
                InputStreamReader fileReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8))
        {
            StringBuffer builder = new StringBuffer();
            char[] buffer = new char[(int) file.length()];
            while (true) {
                int count = fileReader.read(buffer, 0, buffer.length);
                if (count == -1) {
                    break;
                }
                builder.append(buffer, 0, count);
            }
            return builder.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }

    private static void splitFile(String text){
        String[] lines = text.split("\r?\n");

        int index = 1;

        for(String line : lines) {
            System.out.println(index++ + ". "+line);
        }
    }
}