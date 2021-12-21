package com.company;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;


public class WriteFile {


    public void WriteToFile(String name, byte[] picture) throws IOException
    {
        File file = new File(name);
        file.createNewFile();
        try (FileOutputStream fos = new FileOutputStream(file))
        {
//            int i=0;
//            int j= picture.length;
//            while (i<j) {
//                fos.write((byte) picture[i]);
//                i++;
//            }
            fos.write( picture, 0, picture.length);
        }
       catch(IOException err) {
            System.out.println("Че та не получилося");
       }


    }
}
