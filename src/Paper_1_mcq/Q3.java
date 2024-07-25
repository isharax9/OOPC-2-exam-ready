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
class Demo {

    static void varMeth(int... z) {
        System.out.println("Var arg method");
    }

    static void varMeth(int x) {
        System.out.println("int method");
    }

    static void varMeth(Integer y) {
        System.out.println("Integer method");
    }

    public static void main(String[] args) {
        varMeth(10);
    }
}
