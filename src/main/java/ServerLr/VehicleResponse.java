package ServerLr;

import java.io.Serializable;
import java.util.Arrays;

public class VehicleResponse implements Serializable {
    private VehicleRequest request;
    private int milesOnVehicle;
    private int price;
    private int numberOfSeats;
    private int numberOfDoors;
    private String[] options;

    public String message;
    private String cleanCode = "";



    public VehicleResponse(VehicleRequest request, int milesOnVehicle, int price, int numberOfSeats, int numberOfDoors, String[] options) {
        this.request = request;
        this.milesOnVehicle = milesOnVehicle;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.numberOfDoors = numberOfDoors;
        this.options = options;

        for(int i =0; i< options.length; i++){
            cleanCode += ", " + options[i] ;
        }

        message = request.message +" miles: "+milesOnVehicle+" price:"+price+" seats: "+numberOfSeats + " doors:  " + numberOfDoors + " options: " + cleanCode ;

    }



}
