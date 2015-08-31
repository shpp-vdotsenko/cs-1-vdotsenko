/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shpp.cs.vdotsenko.Assignment2;
import com.shpp.cs.a.graphics.WindowProgram;
import acm.graphics.*;

/**
 * *grid of squares* illusion
 * @author karponter
 */
public class Assignment2Part5 extends WindowProgram {
    
    public static final int APPLICATION_WIDTH = 500;
    public static final int APPLICATION_HEIGHT = 400;
    
    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 6;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;
    
    // entry function
    public void run() {
        
        // creating a grid-box
        GCompound box = new GCompound();
        
        // magic...
        for (int i = 0; i < NUM_ROWS; i++)
            for (int j = 0; j < NUM_COLS; j++)
                box.add(spawnCell(j, i));
        
        // centering box
        centerInGlobal(box);
        
        // and adding it to a stage
        add(box);
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
    
    // returns graphical object of grid cell in *x_pos* coll and in *y_pos* row
    private GRect spawnCell(int x_pos, int y_pos) {
        
        // creating rectangular object and initialize it
        GRect rect = 
            new GRect(
                // calculate X coordiante
                x_pos*(BOX_SIZE+BOX_SPACING)+BOX_SPACING/2, 
                // calculate Y coordiante
                y_pos*(BOX_SIZE+BOX_SPACING)+BOX_SPACING/2, 
                // sizes are just constant. That's cool =)
                BOX_SIZE, 
                BOX_SIZE
            );
        
        // filling square with black (or whatever is default)
        rect.setFilled(true);
        
        return rect;
    }
}
