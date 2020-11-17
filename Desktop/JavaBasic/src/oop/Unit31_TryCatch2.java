/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author qngnhat
 */
public class Unit31_TryCatch2 {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
            File file = new File("text.txt");
            file.createNewFile();
        } catch (InterruptedException e) {
    
            e.printStackTrace();
        } catch(IOException e){
        }
            
        
    }
}