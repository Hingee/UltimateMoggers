package PIP_Client.src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConnectionHandler {
    Socket socket;
    ExecutorService threadExecutor;
    Vector<String> messages;

    ConnectionHandler() {
        messages = new Vector<>();
        try {
            socket = new Socket("localhost", 12345);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }

        threadExecutor = Executors.newSingleThreadExecutor();
    }

    public void recievePacket() {
        threadExecutor.submit(new RecieverThread(this));
    }

    public void recievePacketAsync() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

            String serverResponse = in.readLine();
            messages.add(serverResponse);
            System.out.println("Server says: " + serverResponse);
        } catch (NullPointerException e) {
            
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public void sendPacket(String msg) {
        
        PrintWriter out;
        try {
            out = new PrintWriter(socket.getOutputStream(), true);
            out.println(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Sent: " + msg);
    }

    public void close() throws IOException {
        socket.close();
    }
}
