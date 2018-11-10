package com.nibm.features18;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CounterLambda extends JFrame {
   JTextField tfCount;
   int count = 0;

   public CounterLambda() {
      Container cp = getContentPane();
      cp.setLayout(new FlowLayout());

      cp.add(new JLabel("Counter"));
      tfCount = new JTextField(count + "", 8);
      tfCount.setEditable(false);
      cp.add(tfCount);

      // Using an anonymous inner class as ActionEvent handler
      JButton btnUp = new JButton("Count Up");
      cp.add(btnUp);
      btnUp.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            tfCount.setText(++count + "");
         }
      });

      // Using a Lambda Expression to return an instance of ActionListener
      JButton btnDown = new JButton("Count Down");
      cp.add(btnDown);
      btnDown.addActionListener(e -> tfCount.setText(--count + ""));

      setSize(400, 100);
      setVisible(true);
   }
   public static void main(String[] args) {
      // Using Lambda Expression to return a Runnable instance
      SwingUtilities.invokeLater(() -> new CounterLambda());
   }
}