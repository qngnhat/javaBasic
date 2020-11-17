/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author qngnhat
 */
public class Unit50_Generic {
    public static void main(String[] args) {
        ArrayList<AA> al = new ArrayList<AA>();
        al.add(new AA());
        //Error here
//        al.add(new BB());
        for (int i = 0; i < al.size(); i++) {
            al.get(i).show();
            
        }
        
        HashMap<String, BB> map = new HashMap<String, BB>();
        map.put("nez", new BB());
        map.put("kiki", new BB());
    }
}

class AA{
    public void show(){
        
    }
    
}
class BB{
    public void go(){
        
    }
}