import java.io.*;
import java.net.*;
import java.util.*;

public class Server {
    private static final int PORT = 1234;
    private static Set<ClientHandler> clients = new HashSet<>();

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(PORT);
        System.out.println("Server started...");

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("New client connected");

            ClientHandler client = new ClientHandler(socket);
            clients.add(client);
            new Thread(client).start();
        }
    }

    static class ClientHandler implements Runnable {
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;

        public ClientHandler(Socket socket) {
            this.socket = socket;
        }

        public void run() {
            try {
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

                String msg;
                while ((msg = in.readLine()) != null) {
                    broadcast(msg, this);
                }
            } catch (IOException e) {
                System.out.println("Client disconnected");
            } finally {
                try {
                    socket.close();
                } catch (IOException e) {}
                clients.remove(this);
            }
        }

        private void broadcast(String message, ClientHandler sender) {
            for (ClientHandler client : clients) {
                if (client != sender) {
                    client.out.println(message);
                }
            }
        }
    }
}
