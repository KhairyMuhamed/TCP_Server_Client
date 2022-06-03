package tcp;

import java.io.*;
import java.net.*;

public class Message_client {

    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 9999);
        DataOutputStream data_output = new DataOutputStream(socket.getOutputStream());
        BufferedReader buffer_reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String socket_output = buffer_reader.readLine();
            data_output.writeUTF(socket_output);
            if (socket_output.equalsIgnoreCase("exit")) {
                break;
            }

        }
        
        socket.close();
    }
}
