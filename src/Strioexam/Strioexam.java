/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strioexam;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 *
 * @author Administrator
 */
public class Strioexam {

    public static void main(String args[]) throws IOException {
        StringWriter ost = new StringWriter();
        String s = "Xin chao, day la chuong trinh doc xuat chuoi";
        for (int i = 0; i < s.length(); i++) {
            ost.write(s.charAt(i));
        }
        System.out.println("Xuat chuoi: " + ost);
        StringReader inst;
        inst = new StringReader(ost.toString());
        int a;
        StringBuilder sb1 = new StringBuilder("");
        while ((a = inst.read()) != -1) {
            sb1.append((char)a);
        }
        s = sb1.toString();
        System.out.println("Chieu dai chuoi doc duoc la: " + s.length());
        System.out.println("Day la chuoi doc duoc: " + s);
    }
}
