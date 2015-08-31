/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shpp.cs.vdotsenko.Assignment2;
import com.shpp.cs.a.graphics.WindowProgram;
import acm.graphics.*;
import java.awt.Color;

/**
 * nasty green thing
 * @author karponter
 */
public class Assignment2Part6 extends WindowProgram {
    
    // app. window size
    public static final int APPLICATION_WIDTH = 700;
    public static final int APPLICATION_HEIGHT = 400;
    
    // number of chains (circles) our... caterpillar?! (who came up with this word?! O_o) consists of.
    public static final int CHAINS_NUM = 10;
    
    // color of caterpillar's (Roma, WHY THIS? Why not a billiard balls stack or smth.)
    public static final Color CHAIN_FILL_COLOR = new Color(10, 233, 10);
    
    // color of caterpillar's (this thing sounds like a grumpy old cousin of Lord Vader) border
    public static final Color CHAIN_BORDER_COLOR = new Color(0, 0, 0);
    
    // radius of that round thing...
    public static final double CHAIN_RADIUS = 50;
    
    // spacing between cells
    public static final double CHAIN_SPACING = 5;
    
    // entry function
    public void run() {
        
        // creating a grid-box
        GCompound box = new GCompound();
        
        // magic...
        for (int i=1; i<=CHAINS_NUM; i++)
            box.add(spawnChainCell(i));
        
        // centering box
        centerInGlobal(box);
        
        // and adding it to a stage
        add(box);
    }
    
    // returns graphical object of N-th chain cell
    private GOval spawnChainCell(int n) {
        
        // declaring and calculating cell coordinates
        double  x_coord = (n-1)*(CHAIN_RADIUS+CHAIN_SPACING),
                y_coord = (n%2 == 0) ? 0 : CHAIN_RADIUS-CHAIN_SPACING;
        
        // creating round graphics object
        // initiate it with calculated values and constants
        GOval cell = 
            new GOval(
                x_coord, 
                y_coord, 
                2*CHAIN_RADIUS, 
                2*CHAIN_RADIUS
            );
        
        // painting all that stuff
        cell.setFillColor(CHAIN_FILL_COLOR);
        cell.setFilled(true);
        cell.setColor(CHAIN_BORDER_COLOR);
        
        return cell;
    }
    
    // center graphics object or container in application window
    // this parameter name makes my program a little happier. At least one smiling face.
    private void centerInGlobal(GObject B) {
        
        // creating GPoint object that contains X and Y coordinates
        // of the centered unit
        GPoint unit_coordinates = new GPoint(
            // find app. window X middlepoint and reduce half of unit's width
            getWidth()/2-B.getWidth()/2,
            // find app. window Y middlepoint and reduce half of unit's height
            getHeight()/2-B.getHeight()/2        
        ); // so many sad faces in this code, u know...
        
        // locates unit to a calculated coordinates
        B.setLocation(unit_coordinates);         
    }
    
}
