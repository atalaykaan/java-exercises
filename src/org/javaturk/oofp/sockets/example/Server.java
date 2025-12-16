package org.javaturk.oofp.sockets.example;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public Server(int port) {

        System.out.println("Starting server");

        System.out.println("Waiting for a client to connect");

        try(ServerSocket serverSocket = new ServerSocket(port);
            Socket socket = serverSocket.accept();
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(socket.getInputStream()))
        ) {

            System.out.println("Started and connected");

            String output = "";

            while(!output.equals("end")) {

                output = dataInputStream.readUTF();
                System.out.println(output);
            }

        } catch(IOException ex) {

            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Server server = new Server(5000);
    }
}
