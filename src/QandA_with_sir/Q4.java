/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QandA_with_sir;

/**
 *
 * @author isharaLakshitha
 */
class A extends Thread {

    @Override
    public void run() {
        System.out.println("A run");
    }
}

class B extends Thread {

    @Override
    public void run() {
        System.out.println("B run");
    }
}

class Test3 {

    public static void main(String[] args) {
        A a1 = new A();
        B b1 = new B();
        a1.run();
        b1.run();
    }
}
