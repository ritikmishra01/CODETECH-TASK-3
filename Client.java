import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "localhost"; // or IP address
        int port = 12345;

        try (
            Socket socket = new Socket(serverAddress, port);
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);
        ) {
            System.out.println("Connected to chat server. Type your messages:");

            Thread readerThread = new Thread(() -> {
                try {
                    String serverMsg;
                    while ((serverMsg = in.readLine()) != null) {
                        System.out.println(serverMsg);
                    }
                } catch (IOException e) {
                    System.out.println("Disconnected from server.");
                }
            });

            readerThread.start();

            while (true) {
                String userMsg = scanner.nextLine();
                out.println(userMsg);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
