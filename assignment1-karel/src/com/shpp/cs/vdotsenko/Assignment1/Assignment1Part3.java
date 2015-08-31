/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shpp.cs.vdotsenko.Assignment1;
import com.shpp.karel.KarelTheRobot;

/**
 * Middlepoint search
 * @author karponter
 */
public class Assignment1Part3 extends KarelTheRobot {
    
    public void run() throws Exception {
        runrun();
        putBeeper();
    }
    
    // Recursion.
    // Karel Makes two steps forward while recursion goes deep
    // Recursion growing ends, when Kael reaches the end of his little world
    // Afret that Karel moves again, one step for every recursion depth level
    // Finally we made Karel to go a full width of the world in one side 
    // and to go back a half of the world in another side
    // He is in a middlepoint of world
    public void runrun() throws Exception {
        if (frontIsClear()) {           // Growing stop condition
            move();                     // first step forward
            if (frontIsClear()) {       // Growing stop condition
                move();                 // second step forward
                if (frontIsClear()) {   // Growing stop condition
                    runrun();           // Recursion goes deeper
                } else {
                    turnLeft();
                    turnLeft();
                }
            } else {
                turnLeft();
                turnLeft();
            }
        } else {
            turnLeft();
            turnLeft();
        }
        move();                         // one step backward
    }
}
