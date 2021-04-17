/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class Bai4 extends JFrame {

    private JPanel contentPane;
    private JTextField txtNhap;
    private JList list;
    private DefaultListModel<Integer> model;
    private JCheckBox chckbxNhapAm;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Bai4 frame = new Bai4();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Bai4() {
        setTitle("Thao tác trên Jlist");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 631, 374);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        JPanel pNorth = new JPanel();
        JLabel lblThaoTcTrn = new JLabel("Thao tác trên Jlis - CheckBox");
        lblThaoTcTrn.setForeground(Color.BLUE);
        lblThaoTcTrn.setFont(new Font("Tahoma", Font.PLAIN, 24));
        pNorth.add(lblThaoTcTrn);
        contentPane.add(pNorth, BorderLayout.NORTH);
        JPanel pCenter = new JPanel();
        contentPane.add(pCenter);
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.setBounds(0, 11, 211, 230);
        Border mBorder = BorderFactory.createLineBorder(Color.RED);
        pCenter.setLayout(null);
        panel.setBorder(BorderFactory.createTitledBorder(mBorder,
                "Chọn tác vụ "));
        pCenter.add(panel);
        JButton btnToDenSoChan = new JButton("Tô đen số chẵn");
        btnToDenSoChan.addActionListener(mActionListener);
        panel.add(btnToDenSoChan);
        JButton btnToDenSoLe = new JButton("Tô đen số lẻ");
        btnToDenSoLe.addActionListener(mActionListener);
        panel.add(btnToDenSoLe);
        JButton btnTenSoNguyenTo = new JButton("Tô đen số nguyên tố");
        btnTenSoNguyenTo.addActionListener(mActionListener);
        panel.add(btnTenSoNguyenTo);
        JButton btnBoToDen = new JButton("Bỏ tô đen");
        btnBoToDen.addActionListener(mActionListener);
        panel.add(btnBoToDen);
        JButton btnXoa = new JButton("Xóa các giá trị đang tô đen");
        btnXoa.addActionListener(mActionListener);
        panel.add(btnXoa);
        JButton btnTongGiaTri = new JButton("Tổng các giá trị trong list");
        btnTongGiaTri.addActionListener(mActionListener);
        panel.add(btnTongGiaTri);
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(221, 11, 384, 230);
        pCenter.add(panel_1);
        panel_1.setBorder(BorderFactory.createTitledBorder(mBorder,
                "Nhập thông tin"));
        panel_1.setLayout(null);
        JPanel panel_2 = new JPanel();
        panel_2.setBounds(10, 19, 363, 33);
        panel_1.add(panel_2);
        JButton btnNhap = new JButton("Nhập");
        btnNhap.addActionListener(mActionListener);
        btnNhap.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent arg0) {
                int key = arg0.getKeyCode();
                if (key == KeyEvent.VK_ENTER) {
                    nhap();
                }
            }
        });
        panel_2.add(btnNhap);
        txtNhap = new JTextField();
        panel_2.add(txtNhap);
        txtNhap.setColumns(10);
        chckbxNhapAm = new JCheckBox("Cho nhập giá trị âm");
        panel_2.add(chckbxNhapAm);
        model = new DefaultListModel<Integer>();
        list = new JList();
        list.setModel(model);
        list.setBounds(0, 0, 110, 111);
        JScrollPane mJScrollPane = new JScrollPane();
        mJScrollPane.setViewportView(list);
        mJScrollPane.setBounds(10, 54, 363, 165);
        panel_1.add(mJScrollPane);
        JPanel panel_3 = new JPanel();
        contentPane.add(panel_3, BorderLayout.SOUTH);
        panel_3.setBorder(mBorder);
        JButton btnDong = new JButton("Đóng chương trình");
        btnDong.addActionListener(mActionListener);
        panel_3.add(btnDong);
    }
    ActionListener mActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String commamd = e.getActionCommand();
            list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
            ArrayList<Integer> a = new ArrayList<Integer>();
            int[] mSelected;
            switch (commamd) {
                case "Tô đen số chẵn":
                    for (int i = 0; i < model.getSize(); i++) {
                        if ((model.getElementAt(i) % 2) == 0) {
                            a.add(i);
                        }
                    }
                    mSelected = convertIntegers(a);
                    list.setSelectedIndices(mSelected);
                    break;
                case "Tô đen số lẻ":
                    for (int i = 0; i < model.getSize(); i++) {
                        if ((model.getElementAt(i) % 2) != 0) {
                            a.add(i);
                        }
                    }
                    mSelected = convertIntegers(a);
                    list.setSelectedIndices(mSelected);
                    break;
                case "Tô đen số nguyên tố":
                    for (int i = 0; i < model.getSize(); i++) {
                        if (isSoNguyenTo(i)) {
                            a.add(i);
                        }
                    }
                    mSelected = convertIntegers(a);
                    list.setSelectedIndices(mSelected);
                    break;
                case "Bỏ tô đen":
                    list.clearSelection();
                    break;
                case "Xóa các giá trị đang tô đen":
                    if (list.getSelectedIndices().length > 0) {
                        int[] selectedIndices = list.getSelectedIndices();
                        for (int i = selectedIndices.length - 1; i >= 0;
                                i--) {
                            model.removeElementAt(selectedIndices[i]);
                        }
                    }
                    break;
                case "Tổng các giá trị trong list":
                    list.getSelectedIndices();
                    int tong = 0;
                    for (int j = 0; j < model.size(); j++) {
                        tong += model.getElementAt(j);
                    }
                    JOptionPane.showMessageDialog(null, "Tổng :" + tong);
                    break;
                case "Nhập":
                    nhap();
                    break;
                case "Đóng chương trình":
                    int dong = JOptionPane.showConfirmDialog(null,
                            "Đóng chương trình", "Thông báo",
                            JOptionPane.OK_CANCEL_OPTION);
                    if (dong == JOptionPane.OK_OPTION) {
                        System.exit(1);
                    }
                    break;
                default:
                    break;
            }
        }
    };

    public void nhap() {
        try {
            if (chckbxNhapAm.isSelected()) {
                model.addElement(Integer.parseInt(txtNhap.getText()));
            } else {
                if (Integer.parseInt(txtNhap.getText()) >= 0) {
                    model.addElement(Integer.parseInt(txtNhap.getText()));
                } else {
                    JOptionPane.showMessageDialog(null, "Không thể nhập số âm !");
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Sai định dạng !");
            e.printStackTrace();
        } catch (HeadlessException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    /**
     * @param i
     */
    public boolean isSoNguyenTo(int i) {
        int dem = 0;
        for (int j = 1; j < model.getElementAt(i) / 2; j++) {
            if (model.getElementAt(i) % j == 0) {
                dem++;
            }
        }
        if (dem > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static int[] convertIntegers(ArrayList<Integer> integers) {
        int[] ret = new int[integers.size()];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = integers.get(i).intValue();
        }
        return ret;
    }
}
