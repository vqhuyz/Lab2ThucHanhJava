/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Exception_1 {
        public static void main(String[] args) {
        int n;
        try {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Nhập số nguyên dương", ""));
        } catch (java.lang.NumberFormatException e1) {
            //bắt lỗi nếu input không phải number
            System.out.println(e1.toString());
        } finally {
            System.out.println("Have good fun");
        }
    }
}
