/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package palindrome.java;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author seden0957
 */
public class PalindromeJava {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = JOptionPane.showInputDialog("Input believed Palindrome:");
        //User inpts the believed Palindrome
        int wordLength = str.length();
        String reversedWord = "";
        for(int i = wordLength-1; i >= 0; i--) {
    
        reversedWord = reversedWord + str.charAt(i);
        //Displays both forwards and reversed words
        System.out.println(str + "->" + reversedWord);
        }
    
   if(str.equals(reversedWord)){
    System.out.println("This is a Palindrome.");
}
   else{
System.out.println("This is not a Palindrome.");
}
}
}