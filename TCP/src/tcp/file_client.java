package tcp;

import java.io.*;
import java.net.*;

public class file_client {

    public static void main(String[] args) throws Exception {

        byte[] b = new byte[60000];
        Socket socket = new Socket("localhost", 1888);
        InputStream input_stream = socket.getInputStream();
        FileOutputStream File = new FileOutputStream("E:\\iamsent.txt");
        input_stream.read(b, 0, b.length);
        File.write(b, 0, b.length);
    }
}
