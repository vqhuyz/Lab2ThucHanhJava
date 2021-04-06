    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab03;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Administrator
 */
    public class Bai6 extends JFrame implements ActionListener {

    /*Dùng để biểu diễn 4 nút của 4 phép toán +, -, *, / */
    private final JButton btnCong;
    private final JButton btnTru;
    private final JButton btnNhan;
    private final JButton btnChia;
    /*Dùng để chứa 2 số và 1 kết quả*/
    private final JTextField tf1;
    private final JTextField tf2;
    private final JTextField tf3;
    /*Dùng để lưu trữ kết quả tính toán*/
    private double result;
    /*Dùng để nhận tầng ContentPane của JFrame*/
    private final Container cont;
    /*Dùng để nhóm các thành phần trên giao diện*/
    private final JPanel panel1;
    private final JPanel panel2;
        
        	/*Hàm khởi tạo*/
	public Bai6(String s)
	{ 
            super(s);
            /*Lấy lớp ContentPane để đặt các đối tượng hiển thị*/
            cont = this.getContentPane(); 
		
            /*Tạo các thành phần trên giao diện*/
            JLabel num1lb = new JLabel("Num1: ");
            tf1 = new JTextField();
            JLabel num2lb = new JLabel("Num2: ");
            tf2 = new JTextField();
            JLabel resultlb = new JLabel("Result: ");
            tf3 = new JTextField();
            /*Textfield chứa kết quả không được phép sử dụng dữ liệu*/
            tf3.setEditable(false);
            /*Panel1 chứa 3 Textfield*/
            panel1 = new JPanel(); 
            /*thiết lập Layout gồm 3 hàng 2 cột*/
            panel1.setLayout(new GridLayout(3,2));
            /*Đặt các thành phần vào panel 1*/
            panel1.add(num1lb); 
            panel1.add(tf1); 
            panel1.add(num2lb); 
            panel1.add(tf2);
            panel1.add(resultlb);
            panel1.add(tf3);
            /*Tạo 4 nút biểu diễn 4 phép toán*/
            btnCong = new JButton("+");
            btnTru= new JButton("-");
            btnNhan = new JButton("*");
            btnChia = new JButton("/");
              
            /*Panel2 chứa 4 nút*/
            panel2 = new JPanel();
            panel2.add(btnCong);
            panel2.add(btnTru);
            panel2.add(btnNhan);
            panel2.add(btnChia);
            
            /*Đặt 2 panel vào ContentPane*/
            cont.add(panel1); 
            cont.add(panel2,"South"); 
		
            btnCong.addActionListener(this);
            btnTru.addActionListener(this); 
            btnNhan.addActionListener(this); 
            btnChia.addActionListener(this);
                
            /*Thiết lập kích thước hiển thị*/
            this.pack();
            this.setVisible(true);    
	}
        	/*Định nghĩa hàm cộng*/
	public void doPlus() 
	{ 
	   result = Double.parseDouble(tf1.getText()) + Double.parseDouble(tf2.getText()); 
	   tf3.setText(String.valueOf(result)); 
	}
        
	/*Định nghĩa hàm trừ*/
	public void doMinus() 
	{ 
		result = Double.parseDouble(tf1.getText()) - Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(result));
	}
        
	/*Định nghĩa hàm nhân*/
	public void doMult() 
	{
		result = Double.parseDouble(tf1.getText()) * Double.parseDouble(tf2.getText());
		tf3.setText(String.valueOf(result)); 
	}
        
	/*Định nghĩa hàm chia*/
	public void doDiv()
	{
	    result = Double.parseDouble(tf1.getText()) / Double.parseDouble(tf2.getText());
	    tf3.setText(String.valueOf(result));
	}
        
        //hàm sự kiện
        @Override
        public void actionPerformed(ActionEvent e) 
	{ 
            if(tf1.getText().isEmpty() || tf2.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Hãy nhập đủ số !!");
            }
            if ("+".equals(e.getActionCommand()))
            doPlus();
            if ("-".equals(e.getActionCommand()))
            doMinus();
            if ("*".equals(e.getActionCommand()))
            doMult();
            if ("/".equals(e.getActionCommand()))
            doDiv();     
	}
        
        public static void main(String args[]){
		/*Tạo giao diện chương trình*/
		Bai6 simpleCalculator = new Bai6("Máy tính");
		simpleCalculator.setLocationRelativeTo(null); // thiết lập cửa sổ ở giữa màn hình
	}
}
