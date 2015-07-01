/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shpp.cs.vdotsenko.Assignment2;

import com.shpp.cs.a.graphics.WindowProgram;
import java.awt.Color;
import acm.graphics.*;

/**
 * pawprints task
 * @author karponter
 */
public class Assignment2Part3 extends WindowProgram {
    
    private static final double FIRST_TOE_OFFSET_X = 0;
    private static final double FIRST_TOE_OFFSET_Y = 20;
    private static final double SECOND_TOE_OFFSET_X = 30;
    private static final double SECOND_TOE_OFFSET_Y = 0;
    private static final double THIRD_TOE_OFFSET_X = 60;
    private static final double THIRD_TOE_OFFSET_Y = 20;
    
    private static final double HEEL_OFFSET_X = 20;
    private static final double HEEL_OFFSET_Y = 40;

    private static final double TOE_WIDTH = 20;
    private static final double TOE_HEIGHT = 30;

    private static final double HEEL_WIDTH = 40;
    private static final double HEEL_HEIGHT = 60;

    public static final int APPLICATION_WIDTH = 270;
    public static final int APPLICATION_HEIGHT = 220;

    public void run() {
        drawPawprint(20, 20);
        drawPawprint(180, 70);
    }

    /**
     * Draws a pawprint. The parameters should specify the upper-left corner of the
     * bounding box containing that pawprint.  
     * 
     * @param x The x coordinate of the upper-left corner of the bounding box for the pawprint.  
     * @param y The y coordinate of the upper-left corner of the bounding box for the pawprint.  
     */
    private void drawPawprint(double x, double y) {
        
        // oval that represents heel
        GOval heel = new GOval(HEEL_OFFSET_X, HEEL_OFFSET_Y, HEEL_WIDTH, HEEL_HEIGHT);
        heel.setFilled(true);
        
        // three ovals, that represents toes
        GOval toe1 = new GOval(FIRST_TOE_OFFSET_X, FIRST_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
        GOval toe2 = new GOval(SECOND_TOE_OFFSET_X, SECOND_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
        GOval toe3 = new GOval(THIRD_TOE_OFFSET_X, THIRD_TOE_OFFSET_Y, TOE_WIDTH, TOE_HEIGHT);
        toe1.setFilled(true);
        toe2.setFilled(true);
        toe3.setFilled(true);
        
        // creating a bounding box
        // and put it to a position, described in funciton parameters
        GCompound box = new GCompound();
        GPoint box_location = new GPoint(x, y);
        box.setLocation(box_location);
        
        // collect figures to a created bounding box
        box.add(toe1);
        box.add(toe2);
        box.add(toe3);
        box.add(heel);
        
        // adding bounding box to a stage
        add(box);
       
    }
}
