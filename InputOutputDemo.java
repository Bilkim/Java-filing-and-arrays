package com.edureka;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputDemo {

    public static void main(String[] args) throws FileNotFoundException {
        File employeeInfoFile = new File("/home/bill/Documents/EdurekaIO/EmployeeInfo.txt");
        InputOutputDemo demo = new InputOutputDemo();
        demo.writeToFile(employeeInfoFile);

        File vehicleInfo = new File("/home/bill/Documents/EdurekaIO/VehicleInfo.txt");
        demo.readFile(vehicleInfo);

    }

    public void writeToFile(File fileToWrite){
        PrintWriter employeeInfoWriter = null;
        try {
             employeeInfoWriter = new PrintWriter(fileToWrite);
             employeeInfoWriter.println("Bill");
             employeeInfoWriter.println("18/03308");

        }catch (FileNotFoundException e){
            System.out.println("Given file was not found in local disk"+fileToWrite.getName());
            throw new RuntimeException(e);
        }finally {
            employeeInfoWriter.close();
        }

    }

    public void readFile(File fileToRead) throws FileNotFoundException {
        Scanner input = new Scanner(fileToRead);
        while (input.hasNext()) {
            System.out.println("Line read from input file: " + input.nextLine());
        }
    }
}
