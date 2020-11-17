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
public class Unit53_toString {

    public static void main(String[] args) {
        Unit53_toString unit = new Unit53_toString();
        System.out.println(unit);
        System.out.println(unit.toString());
        Unit52_Iterator unit52 = new Unit52_Iterator();
        StringBuilder builder = new StringBuilder("nez");
        System.out.println(builder.toString());
    }

    @Override
    public String toString() {
        return "A lonely soul lost between reality and dreams";
    }
}
