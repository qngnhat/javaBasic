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
public class Unit57_BlockCode {
    
    {
    //this is block code
        System.out.println("Block code 1");
        
    }
    
    
    
    static {
        System.out.println("Static Block code 1");
    }
    
    public Unit57_BlockCode(){
        System.out.println("Constructor");
    }
    public static void main(String[] args) {
        Unit57_BlockCode unit = new Unit57_BlockCode();
    }
    
    {
        System.out.println("Block code 2");
    }
    
    
    static {
        System.out.println("Static Block code 2");
    }
}
