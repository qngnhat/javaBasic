/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author qngnhat
 */
public class Unit24_Interface {
    public static void main(String[] args) {
        Nezt nez = new Nezt();
        nez.sing();
        nez.talk();
    }
}

interface Woman {

    public static final String SONG_NAME = "MRTT";
    int AGE = 20;

    public abstract void sing();

    void talk();
}

class Nezt implements Woman{
    public void sing() {
        System.out.println("Sing a song name: " + Woman.SONG_NAME);
    }

  
    public void talk() {
        System.out.println("Talk to me her age: " + Woman.AGE);
    }

}
