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
public class Unit37_Enum1 {

    enum COLOR {
        RED, BLUE, YELLOW, GREEN, PURPLE
    }

    public static void main(String[] args) {
        System.out.println(COLOR.BLUE);
        COLOR c = COLOR.PURPLE;
        System.out.println(c);
        System.out.println(c.YELLOW);
        if (c == COLOR.GREEN) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
        switch(c){
            case RED:
                System.out.println("RED");
                break;
            case BLUE:
                System.out.println("BLUE");
                break;
            case YELLOW:
                System.out.println("YELLOW");
                break;
            case GREEN:
                System.out.println("GREEN");
                break;
            case PURPLE:
                System.out.println("PURPLE");
                break;
                
        }
    }
}
