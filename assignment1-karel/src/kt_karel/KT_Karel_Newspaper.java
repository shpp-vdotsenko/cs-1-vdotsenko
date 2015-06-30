/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kt_karel;
import com.shpp.karel.KarelTheRobot;
/**
 * Газетка, она самая.
 * @author karponter
 */

public class KT_Karel_Newspaper extends KarelTheRobot {
    
    // Зачем ЭТО вы знаете ;)
    public void run() throws Exception {
        goToNP();
        grabThatPieceOfPaper();
        goBack();
    }
    
    // Выходим на улицу, поприветствовать солнышко
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
    
    // Идем назад.
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
    
    // о газетке не забываем
    public void grabThatPieceOfPaper() throws Exception {
        pickBeeper();
    }
}
