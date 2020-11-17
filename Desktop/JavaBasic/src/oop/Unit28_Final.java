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
public class Unit28_Final  extends  Unit{

    final float PI = 4.14f;
    int number;

    public static void main(String[] args) {
        Unit28_Final fn = new Unit28_Final();

        fn.number = 10;
        //error
        //fn.PI = 5f
    }

    public void change() {
        number = 21;
        //PI = 2f;
    }

    void show(){
        
    }
    
//    error
//    void run(){
//        
//    }
}

class Unit {

    void show() {

    }
    
    final void run(){
        
    }
}
