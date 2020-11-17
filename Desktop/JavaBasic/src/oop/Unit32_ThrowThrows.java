/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author qngnhat
 */
public class Unit32_ThrowThrows {

    public static void main(String[] args) {
        Building b = new Building();
        try {
            b.go();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

class MyException extends Exception {
    //Do something

}

class Building {

    public void show() throws MyException {
        int numberConnection = 50;
        //Do something
        if (numberConnection > 100) {
            throw new MyException();
        }
    }

    public void go() throws InterruptedException {
        Thread.sleep(1000);
    }
}
