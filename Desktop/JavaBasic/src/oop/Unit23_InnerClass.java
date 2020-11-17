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
public class Unit23_InnerClass {

    static class Inner2{
        public static void display(){
            System.out.println("this is inner2 Class");
        }
    }
    
    public static void main(String[] args) {
        Outter outter = new Outter();
//        out.show();
        Nez nez = new Nez();
        nez.showThis();
        
        Unit23_InnerClass.Inner2.display();
    }
}

class Outter {

    public void show() {
        class Inner {

            public void display() {
                System.out.println("this is inner class");
            }
        }
        Inner in = new Inner();
        in.display();
    }
    
    

}

class Nez {

    public void showThis() {
        Outter outter = new Outter();
        outter.show();
    }

}
