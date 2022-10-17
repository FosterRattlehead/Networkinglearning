package ServerLr;

import java.io.Serializable;

public class VehicleRequest implements Serializable {
    private int year;
    private String make;
    private String model;

    public String message;


    public VehicleRequest(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
        message= year+" "+ make+" "+ model;

    }


}
