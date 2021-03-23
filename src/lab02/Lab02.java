/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02;

import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author Administrator
 */
public class Lab02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //bai1_GiaiPTBac2();
        //bai2_MangNguyenTo();
        //bai3_MaTran();
        //bai4_ChuyenInHoa();
        //bai5_TimChuoiDaiNhat();

    }

    public static void bai1_GiaiPTBac2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất, a = ");
        float firstParam = scanner.nextFloat();
        System.out.print("Nhập số thứ hai, b = ");
        float secondParam = scanner.nextFloat();
        System.out.print("Nhập nhập số thứ ba, c = ");
        float thirdParam = scanner.nextFloat();
        // kiểm tra các hệ số
        if (firstParam == 0) {
            if (secondParam == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-thirdParam / secondParam));
            }
            return;
        }
        // tính delta
        float delta = secondParam * secondParam - 4 * firstParam * thirdParam;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-secondParam + Math.sqrt(delta)) / (2 * firstParam));
            x2 = (float) ((-secondParam - Math.sqrt(delta)) / (2 * firstParam));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-secondParam / (2 * firstParam));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }

    public static void bai2_MangNguyenTo() {
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số phần tử: ");
        int n = input.nextInt();
        int[] a = new int[n];
        NhapMang(a, n);
        System.out.print("Những số nguyên tố có trong mảng là: ");
        XuatMangNguyenTo(a, n);
    }

    public static void bai3_MaTran() {

    }

    public static void bai4_ChuyenInHoa() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao 1 xau: ");
        String strInput = input.nextLine();
        System.out.println("Xau duoc chuan hoa la: " + chuanHoa(strInput));
    }

    public static void bai5_TimChuoiDaiNhat() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao một chuỗi: ");
        String strInput = input.nextLine();
        StringTokenizer strToken = new StringTokenizer(strInput, " ,\t,\r");
        int Max, i = 1, lengthStr;
        Max = strToken.nextToken().length();
        int viTriMax = i;
        while (strToken.hasMoreTokens()) {
            lengthStr = strToken.nextToken().length();
            i++;
            if (Max < lengthStr) {
                Max = lengthStr;
                viTriMax = i;
            }
        }
        System.out.println("Do dai chuỗi lớn nhất là: " + Max + " ở vị trí " + viTriMax);
    }

    public static void NhapMang(int[] a, int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = rand.nextInt(50);
        }
    }

    public static void XuatMangNguyenTo(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            if (KiemTraNguyenTo(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static boolean KiemTraNguyenTo(int number) {
        if (number < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(number);
        for (int i = 2; i <= squareRoot; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String chuyenInHoa(String str) {
        String s, strOutput;
        s = str.substring(0, 1);
        strOutput = str.replaceFirst(s, s.toUpperCase());
        return (strOutput);
    }

    public static String chuanHoa(String strInput) {
        String strOutput = "";
        StringTokenizer strToken = new StringTokenizer(strInput, " ,\t,\r");
        strOutput += "" + chuyenInHoa(strToken.nextToken());
        while (strToken.hasMoreTokens()) {
            strOutput += " " + chuyenInHoa(strToken.nextToken());
        }
        return (strOutput);
    }
}
