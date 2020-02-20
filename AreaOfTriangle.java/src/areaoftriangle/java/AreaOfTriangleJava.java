/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package areaoftriangle.java;
import java.util.Scanner;
/**
 *
 * @author seden0957
 */
public class AreaOfTriangleJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //Prompt user for inputs
        System.out.println("Insert Side A here: ");
        double sideA = input.nextDouble();
        System.out.println("Insert Side B here: ");
        double sideB = input.nextDouble();
        System.out.println("Insert Side C here: ");
        double sideC = input.nextDouble();
        //sqrt s(s-a)(s-b)(s-c) and s=(a+b+c)/2
        double semiPerimeter = (sideA + sideB + sideC)/2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
        //Display perimeter
        System.out.println("The area of the triange is: " + area);
    }
    
}
