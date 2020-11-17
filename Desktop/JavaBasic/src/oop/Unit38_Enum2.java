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
public class Unit38_Enum2 {

    enum COLOR {
        RED(2), BLUE(3), YELLOW(4), GREEN(5), PURPLE(6);
        private int value;

        COLOR(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public static void main(String[] args) {
        COLOR c = COLOR.RED;
        System.out.println(c + ": " + c.getValue());
    }
}
