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
class EnumExample2 {

    enum Season {
        WINTER, SPRING, SUMMER, FALL;
    }

    public static void main(String[] args) {
        Season s = Season.WINTER;
        System.out.println(s);

    }
}
