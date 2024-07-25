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
import java.io.File;
import java.io.IOException;

class Test {
    public static void main(String[] args) {
        try {
            File f = new File("A.java");
            f.createNewFile();
        } catch (IOException e) {
            System.out.println("Ex 1");
        } catch (Exception e) {
            System.out.println("Ex 1");
        }
    }
}
