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
public class Unit40_Constructor2 {
    public static void main(String[] args) {
        Sup sup = new Sup();
        
    }
}

class Super{
//    public Super(){
//        System.out.println("Super");
//    }
    public Super(int a){
        
    }
}

class Sup extends Super{
    public Sup(){
        //supper();
        super(0);
    }
    public Sup(int a){
        super(a);
    }
}
