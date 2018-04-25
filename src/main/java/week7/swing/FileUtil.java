package week7.swing;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileUtil {

    private FileUtil(){}

    public static String getSource(String fileName) {
        Path path = Paths.get(fileName);
        try {
            List<String> lines = Files.readAllLines(path);
            StringBuilder sb = new StringBuilder();
            for (String s : lines){
                sb.append(s).append("\n");
            }
            return sb.toString();
        } catch (IOException e) {
            System.err.println("Some exception occurred - " + e.getMessage());
        }
        return null;
    }

    public static void saveTextFile(String fileName, String source){
        Path path = Paths.get(fileName);
        try {
            Files.write(path, Arrays.asList(source));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
