package week6.io.url;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UrlTest {

    public static void main(String[] args) {

        try {

            URL url = new URL("https://github.com/");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            Scanner scanner = new Scanner(inputStream);

            StringBuilder sb = new StringBuilder();
            while (scanner.hasNextLine()) {
                sb.append(scanner.nextLine()).append('\n');
            }

//            System.out.println(sb);

            Pattern pattern = Pattern.compile("(http|https|ftp)://\\S*?\\.(png|jpg)");
            Matcher matcher = pattern.matcher(sb.toString());

            while (matcher.find()) {
                System.out.print("Start index: " + matcher.start());
                System.out.print(" End index: " + matcher.end() + " ");
                System.out.println(matcher.group());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
