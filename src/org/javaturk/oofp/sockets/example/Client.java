package org.javaturk.oofp.sockets.example;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {

    public Client(String address, int port){

        try(Socket socket = new Socket(address, port);
            DataInputStream dataInputStream = new DataInputStream(System.in);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream())
        ) {

            System.out.println("Connected.");

            String input = "";

            while(!input.equals("end")) {

                input = dataInputStream.readLine();
                dataOutputStream.writeUTF(input);
            }

        } catch(IOException ex) {

            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Client client = new Client("127.0.0.1", 5000);
    }
}