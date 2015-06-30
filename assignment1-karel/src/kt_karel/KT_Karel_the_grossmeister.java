/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kt_karel;
import com.shpp.karel.KarelTheRobot;

/**
 * Шахматная доска.
 * @author karponter
 */
public class KT_Karel_the_grossmeister extends KarelTheRobot {
    
    // Зачем ЭТО вы знаете ;)
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
    
    // Возвращаемся
    public void goBack() throws Exception {
        while (frontIsClear())
            move();
    }
    
    public void DropAndRun() throws Exception {
        putBeeper();
        while (frontIsClear()) {
            if (frontIsClear()) {
                move();
                if (frontIsClear()) {
                    move();
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
    
    public void ChangeLine() throws Exception {
        move();
        turnLeft();
    }
}
