package tcp;

import java.io.*;
import java.net.*;

public class Message_Server {

    public static void main(String[] args) throws Exception {
        ServerSocket server_socket = new ServerSocket(9999);
        Socket socket = server_socket.accept();
        System.out.println("Connected");
        DataInputStream data_input = new DataInputStream(socket.getInputStream());
        BufferedReader buffer_reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String message = data_input.readUTF();
            System.out.println("Client  :" + message);
            if (message.equalsIgnoreCase("exit")) {
                break;
            }
        }
       
        socket.close();

    }
}
