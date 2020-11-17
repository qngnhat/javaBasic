/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author qngnhat
 */
public class Unit47_FileReader1 {

    public static void main(String[] args) {
        try {
            File file = new File("blog.txt");

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            int i = 0;
            while ((line = br.readLine()) != null) {
                //Do something here
                System.out.println("line " + ++i + ": " + line.toLowerCase());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Unit47_FileReader1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
        }

    }
}
