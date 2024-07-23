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
class A {

    static int x;

    A() {
        System.out.println("Constructor");
    }

    static {
        x = 7;
    }

    {
        x = 8;
    }

    public static void main(String[] args) {
        System.out.print(x);
        A a = new A();
        System.out.print(x);
    }
}
