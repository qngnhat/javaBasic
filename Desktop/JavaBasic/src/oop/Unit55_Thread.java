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
public class Unit55_Thread {
    public static void main(String[] args) {
        Thread55 thread55 = new Thread55();
        Thread thread1 = new Thread(thread55);
        Thread thread2 = new Thread(thread55);
        
        thread1.setName("nez");
        thread2.setName("kiki");
        
        thread1.start();
        thread2.start();
    }
}

class Thread55 implements Runnable {

    public void run() {
        try {
            for (int i = 0; i < 50; i++) {
                Thread.sleep(1);
                System.out.println(Thread.currentThread().getName() + " " + i);
            }
        } catch (Exception e) {
        }
    }
}
