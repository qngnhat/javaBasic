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
public class Student {

    private String name = "nez";
    private int age = 21;
    
    public void showStudent(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
    
    public int addNumber(int a, int b){
        int sum = a + b;
        return sum;
    }
    
    public static void main(String[] args) {
        Student st = new Student();
        st.showStudent();
        System.out.println("sum of 2 numbers: " + st.addNumber(3, 6));
    }
    
}
