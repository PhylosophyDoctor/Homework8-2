package com.company;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadFile in = new ReadFile();
       byte[] pic =  in.FindAndRead("text.txt");
       WriteFile out = new WriteFile();
       out.WriteToFile("picture.txt",pic);



	// write your code here
    }
}
