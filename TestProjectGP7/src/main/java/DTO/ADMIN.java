/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author admin
 */
public class ADMIN {
    private String TaiKhoan , MatKhau;

    public ADMIN() {
    }

    public ADMIN(String TaiKhoan, String MatKhau) {
        this.TaiKhoan = TaiKhoan;
        this.MatKhau = MatKhau;
    }
    
    public String getTaiKhoan() {
        return TaiKhoan;
    }

    public void setTaiKhoan(String TaiKhoan) {
        this.TaiKhoan = TaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }
    
}
