/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eratosthenes.java;

/**
 *
 * @author seden0957
 */
public class EratosthenesJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int i = 0;
        int number = 0;
        //Empty String
        String  primeNumber = "";

        for (i = 2; i <= 10000; i++)        
        {    
            int counter = 0;  
            for(number = i; number>= 1; number--)
            {
            if(i%number == 0)
                {
  counter = counter + 1;
                }
   }
if (counter == 2)
            {
            //Add number to the String
            primeNumber = primeNumber + i + " \n";
            }
        }
        System.out.println("Prime numbers from 2 to 1000: \n");
        System.out.println(primeNumber);
    }
    
}
