/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author nhatc
 */
public class TImeDemo {
    
    public static void main(String[] args) {
        //get time by millisecond
        long start = System.currentTimeMillis();
        try {
            for (int i = 0; i < 100; i++) {
                Thread.sleep(3);
            }
        } catch (Exception e) {
        }
        long end = System.currentTimeMillis();
        System.out.println("Millies: " + (end - start));
        
        //get time by nanosecond
        start = System.nanoTime();
        end = System.nanoTime();
        System.out.println("Nano: " + (end - start));
        //display the system time
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH.mm.ss");
        Date date = new Date();
        String day = dateFormat.format(date);
        System.out.println(day);
    }
}
