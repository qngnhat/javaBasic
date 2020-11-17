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
public class Unit22_MultiClasses {

    public static void main(String[] args) {
        A a1 = new A();
        a1.setName("nez");
        System.out.println(a1.getname());
        
        A a2 = new A();
        a2.setName("kiki");
        System.out.println(a2.getname());
    }
}

class A {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getname() {
        return name;
    }
}
