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
public class Unit39_Constructor1 {
    public static void main(String[] args) {
        Box box1 = new Box();
        System.out.println(box1.getSize());
        System.out.println(box1.getColor());
        
        Box box2 = new Box(22, "BLUE");
        System.out.println(box2.getSize());
        System.out.println(box2.getColor());
    }
    
}

class Box {

    private int size;
    private String color;

    public Box(){
        size = 19;
        color = "RED";
        //Call other methods
        System.out.println("Nez");
    }

    public Box(int size, String color) {
        this.size = size;
        this.color = color;
    }
    
    
    
    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }
}
