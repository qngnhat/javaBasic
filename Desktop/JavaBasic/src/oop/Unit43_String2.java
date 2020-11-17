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
public class Unit43_String2 {
    public static void main(String[] args) {
        String myCountry = "Beautiful land land1 land2 land3";
        System.out.println(myCountry.length());
        System.out.println(myCountry.replace("land", "House"));
        System.out.println(myCountry.replaceFirst("land", "House"));
        System.out.println(myCountry.replaceAll("land", "House"));
        
        String name = "neztgy";
//        if(name == "neztgy"){
//            System.out.println("neztgy");
//        }
//        
        if (name.equals("neztgy")) {
            System.out.println("neztgy");
        }
    }
}
