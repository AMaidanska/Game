package com.nana;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * Created by NaNa on 10/7/2016.
 */
public class GameGUI extends JFrame {
    private JTextField inputNumberField = new JTextField();
    private JLabel infoLabel = new JLabel();
    private JLabel printResultLabel = new  JLabel();
    private JButton startButton = new JButton();
    public GameGUI(){
        initComponents();
    }

    private void initComponents() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nana's Game");
        startButton.setText("START");
        infoLabel.setText(LabelConstants.INFO.label);

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(inputNumberField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(infoLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(startButton)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(printResultLabel)))
                                .addContainerGap(27, Short.MAX_VALUE))
        );

        layout.linkSize(SwingConstants.HORIZONTAL, new java.awt.Component[] {startButton, inputNumberField});

        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(infoLabel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(inputNumberField))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(startButton)
                                        .addComponent(printResultLabel))
                                .addContainerGap(21, Short.MAX_VALUE))
        );
        pack();
    }

    private void   startButtonActionPerformed(ActionEvent evt)  {
        String  text = inputNumberField.getText();
        printResultLabel.setText(Game.parseNumber(text));

    }




}
