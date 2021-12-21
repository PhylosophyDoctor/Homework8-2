package com.company;

import java.io.*;
import java.util.ArrayList;

public class ReadFile {

    public byte[] FindAndRead (String path) throws IOException {
        ArrayList pixels = new ArrayList();

        File file = new File(path);
        int i=0;
        try(  InputStream is = new FileInputStream(file)) {






            while(is.read() != -1)
            {
                i++;
                pixels.add((byte) is.read());
            }







        }
        catch(IOException err) { System.out.println("Файла не существует или его нельзя открыть");

        }

        byte[] picture = new byte[i];

        for (int j = 0; j < i; j++) {
            picture[j] = (byte) pixels.get(j);
        }

        return (picture);
    }
}
