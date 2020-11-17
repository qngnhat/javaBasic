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
public class Unit56_Synchronization {

    public static void main(String[] args) {
        Thread56 thread56 = new Thread56();
        Thread thread1 = new Thread(thread56);
        Thread thread2 = new Thread(thread56 );

        thread1.setName("nez");
        thread2.setName("kiki");
        
        thread2.start();
        thread1.start();
    }
}

class Thread56 implements Runnable {

    private int money = 100;
    //lower performance
    public synchronized void run() {
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + " " + i +" " + money--);
            }
        } catch (Exception e) {
        }
    }
}
