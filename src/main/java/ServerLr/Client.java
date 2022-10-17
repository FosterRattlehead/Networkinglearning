package ServerLr;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {

        Socket socket = new Socket("127.0.0.1",1200);

        ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream inStram = new ObjectInputStream(socket.getInputStream());

        VehicleRequest vehicleRequest = new VehicleRequest(1970, "Dodge", "Dart" );
        outStream.writeObject(vehicleRequest);
        outStream.flush();

        VehicleResponse receiveResponse = (VehicleResponse)inStram.readObject();

        System.out.println(receiveResponse.message);

        outStream.close();
        socket.close();

    }
}

