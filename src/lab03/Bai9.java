/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.awt.Button;
import java.awt.Event;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author Administrator
 */
public class Bai9 extends Frame implements ActionListener {

    Label lblInput, lblOutput;
    TextField txtInput;
    Button btnUpper, btnLower, btnClear, btnExit;

    public Bai9(String name) {
        super(name);

        lblInput = new Label("Input: ");
        lblInput.setBounds(20, 50, 150, 20);

        txtInput = new TextField("");
        txtInput.setBounds(60, 50, 150, 20);

        lblOutput = new Label();
        lblOutput.setBounds(20, 80, 150, 20);

        btnUpper = new Button("Upper");
        btnUpper.setBounds(10, 120, 60, 30);
        btnUpper.addActionListener(e ->
        {
            try {
                String host = txtInput.getText();
                lblOutput.setText("Bạn đã nhập: " + host.toUpperCase());
            } catch (Exception ex) {
                System.out.println(ex);
        }
        });

        btnLower = new Button("Lower");
        btnLower.setBounds(90, 120, 60, 30);
        btnLower.addActionListener(e ->
        {
            try {
                String host = txtInput.getText();
                lblOutput.setText("Bạn đã nhập: " + host.toLowerCase());
            } catch (Exception ex) {
                System.out.println(ex);
        }
        });
        
        btnClear = new Button("Clear");
        btnClear.setBounds(160, 120, 60, 30);
        btnClear.addActionListener(e ->
        {
            try {
                txtInput.setText("");
                lblOutput.setText("");
            } catch (Exception ex) {
                System.out.println(ex);
        }
        });
        
        btnExit = new Button("Exit");
        btnExit.setBounds(230, 120, 60, 30);
        btnExit.addActionListener(e ->
        {
            try {
                System.exit(0);
            } catch (Exception ex) {
                System.out.println(ex);
        }
        });
       
        add(btnUpper);
        add(btnLower);
        add(btnClear);
        add(btnExit);

        add(txtInput);
        add(lblInput);
        add(lblOutput);

        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setSize(300, 250);
        setLayout(null);

    }
    
    public void actionPerformed(ActionEvent v) {
        
    }

    
    public static void main(String[] args) {
        Bai9 a =
        new Bai9("Demo Frame");
        a.setVisible(true);
    }
}
