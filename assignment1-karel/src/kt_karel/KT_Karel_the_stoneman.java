/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kt_karel;
import com.shpp.karel.KarelTheRobot;

/**
 * Задание с колоннами.
 * @author karponter
 */
public class KT_Karel_the_stoneman extends KarelTheRobot {
    
    // Зачем ЭТО вы знаете ;)
    public void run() throws Exception {
        buildItUp();
        while (frontIsClear()) {
            goNext();
        }
    }
    
    // строим колонну снизу вверх возвращаемся на исходную
    public void buildItUp() throws Exception {
        turnLeft();
        if (noBeepersPresent())
            putBeeper();
        while (frontIsClear()) {
            move();
            if (noBeepersPresent())
                putBeeper();
        }
        turnLeft();
        turnLeft();
        while (frontIsClear())
            move();
        turnLeft();
    }
    
    
    // шуруем к следующей колонне, если дошли - строим.
    public void goNext() throws Exception {
        if (frontIsClear()) {
            move();
            if (frontIsClear()) {
                move();
                if (frontIsClear()) {
                    move();
                    if (frontIsClear()) {
                        move();
                        buildItUp();
                    }
                }
            }
        }
    }
    
}
