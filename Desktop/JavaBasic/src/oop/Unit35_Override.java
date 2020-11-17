/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author qngnhat
 */
class Override1 extends Tutorial1 {

    public static void main(String[] args) {
        Override1 ovr = new Override1();
        ovr.show();
    }

    protected void show() {
        System.out.println("Show of Override");
    }

}

class Tutorial1 {

    private void show() {
        System.out.println("Show of Tutorial");
    }
}

public class Unit35_Override extends Tutorial2{
    public int increase(int a) {
        return a+7;
    }
    
    public Override1 create() throws FileNotFoundException{
        return new Override1();
    }
}

class Tutorial2 {

    public int increase(int a) {
        return a + 4;
    }

    public Tutorial1 create() throws IOException{
        return new Tutorial1();
    }
}
