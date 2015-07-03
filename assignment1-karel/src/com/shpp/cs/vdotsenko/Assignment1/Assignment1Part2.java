/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shpp.cs.vdotsenko.Assignment1;
import com.shpp.karel.KarelTheRobot;

/**
 * Column builder task
 * @author karponter
 */
public class Assignment1Part2 extends KarelTheRobot {
    

    public void run() throws Exception {
        // buildeng first column
        buildItUp();
        // build other, while Karel can find a place for a new column
        while (frontIsClear()) {
            goNext();
        }
    }
    
    // building a column from bottom to top
    // Karel must facing East at the start of this operation
    public void buildItUp() throws Exception {
        turnLeft();
        // put beepers only to an empty cells
        if (noBeepersPresent())
            putBeeper();
        // continue to move up and filling empty cells with beepers
        // untill we reach the wall
        while (frontIsClear()) {
            move();
            if (noBeepersPresent())
                putBeeper();
        }
        
        // turning around
        turnLeft();
        turnLeft();
        
        // and moving back to the floor
        while (frontIsClear())
            move();
        // make Karel fasing East again
        turnLeft();
    }
    
    
    // moving Karel to the next column if it exists
    // do nothing if the end of world is reached
    public void goNext() throws Exception {
        // trying to make a step forward if it is possible
        // ending function if it isn't
        if (frontIsClear()) {
            move();
            if (frontIsClear()) {
                move();
                if (frontIsClear()) {
                    move();
                    if (frontIsClear()) {
                        // if the last step is possible
                        // moving ahead
                        move();
                        // and building a new column right there
                        buildItUp();
                    }
                }
            }
        }
    }
}
