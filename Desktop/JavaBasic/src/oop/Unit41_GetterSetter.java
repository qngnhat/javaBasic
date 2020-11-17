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
public class Unit41_GetterSetter {
    public static void main(String[] args) {
        BookCase bc = new BookCase();
        bc.setSize(3);
        System.out.println("Size: " + bc.getSize());
        bc.setColor("Red");
        System.out.println("Color: " + bc.getColor());
        bc.setGood(true);
        System.out.println("Good: " + bc.isGood());
    }
}

class BookCase{
    private int size;
    private String color;
    private boolean good;
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isGood() {
        return good;
    }

    public void setGood(boolean good) {
        this.good = good;
    }

    
}
