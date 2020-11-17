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
public class Unit54_Thread {

    public static void main(String[] args) {

        Thread thread = new Thread() {
            public void run() {
                try {
                    System.out.println("Pause");
                    Thread.sleep(3000);
                    System.out.println("Restart");
                } catch (InterruptedException e) {
                }
            }
        };
        thread.start();
        //throw exception

//            thread.run();
//            thread.run();
        MyThread mThread = new MyThread();
        mThread.start();
        YourThread yThread = new YourThread();
        yThread.run();

    }
}

class MyThread extends Thread {

    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Pause: " + i);
                Thread.sleep(500);
                System.out.println("Restart: " + i);
            } catch (InterruptedException e) {
            }
        }
    }
}

class YourThread implements Runnable {

    public void run() {
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("YT Pause: " + i);
                Thread.sleep(500);
                System.out.println("YT Restart: " + i);
            } catch (InterruptedException e) {
            }
        }
    }
}
