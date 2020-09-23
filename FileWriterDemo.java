package com.edureka;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

    public static void main(String[] args) throws IOException {
        FileWriterDemo fileWriterDemo = new FileWriterDemo();
        File infoFile = new File("/home/bill/Documents/EdurekaIO/Info.txt");
        fileWriterDemo. writeToFile(infoFile);

    }

    private void writeToFile(File fileToWriteTo) throws IOException {
        FileWriter infoWriter = new FileWriter(fileToWriteTo);
        infoWriter.write("Everything in the world is simply the available because of the existence of powerful force. writer: Bill Kotut");
        infoWriter.flush();
        infoWriter.close();

    }

}
