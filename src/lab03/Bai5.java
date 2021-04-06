/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 *
 * @author Administrator
 */
public class Bai5 extends JFrame {
    JFrame frame;
    /**
     * Creates new form Border
     */
    public Bai5() {
         frame = new JFrame();
        JButton btnNorth = new JButton("NORTH");
        btnNorth.setBackground(Color.red);
        JButton btnSouth = new JButton("SOUTH");
        btnSouth.setBackground(Color.MAGENTA);
        JButton btnEast = new JButton("EAST");
        btnEast.setBackground(Color.yellow);
        JButton btnWest = new JButton("WEST");
        btnWest.setBackground(Color.cyan);
        JButton btnCenter = new JButton("CENTER");
        btnCenter.setBackground(Color.ORANGE);
 
        frame.add(btnNorth, BorderLayout.NORTH);
        frame.add(btnSouth, BorderLayout.SOUTH);
        frame.add(btnEast, BorderLayout.EAST);
        frame.add(btnWest, BorderLayout.WEST);
        frame.add(btnCenter, BorderLayout.CENTER);
 
        frame.setSize(400, 300);
        frame.setVisible(true);
        frame.setTitle("Ví dụ BorderLayout trong Java Swing");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         new Bai5();
    }
}
