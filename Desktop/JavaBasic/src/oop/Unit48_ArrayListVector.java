/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author qngnhat
 */
public class Unit48_ArrayListVector {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("nez");
        al.add(new String("a lonely soul"));
        al.add(new Integer(7));
        al.add(new Long(10));
        System.out.println(al.get(1));
        System.out.println(al.get(3));
        
        al.remove(2);
        System.out.println(al.get(2));
        
        Object [] array = al.toArray();
        System.out.println(array.length + " " + al.size());
        
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        
        Vector vector = new Vector();
        //same arraylist
    }
}
