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
public class Unit26_ThuaKe {
    public static void main(String[] args) {
        Button btn = new Button();
        btn.clicky();
        btn.run();
    }
}

interface Computer{
    void run();
}

interface Cpu extends Computer{
    
}

class Keyboard implements Cpu{
    public void run(){
        
    }
    
    void clicky(){
        
    }
}

class Keycap implements Cpu{
    public void run(){
        
    }
}

class Button extends Keyboard implements Computer, Cpu{
    
}

