package week6.io.txt;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class FilesUtil {

    private FilesUtil() {
    }

    public static void write(String str) {

        try(PrintWriter pw = new PrintWriter("printWriter.txt");) {
            pw.write(str);
            System.out.println("File was persisted.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void write2(String s) {

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("bufferedWriter.txt"))) {
            bw.write(s);
            System.out.println("File was persisted.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void write3(String s) {

        try {
            Path path = Paths.get("path.txt");
            Files.write(path, Arrays.asList(s));
            System.out.println("File was persisted.");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String read(String s) {

        try (Scanner scanner = new Scanner(new FileInputStream(s))) {

            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append('\n');
            }
            return sb.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static String read2(String s) {

        try (BufferedReader br = new BufferedReader(new FileReader(s))) {

            StringBuilder sb = new StringBuilder();
            while (br.ready()) {
                sb.append(br.readLine()).append('\n');
            }
            return sb.toString();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void copyFile(String inputFileName, String outputFileName) {

        try (
                FileInputStream fis = new FileInputStream(inputFileName);
                FileOutputStream fos = new FileOutputStream(outputFileName)
        ) {
            int size = 1024;
            byte[] buff = new byte[size];
            int read = 0;
            while ((read = fis.read(buff, 0, size)) != -1) {
                fos.write(buff, 0, read);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void delete(String s) {
        if(new File(s).delete()) {
            System.out.println("File was removed");
        } else {
            System.out.println("File was not found");
        }
    }

    public static String pwd(String s) {
        return new File(s).getAbsolutePath();
    }

    public static String patentPath(String s) {
        return new File(s).getParentFile().getAbsolutePath();
    }
}
