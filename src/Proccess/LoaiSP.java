/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Proccess; 
import java.sql.*; 
import Database.Connect; 

/**
 *
 * @author Administrator
 */
public class LoaiSP {
      public Connect cn= new Connect();     
        //Truy van tat ca du lieu trong Table LoaiSP 
        public ResultSet ShowLoaiSP() throws SQLException{    
           cn.connectSQL(); 
           String sql = "SELECT * FROM LoaiSP";         
           return cn.LoadData(sql); 
        } 
        //Truy van cac dong du lieu trong Table LoaiSP theo Maloai 
        public ResultSet ShowLoaiSP(String ml) throws SQLException{    
           String sql = "SELECT * FROM LoaiSP where Maloai='" + ml +"'";         
           return cn.LoadData(sql); 
        } 
        //Theo moi 1 dong du lieu vao table LoaiSP 
        public void InsertData(String ml, String tl) throws SQLException{    
           String sql = "INSERT INTO LoaiSP values('" + ml +"',N'" + tl +"')";  
           cn.UpdateData(sql); 
        } 
        //Dieu chinh 1 dong du lieu vao table LoaiSP 
        public void EditData(String ml, String tl) throws SQLException{    
           String sql = "Update LoaiSP set Tenloai=N'" + tl + "' where Maloai='" + ml +"'";         
           cn.UpdateData(sql); 
        } 
        //Xoa 1 dong du lieu vao table LoaiSP 
        public void DeleteData(String ml) throws SQLException{    
           String sql = "Delete from LoaiSP where Maloai='" + ml +"'";         
           cn.UpdateData(sql); 
        } 
        public ResultSet ShowSPTheoloai(String ml) {            
         String sql = "SELECT MaSP,TenSP,Dongia,Tenloai FROM Sanpham S, LoaiSP L  where L.Maloai=S.Maloai and L.Maloai='" + ml +"'"; 
         return cn.LoadData(sql); 
        }

}
