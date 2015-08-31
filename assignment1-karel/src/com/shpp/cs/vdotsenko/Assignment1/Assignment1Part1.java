/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shpp.cs.vdotsenko.Assignment1;
import com.shpp.karel.KarelTheRobot;
/**
 * Newspaper task
 * @author karponter
 */

public class Assignment1Part1 extends KarelTheRobot {
    
    public void run() throws Exception {
        goToNP();
        grabThatPieceOfPaper();
        goBack();
    }
    
    // move Karel to the newspaper
    public void goToNP() throws Exception {
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        turnLeft();
        move();
        move();
    }
    
    // move Karel to the start position
    public void goBack() throws Exception {
        turnLeft();
        turnLeft();
        move();
        move();
        move();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
    }
    
    // grabbing the newspaper under Karel
    public void grabThatPieceOfPaper() throws Exception {
        pickBeeper();
    }
}
