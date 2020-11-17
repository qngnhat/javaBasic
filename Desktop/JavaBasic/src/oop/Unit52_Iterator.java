/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author qngnhat
 */
public class Unit52_Iterator {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("nez");
        al.add("kiki");
        al.add("aLonelySoul");
        
        Iterator<String> iterator = al.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
