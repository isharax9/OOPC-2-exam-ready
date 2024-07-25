/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paper_1_mcq;

/**
 *
 * @author isharaLakshitha
 */
class E1 extends Exception {
}

class E2 extends E1 {
}

class A {

    void m() throws E1 {
        System.out.println("OK-A");
    }
}

class B extends A {

    protected void m() throws Exception {
        System.out.println("OK-B");
    }

    public static void main(String[] args) 
        ex {
A a1 = new A();
        a1.m();

    }
}
