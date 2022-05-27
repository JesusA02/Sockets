package Cliente;

import java.io.*;
import java.net.*;
import Common.*;

public class Client {
    Socket client;
    ObjectOutputStream output;
    Mensaje m;

    public Client(){
        m = new Mensaje(13);
        try {
            
            client = new Socket("127.0.0.1", 4444);
            output = new ObjectOutputStream(client.getOutputStream());
            output.writeObject(m);
            output.flush();
            client.close();

        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}
