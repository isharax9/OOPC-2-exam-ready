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
class Demo3 {

    public static void main(String[] args) {
        Integer x = 525;
        Integer y = x;
        System.out.print(y == x);
        y++;
        System.out.print(x + " " + y);
        System.out.println(y == x);
    }
}
