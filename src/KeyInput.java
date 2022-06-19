/*

Description:

Main KeyListener for the game. Responsible for reporting and updating the states of interested keys to be used when
making calculations for the game components.

*/

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.*;

public class KeyInput implements KeyListener {


    public KeyInput() {
    }

    public void keyTyped(KeyEvent e) {

    }

    //Description: resets all key-states of interested keys to false
    //Parameters: none
    //Return: void
    public void reset() {

        //Reset every key-state to false
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 6; j++) {
                Stats.setKeyPress(i,j, false);
            }
        }
    }

    //Description: toggles the state of the pressed key to true if it is a key of interest
    //Parameters: the reported KeyEvent
    //Return: void
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_D) {
            Stats.debug = 1;
        }
        if (Stats.debug == 0) {

            //Update the key-state to true if a key of interest is pressed
            if (key == KeyEvent.VK_LEFT)
                Stats.setKeyPress(0,0, true);
            if (key == KeyEvent.VK_RIGHT)
                Stats.setKeyPress(0,1, true);
            if (key == KeyEvent.VK_SPACE)
                Stats.setKeyPress(0,2, true);
            if (key == KeyEvent.VK_UP)
                Stats.setKeyPress(0,3, true);
            if (key == KeyEvent.VK_DOWN)
                Stats.setKeyPress(0,4, true);
            if (key == KeyEvent.VK_ENTER)
                Stats.setKeyPress(0,5, true);
            if (key == KeyEvent.VK_ESCAPE)
                Stats.setKeyPress(0,6, true);
        } else {
            if (key == KeyEvent.VK_LEFT)
                Stats.setKeyPress(1,0, true);
            if (key == KeyEvent.VK_RIGHT)
                Stats.setKeyPress(1,1, true);
            if (key == KeyEvent.VK_SPACE)
                Stats.setKeyPress(1,2, true);
            if (key == KeyEvent.VK_UP)
                Stats.setKeyPress(1,3, true);
            if (key == KeyEvent.VK_DOWN)
                Stats.setKeyPress(1,4, true);
            if (key == KeyEvent.VK_ENTER)
                Stats.setKeyPress(1,5, true);
            if (key == KeyEvent.VK_ESCAPE)
                Stats.setKeyPress(1,6, true);
        }

    }

    //Description: toggles the state of the released key to false if it is a key of interest
    //Parameters: the reported KeyEvent
    //Return: void
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key == KeyEvent.VK_D) {
            Stats.debug = 0;
        }
        if (Stats.debug == 0) {

            //Update the key-state to false if a key of interest is released
            if (key == KeyEvent.VK_LEFT)
                Stats.setKeyPress(0,0, false);
            if (key == KeyEvent.VK_RIGHT)
                Stats.setKeyPress(0,1, false);
            if (key == KeyEvent.VK_SPACE)
                Stats.setKeyPress(0,2, false);
            if (key == KeyEvent.VK_UP)
                Stats.setKeyPress(0,3, false);
            if (key == KeyEvent.VK_DOWN)
                Stats.setKeyPress(0,4, false);
            if (key == KeyEvent.VK_ENTER)
                Stats.setKeyPress(0,5, false);
            if (key == KeyEvent.VK_ESCAPE)
                Stats.setKeyPress(0,6, false);
        } else {
            if (key == KeyEvent.VK_LEFT)
                Stats.setKeyPress(1,0, false);
            if (key == KeyEvent.VK_RIGHT)
                Stats.setKeyPress(1,1, false);
            if (key == KeyEvent.VK_SPACE)
                Stats.setKeyPress(1,2, false);
            if (key == KeyEvent.VK_UP)
                Stats.setKeyPress(1,3, false);
            if (key == KeyEvent.VK_DOWN)
                Stats.setKeyPress(1,4, false);
            if (key == KeyEvent.VK_ENTER)
                Stats.setKeyPress(1,5, false);
            if (key == KeyEvent.VK_ESCAPE)
                Stats.setKeyPress(1,6, false);
        }

    }

}
