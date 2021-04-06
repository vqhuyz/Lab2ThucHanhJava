/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class Bai4 extends JFrame {
    private static final long serialVersionUID = 1L;
    public Bai4(String title){
        JPanel pnBox = new JPanel();
        //pnBox.setLayout(new BoxLayout());
        JButton btn1 = new JButton("BoxLayout");
        btn1.setForeground(Color.red);
        Font font = new Font("Arial",Font.BOLD | Font.ITALIC,25);
        btn1.setFont(font);pnBox.add(btn1);
        JButton btnX_Axis = new JButton("X_AXIS");
        btnX_Axis.setForeground(Color.BLUE);
        btnX_Axis.setFont(font);pnBox.add(btnX_Axis);
        JButton btnY_Axis = new JButton("Y_AXIS");
        btnY_Axis.setForeground(Color.GRAY);
        btnY_Axis.setFont(font);pnBox.add(btnY_Axis);
        
        Container con = getContentPane();
        con.add(pnBox);                 
    }
    
    public static void main(String[] args) {
        
        Bai4 myUI = new Bai4("BoxLayout");
        myUI.setSize(600,100);
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setLocationRelativeTo(null);
        myUI.setVisible(true);
    }
}
