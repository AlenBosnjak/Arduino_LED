package com.example.ledremote;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.TimeUnit;

public class SocketOperations {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;

    public void startConnection(String ip, int port) throws UnknownHostException, IOException {
        clientSocket = new Socket(ip, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public void sendMessage(String msg) throws IOException, InterruptedException {

             out.println(msg);
             //String resp ;

             TimeUnit.MILLISECONDS.sleep(500);

    }

    public void stopConnection() throws IOException {
        if(in != null) { in.close();}
        if(out != null){ out.close();}
        if(clientSocket!= null) {clientSocket.close();}
    }



}
