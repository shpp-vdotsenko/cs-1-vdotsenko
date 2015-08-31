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
 * Covered corners task
 * @author karponter
 */
public class Assignment2Part2 extends WindowProgram{
    
    // corner circles radius
    public static final double CORNER_RADIUS = 50;
    
    // default application window metrics
    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 300;
    
    public void run() {
        
        // declaring
        GOval   ovalNE = null,
                ovalNW = null,
                ovalSE = null,
                ovalSW = null;
        GRect   sq = null;
        
        // creating corner circles
        ovalNE = new GOval(0, 0, CORNER_RADIUS*2, CORNER_RADIUS*2);
        ovalNW = new GOval(getWidth()-CORNER_RADIUS*2, 0, CORNER_RADIUS*2, CORNER_RADIUS*2);
        ovalSE = new GOval(0, getHeight()-CORNER_RADIUS*2, CORNER_RADIUS*2, CORNER_RADIUS*2);
        ovalSW = new GOval(getWidth()-CORNER_RADIUS*2, getHeight()-CORNER_RADIUS*2, CORNER_RADIUS*2, CORNER_RADIUS*2);
        
        // eneble figeres fill
        ovalNE.setFilled(true);
        ovalNW.setFilled(true);
        ovalSE.setFilled(true);
        ovalSW.setFilled(true);
        
        // set fill color of corners
        ovalNE.setFillColor(Color.black);
        ovalNW.setFillColor(Color.black);
        ovalSE.setFillColor(Color.black);
        ovalSW.setFillColor(Color.black);
        
        // creating a white centered rectangle
        sq = new GRect(CORNER_RADIUS,CORNER_RADIUS, getWidth()-CORNER_RADIUS*2, getHeight()-CORNER_RADIUS*2);
        sq.setColor(Color.white);
        sq.setFillColor(Color.white);
        sq.setFilled(true);
        
        // adding figures to the canvas
        add(ovalNE);
        add(ovalNW);
        add(ovalSE);
        add(ovalSW);
        add(sq);
    }
}
