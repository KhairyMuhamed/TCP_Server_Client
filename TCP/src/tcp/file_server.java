package tcp;

import java.io.*;
import java.net.*;

public class file_server {

    public static void main(String[] args) throws Exception {
        ServerSocket Server = new ServerSocket(1888);
        Socket socket = Server.accept();
        FileInputStream File = new FileInputStream("E:\\network_assignment.txt");
        byte b[] = new byte[600000000];
        File.read(b, 0, b.length);
        OutputStream Output = socket.getOutputStream();
        Output.write(b, 0, b.length);
    }
}