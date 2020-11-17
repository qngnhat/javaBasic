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
public class Unit42_String1 {

    public static void main(String[] args) {
        String blog = "NeztgyALonelySoul";
        System.out.println(blog);
        System.out.println(blog.charAt(7));
        System.out.println(blog.indexOf("Soul"));
        System.out.println(blog.substring(3));
        System.out.println(blog.substring(3, 7));
        System.out.println(blog);

        String name = "  Qng Nhat lonely soul      ";
        System.out.println(name);
        System.out.println(name.trim());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        String[] arr = name.split(" ");
        for (String arr1 : arr) {
            System.out.println(arr1);
        }
    }
}
