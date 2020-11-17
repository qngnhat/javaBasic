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
public class Unit44_StringBuilerStringBuffer {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("qngnhat");
        StringBuffer buffer = new StringBuffer("neztgy");
        
        builder.append("2020");
        System.out.println(builder);
        builder.deleteCharAt(5);
        System.out.println(builder);
        builder.delete(7,9);
        System.out.println(builder);
        builder.insert(5, "2020");
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
    }
}
