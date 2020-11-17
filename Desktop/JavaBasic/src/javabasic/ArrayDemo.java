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
public class ArrayDemo {

    public static void main(String[] args) {
        int[] arrayInt = new int[10];
        int[] arrayInt2 = {1, 2, 3, 4, 5, 6};

        int[][]arrInt = {{1,2,4,6},{4,5,7,8}};
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arrInt[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
