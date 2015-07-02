/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shpp.cs.vdotsenko.Assignment2;

import com.shpp.cs.a.graphics.WindowProgram;
import acm.graphics.*;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author karponter
 */
public class Assignment2Part4 extends WindowProgram {
    
    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 250;
    
    // flag's metrics
    public static final int FLAG_WIDTH = 200;
    public static final int FLAG_HEIGHT = 150;
    
    // orientation of flag's stripes.
    // can be *vertical* or *horizontal*
    public static final String STRIPES_ORIENTATION = "horizontal";
    
    // country title
    public static final String COUNTRY = "Austria";
    
    // flag's stripes colors
    // from top to bottom if flag's orientation is vertical
    // from left to right if flag's orientation is horizontal
    private static final Color FIRST_STRIPE_COLOR = new Color(233, 10, 10);
    private static final Color SECOND_STRIPE_COLOR = new Color(240, 240, 240);
    private static final Color THIRD_STRIPE_COLOR = new Color(233, 10, 10);
    
    // entry function
    public void run() {
        
        // declaring and creating new empty container
        // it will hold the stripes of our flag
        GCompound box = new GCompound();
        
        // creating three colored numbered stripes
        // and adding them to a container on the flight
        box.add(createStripe(FIRST_STRIPE_COLOR, 1));
        box.add(createStripe(SECOND_STRIPE_COLOR, 2));
        box.add(createStripe(THIRD_STRIPE_COLOR, 3));
        
        // centering flag container
        centerInGlobal(box);
        
        // adding flag and lable to the stage
        add(box);
        add(echoCountryTitle());
        
    }
    
    // center graphics object or container in application window
    private void centerInGlobal(GObject unit) {
        
        // creating GPoint object that contains X and Y coordinates
        // of the centered unit
        GPoint unit_coordinates = new GPoint(
            // find app. window X middlepoint and reduce half of unit's width
            getWidth()/2-unit.getWidth()/2,
            // find app. window Y middlepoint and reduce half of unit's height
            getHeight()/2-unit.getHeight()/2        
        );
        
        // locates unit to a calculated coordinates
        unit.setLocation(unit_coordinates);         
    }
    
    // creates stripe graphical object according to a *color* and *number* parameters
    private GRect createStripe(Color stripe_solor, int number) {
        
        // declaring temporary variables
        double  stripe_w = 0,
                stripe_h = 0,
                stripe_x = 0,
                stripe_y = 0;
        
        // checking the flag orientation
        // setting up rectangular parameters
        // if constant value is wrong - horizontal orientation is default
        if (STRIPES_ORIENTATION == "vertical") {
            stripe_w = FLAG_WIDTH/3;
            stripe_h = FLAG_HEIGHT;
            stripe_x = stripe_w*(number-1);
        } else {
            stripe_w = FLAG_WIDTH;
            stripe_h = FLAG_HEIGHT/3;
            stripe_y = stripe_h*(number-1);
        }
        
        // creating new rectangular
        // wich represents a single stripe
        // initializing it with a calculated values
        GRect rct = new GRect(stripe_x, stripe_y, stripe_w, stripe_h);
        
        // paint new rectangular to the color we need
        rct.setColor(stripe_solor);
        rct.setFillColor(stripe_solor);
        rct.setFilled(true);
        
        return rct;
    }
    
    // function returns a lable object wich contains a text like *Flag of X*
    // X is a title of a current country and defined as a constant
    // lable is placed in a bottom-right corner of an application window
    private GLabel echoCountryTitle() {
        
        // declaring and calculating temporary values
        double free_space = (getHeight()-FLAG_HEIGHT)/3;
        int label_height = (int)free_space/2;
        
        // creating a new lable object
        // initiating it with text
        GLabel label = new GLabel("Flag of "+COUNTRY);
        
        // creating new bold Verdana font object
        // font size depends on a window and flag sizes
        Font text_type = new Font("Verdana", 1, label_height);
        // ok. Just setting a font. Don't now how to comment it.
        label.setFont(text_type);
        
        // creating GPoint object that contains lable coordinates
        // a little margin added
        // 5 points from the right side
        // label_height/3 from the bottom 
        // (in case of letters with a... little tails under the front baseline, like g, y, etc.)
        
        GPoint label_coordinates = 
            new GPoint(
                getWidth()-label.getWidth()-5, 
                getHeight()-label_height/3
            );
        // The same situation, I guess. Just setting new position. Nothing to say.
        label.setLocation(label_coordinates);
        
        return label;
    }
}
