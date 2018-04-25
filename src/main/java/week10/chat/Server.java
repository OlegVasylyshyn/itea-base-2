package week10.chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    private ServerSocket serverSocket;

    private Server(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    public static void start(int port) throws IOException {
        Server server = new Server(port);
        System.out.println("Server was ran");
        server.run();
    }

    private void run() throws IOException {
        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("Was accepted connection : " + socket.getRemoteSocketAddress());
            new Thread(() -> write(socket)).start();
            new Thread(() -> read(socket)).start();
        }
    }

    private void write(Socket socket) {
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

    private void read(Socket socket) {
        try {
            Scanner scanner = new Scanner(socket.getInputStream());
            while (true) {
                System.out.println("                                            Message from client");
                System.out.println("                                            " + scanner.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
