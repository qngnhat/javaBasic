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
public class Unit30_TryCatch {

    public static void main(String[] args) {
        String test = "neztgy";
        try {
            System.out.println("Before");
            //10 --> Error
//            System.out.println(test.substring(10));
            System.out.println(test.substring(3));
            int a = 2;
            int b = 0;
            System.out.println("a/b = " + a / b);
        } 
//        catch (StringIndexOutOfBoundsException | ArithmeticException e) {
//            System.out.println("Error: " + e.toString());
//        }
        catch (Exception e) {
            System.out.println("Error: " + e.toString());
        } finally {
            System.out.println("Always done!");
        }
        System.out.println("After");

    }
}
