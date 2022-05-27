package Server;

import java.net.*;
import java.io.*;
import Common.*;

public class Server {
    ServerSocket server;
    Socket client;
    ObjectInputStream input;
    Mensaje m;

    public Server(){
        try {
            server = new ServerSocket(4444);
            client = server.accept();
            input = new ObjectInputStream(client.getInputStream());

            m = (Mensaje) input.readObject();

            input.close();
            client.close();
            server.close();

            System.out.println(m);
            
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}
