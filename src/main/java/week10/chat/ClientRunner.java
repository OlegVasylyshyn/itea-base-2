package week10.chat;

import java.io.IOException;

public class ClientRunner {

    public static void main(String[] args) throws IOException, InterruptedException {

        Client.start("localhost", 8080);

    }

}
