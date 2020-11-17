/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.Vector;

/**
 *
 * @author qngnhat
 */
public class Unit51_Generic {
    public static void main(String[] args) {
        Vector<CC> vector = new Vector<CC>();
        vector.add(new CC());
        vector.add(new CC());
        //DD is Sup class of CC
        vector.add(new DD());
        
        Vector<DD> vector1 = new Vector<DD>();
        vector1.add(new DD());
        //error here CC more visiblity than DD
//        vector1.add(new CC());
    }
}

class CC{
    
}

class DD extends CC{
    
}