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
class Exc3 {

    public static void main(String args[]) {
        String name = "123456789V";
        System.out.print("before,");
        try {
            char ch = name.charAt(10);
        } catch (Exception e) {
            System.out.print(
        
        "Runtime Error,” );
}
System.out.print("after,");
    }
}
