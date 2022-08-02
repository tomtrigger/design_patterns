package com.freedom.chapter_03.io;

import java.io.*;

public class InputTest {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("D:\\workspace\\learn\\design_patterns\\src\\main\\resources\\Test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        try (InputStream is = new LowerCaseInputStream(new BufferedInputStream(fileInputStream))) {
            int read;
            while ((read = is.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
