/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.HashMap;

/**
 *
 * @author qngnhat
 */
public class Unit49_Map {

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("instructor", "nez");
        map.put("word", "Alonelysoul");
        map.put(5, "HaTinh");
        map.put("word", "Test");
        System.out.println(map.get("instructor"));
        System.out.println(map.get("word"));
        System.out.println(map.size());
        System.out.println(map.get(5));
        map.remove("word");
        System.out.println(map.get("word"));
        map.clear();
        System.out.println(map.get("word"));
    }
}
