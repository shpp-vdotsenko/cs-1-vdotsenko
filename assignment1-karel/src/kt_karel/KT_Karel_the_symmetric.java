/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kt_karel;
import com.shpp.karel.KarelTheRobot;

/**
 * Поиск средины ширины
 * @author karponter
 */
public class KT_Karel_the_symmetric extends KarelTheRobot {
    
    // Зачем ЭТО вы знаете ;)
    public void run() throws Exception {
        // здесь все тихо-мирно
        runrun();
        putBeeper();
    }
    
    // Рекурсия.
    // Пока углубляемся - делаем два шага вперед.
    // Как только упираемся в стену - разворачиваемся и прерываем рекурсию.
    // Во время свертывания стека рекурсии делаем один шаг и таким образом попадаем на средину поля.
    // Возврат сделал чтобы не возиться с громадными вложенными условиями на каждый шаг.
    public void runrun() throws Exception {
        if (frontIsClear()) {           // условие остановки рекурсии
            move();                     // шаг 1
            if (frontIsClear()) {       // условие остановки рекурсии
                move();                 // шаг 2
                if (frontIsClear()) {   // условие остановки рекурсии
                    runrun();           // вот здесь углубляемся
                } else {
                    turnLeft();
                    turnLeft();
                }
            } else {
                turnLeft();
                turnLeft();
            }
        } else {
            turnLeft();
            turnLeft();
        }
        move();                         // возвращаемся
    }
}
