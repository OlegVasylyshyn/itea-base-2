package week10.chat;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    private Socket socket;

    private Client(String host, int port) throws IOException {
        socket = new Socket(host, port);
    }

    public static void start(String host, int port) throws IOException {
        Client client = new Client(host, port);
        client.run();
    }

    private void run() {
        new Thread(this::read).start();
        new Thread(this::write).start();
    }

    private void read() {
        try {
            Scanner scanner = new Scanner(socket.getInputStream());
            while (true) {
                System.out.println("                                          Message from client");
                System.out.println("                                          " + scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void write(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your message - ");
            String message = scanner.nextLine() + "\n";
            try {
                socket.getOutputStream().write(message.getBytes());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
