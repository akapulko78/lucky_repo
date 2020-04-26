package Java_Level_1.lesson_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyWindow extends JFrame {

    JButton[] jbs = new JButton[25];

    public MyWindow() {
        setTitle("First window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 400, 400);
        printMap1();
        //init();
    }

    private void printMap1() {

        setLayout(new GridLayout(5, 5));
        for (int i = 0; i < jbs.length; i++) {
            add(jbs[i] = new JButton());
        }
    }

    private void processClick(JButton button) {
        System.out.println("click! " + button.getText());

    }


    public static void main(String[] args) {
        MyWindow gameWindow = new MyWindow();
        gameWindow.setVisible(true);
        GameProcess gameProcess = new GameProcess();
        gameProcess.initMap();
        gameWindow.printMap1();
        gameProcess.game();
        // gameWindow.processClick();
    }


}
