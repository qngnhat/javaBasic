/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author qngnhat
 */
public class Unit46_FileWriter1 {

    public static void main(String[] args) {

        try {
            File file = new File("blog.txt");
            file.createNewFile();

            try (FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw)) {

                //Do something here
                String data = "neztgy";
                bw.write(data + "\n");
                bw.write(data.toUpperCase() + "\n");
                bw.write(data + "\n");
                bw.close();
                fw.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(FileWriter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
