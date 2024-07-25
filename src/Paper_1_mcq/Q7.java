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

    public static void main(String args[]) {
        int x = 0, d = 0;
        try {
            d = 42 / 0;
        } catch (ArithmeticException e) {
            System.out.print("Arithmetic error..");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Array Index error..");
        } finally {
            System.out.print("finally..");
        }
        System.out.print("after..");
    }
}
