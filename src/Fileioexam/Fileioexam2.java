/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fileioexam;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Fileioexam2 {
    public static void main(String args[]) throws Exception{
        String fileName = "";
        File f = new File("");
        fileName = f.getAbsolutePath() + "\\src\\Fileioexam\\data.txt";
        f = new File(fileName);
        if(f.exists()){
            System.out.println("File da ton tai");
            System.exit(0);
        }
        PrintWriter pw = new PrintWriter(f);
        pw.print("Coppyright by Vu Quoc Huy -");
        pw.println(2021);
        pw.print("fb.com/vqhuyz");
        System.out.println("Da ghi file xong");
        Scanner inp = new Scanner(f);
        while(inp.hasNext()){
            String ten = inp.next();
            System.out.println(ten + "");
            int maso = inp.nextInt();
            System.out.println(maso);
        }
    }
}
