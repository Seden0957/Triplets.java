/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package roundingerror.java;
    import javax.swing.*;
/**
 *
 * @author seden0957
 */
public class RoundingErrorJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("Insert base number here");    
        int base = Integer.parseInt(input);
        double rootOfBase = Math.sqrt(base);
        double squareOfRoot = rootOfBase * rootOfBase;       
    
        System.out.println("The square of the root: " + squareOfRoot);
        System.out.println("The round off error" + (base - squareOfRoot));
    }
    
}
