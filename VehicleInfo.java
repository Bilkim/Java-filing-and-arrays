package com.edureka;

import java.io.Serializable;

public class VehicleInfo implements Serializable {

    int mileage;
    int numberOfWheels;
    String nameOfVehicle;

    VehicleInfo(String nameOfVehicle, int numberOfWheels, int mileage){
        this.nameOfVehicle = nameOfVehicle;
        this.numberOfWheels = numberOfWheels;
        this.mileage = mileage;


    }
}
