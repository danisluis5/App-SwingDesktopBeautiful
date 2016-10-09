/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author vuongluis
 */
public class Customer {
    private int maKH;
    private String tenKhachHang;
    private String soCMT;
    private String thuDienTu;
    private String diaChi;
    private String ngheNghiep;
    private String soDienThoai;
    private String quocTich;
    private int maTV;

    public Customer() {
    }

    public Customer(int maKH, String tenKhachHang, String soCMT, String thuDienTu, String diaChi, String ngheNghiep, String soDienThoai, String quocTich, int maTV) {
        this.maKH = maKH;
        this.tenKhachHang = tenKhachHang;
        this.soCMT = soCMT;
        this.thuDienTu = thuDienTu;
        this.diaChi = diaChi;
        this.ngheNghiep = ngheNghiep;
        this.soDienThoai = soDienThoai;
        this.quocTich = quocTich;
        this.maTV = maTV;
    }

    public int getMaKH() {
        return maKH;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public String isSoCMT() {
        return soCMT;
    }

    public String getThuDienTu() {
        return thuDienTu;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public int getMaTV() {
        return maTV;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public void setSoCMT(String soCMT) {
        this.soCMT = soCMT;
    }

    public void setThuDienTu(String thuDienTu) {
        this.thuDienTu = thuDienTu;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public void setMaTV(int maTV) {
        this.maTV = maTV;
    }
}
