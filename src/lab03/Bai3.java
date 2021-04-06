/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Administrator
 */
public class Bai3 extends JFrame {
     private static final long serialVersionUID = 1L;
    public Bai3(String title){
        setTitle(title);
        JPanel pnFlow = new JPanel();
        //pnFlow.setLayout(new FlowLayout("hrhr"));
        pnFlow.setBackground(Color.PINK);
        JButton btnFlowLayout  = new JButton("FlowLayout");
        JButton btnAddControll  = new JButton("Add các control");
        JButton btnUpLine  = new JButton("Trên 1 dòng");
        JButton btnOverLine  = new JButton("Hết chỗ chứa");
        JButton btnDownLine  = new JButton("Thì xuống dòng");
        pnFlow.add(btnFlowLayout);
        pnFlow.add(btnAddControll);
        pnFlow.add(btnUpLine);
        pnFlow.add(btnOverLine);
        pnFlow.add(btnDownLine);
        Container con = getContentPane();
        con.add(pnFlow);               
    }
    
    public static void main(String[] args) {
        Bai3 myUI = new Bai3("Demo FlowLayout");
        myUI.setSize(600,100);
        myUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myUI.setLocationRelativeTo(null);
        myUI.setVisible(true);
    }
}
