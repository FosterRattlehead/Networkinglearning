package ServerLr;

import com.sun.xml.internal.ws.api.message.Packet;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception{
    ServerSocket serverSocket = new ServerSocket(1200);
    Socket socket = serverSocket.accept();


        ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream inStram = new ObjectInputStream(socket.getInputStream());


        VehicleRequest receiveRequest = (VehicleRequest)inStram.readObject();
        System.out.println(receiveRequest.message);
        VehicleResponse vehicleResponse = new VehicleResponse(receiveRequest, 50000, 10000, 4, 4, new String[]{"corcdile skin" , "Heated seats","Turbo"});

        outStream.writeObject(vehicleResponse);
        outStream.flush();
        serverSocket.close();


    }
}
