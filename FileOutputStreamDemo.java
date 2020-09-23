package com.edureka;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileOutputStreamDemo fileOutputStreamDemo =new FileOutputStreamDemo();
        fileOutputStreamDemo.writeToFile(new File("/home/bill/Documents/EdurekaIO/message.txt"));

    }

    private void writeToFile(File file) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write("The very considerable outcome to anything at all is null".getBytes());
        fileOutputStream.close();
    }

}
