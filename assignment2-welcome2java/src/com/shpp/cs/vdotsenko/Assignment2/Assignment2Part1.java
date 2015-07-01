/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shpp.cs.vdotsenko.Assignment2;
import com.shpp.cs.a.console.TextProgram;

/**
 * A quadratic equation solvation
 * @author karponter
 */

public class Assignment2Part1 extends TextProgram {

    public void run() {
        
        // variable declaration and initialization
        int again = 0;  // marker of re-execution
        double  a = 0,
                b = 0,
                c = 0,
                D = 0;
        
        do {            
            // requesting input data from user
            a = readDouble("Enter A coeficient: ");
            b = readDouble("Enter B coeficient: ");
            c = readDouble("Enter C coeficient: ");

            // calculete discriminant value. D=b^2-4ac 
            D   = Math.pow(b,2)
                - 4 * c * a;
            println("D = "+D);
            // here we have three variants
            if (D < 0) {
                // do not calculate root value if discriminant is less then zero
                println("No, dude, I won't calculete complex root values for you...");
            } else if (D == 0) {
                // calculate single value when discr. is equal to zero
                // there are two roots, but they are equal
                double root = (-1)*b/(2*a);
                println("Both roots are "+root);
            } else {
                // calculate both roots values otherwise
                double  root1=0, 
                        root2=0;
                root1 = (-1)*b+Math.sqrt(D)/(2*a);
                root2 = (-1)*b-Math.sqrt(D)/(2*a);
                println("Roots are "+root1+" and "+root2);
            }
            
        } while (true);
    }

}
