package com.nana;
import java.awt.EventQueue;
/**
 * Created by NaNa on 10/7/2016.
 */
public class App {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GameGUI().setVisible(true);
            }
        });

    }
}
