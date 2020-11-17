/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

/**
 *
 * @author nhatc
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int age = 10;
        switch(age){
            default:
                System.out.println("Default");
                
            case 0:
                System.out.println("Khong");
                break;
            case 10:
                System.out.println("Muoi");
                
            case 20:
                System.out.println("Hai Muoi");
                
            
        }
    }
}
