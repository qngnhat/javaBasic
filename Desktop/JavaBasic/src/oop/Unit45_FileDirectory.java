/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author qngnhat
 */
public class Unit45_FileDirectory {

    public static void main(String[] args) {
        try {
            File file = new File("test.txt");
            file.createNewFile();
            
            //create new folder
            File directory = new File("new");
            directory.mkdir();
        } catch (IOException ex) {
            Logger.getLogger(Unit45_FileDirectory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
