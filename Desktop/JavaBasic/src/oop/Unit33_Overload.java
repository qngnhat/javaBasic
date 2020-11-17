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
public class Unit33_Overload extends Tutorial {

    public static void main(String[] args) {
        Unit33_Overload ovl = new Unit33_Overload();
        Tutorial tt = new Tutorial();
        System.out.println(ovl.add(4, 6));
        System.out.println(ovl.add(45f, 56f));
        System.out.println(ovl.add("Halo ", "nez"));
    }

    private int add(int a, int b) {
        return a + b;
    }

    private float add(float a, float b) {
        return a + b;
    }
}

class Tutorial {

    public String add(String a, String b) {
        return a + b;
    }
}
