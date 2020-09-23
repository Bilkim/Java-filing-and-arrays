package com.edureka;

import java.io.*;

public class ObjectStreamDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        VehicleInfo bmw =  new VehicleInfo("BMW",4,10);
        File serializedFile = new File("/home/bill/Documents/EdurekaIO/serializedFile.bin");
        new ObjectStreamDemo().serialize(serializedFile, bmw);
        new ObjectStreamDemo().deserialize(serializedFile);
    }

    private void serialize(File file, VehicleInfo instanceOfVehicleInfo) throws IOException {
        FileOutputStream fileStream = new FileOutputStream(file);
        ObjectOutputStream objectStream = new ObjectOutputStream(fileStream);
        objectStream.writeObject(instanceOfVehicleInfo);
        objectStream.flush();
        objectStream.close();

    }

    private void deserialize(File file) throws IOException, ClassNotFoundException {
        FileInputStream fileStream = new FileInputStream(file);
        ObjectInputStream objectStream = new ObjectInputStream(fileStream);
        VehicleInfo deserializedObject = (VehicleInfo) objectStream.readObject();
        System.out.println("[Deserialization] Name of vehicle in the deserialized file :"+deserializedObject.nameOfVehicle);
        System.out.println("[Deserialization] Number of vehicle in the deserialized file :"+deserializedObject.numberOfWheels);
        System.out.println("[Deserialization] Mileage of vehicle in the deserialized file :"+deserializedObject.mileage);


    }
}
