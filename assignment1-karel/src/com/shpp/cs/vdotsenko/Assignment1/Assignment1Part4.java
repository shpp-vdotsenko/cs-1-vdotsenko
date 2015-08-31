/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shpp.cs.vdotsenko.Assignment1;
import com.shpp.karel.KarelTheRobot;

/**
 * Chess board
 * @author karponter
 */
public class Assignment1Part4 extends KarelTheRobot {
    
    public void run() throws Exception {
        turnLeft();
        DropAndRun();
        while (frontIsClear()) {
            ChangeLine();
            RunAndDrop();
            if (frontIsClear()) {
                ChangeLine();
                DropAndRun();
            }   
        }
    }
    
    // go back to a south side of the world
    public void goBack() throws Exception {
        while (frontIsClear())
            move();
    }
    
    // Karel walks forward and puts beepers to a bord
    // Firstly he put a beeper, then makes two steps and puts beeper again untill the wall is reached
    // Finally he goes back to a start position
    public void DropAndRun() throws Exception {
        putBeeper();
        while (frontIsClear()) {
            if (frontIsClear()) {
                move();
                if (frontIsClear()) {
                    move();
                    // put beeper only if cell is empty
                    if (noBeepersPresent()) {
                        putBeeper();
                    }
                } 
            }
            
        }
        turnLeft();
        turnLeft();
        goBack();
        turnLeft();
    }
    
    // Karel walks forward and puts beepers to a bord
    // Firstly he makes a step, then puts a beeper and makes one more step untill the wall is reached
    // Finally he goes back to a start position   
    public void RunAndDrop() throws Exception {
        while (frontIsClear()) {
            if (frontIsClear()) move();
            putBeeper();
            if (frontIsClear()) move();
        }
        turnLeft();
        turnLeft();
        goBack();
        turnLeft();
    }
    
    // Karel goes to a paralell line and turnes to face north and be ready to fill empty line
    public void ChangeLine() throws Exception {
        move();
        turnLeft();
    }
}
