package com.edureka;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

    public static  void main(String[] args) throws IOException {
        FileInputStreamDemo fileInputStreamDemo = new FileInputStreamDemo();
        fileInputStreamDemo.readFromFile("/home/bill/Documents/EdurekaIO/Info.txt");

    }

    private void readFromFile(String fileToRead) throws IOException {
        FileInputStream inputStream = new FileInputStream(fileToRead);
        int integerReadFromFile;
        while((integerReadFromFile = inputStream.read()) != -1){
            System.out.println("Character read from the file is  "+ (char)integerReadFromFile);

        }
        inputStream.close();

    }
}
