package com.nhom7.quanlyluongthuong.Model;

import java.util.ArrayList;

public class ChamCong {
    private int thang;
    private int nam;
    private int soNgayLamViec;
    private int soGioLamThem;
    private long tienUngTruoc;
    private ArrayList<Thuong> danhSachThuong;
    private ArrayList<HocPhan> danhSachHocPhan;
    private ArrayList<PhuCap> danhSachPhuCap;

    public ChamCong() {
    }

    public ChamCong(int thang, int nam, int soNgayLamViec, int soGioLamThem, long tienUngTruoc) {
        this.thang = thang;
        this.nam = nam;
        this.soNgayLamViec = soNgayLamViec;
        this.soGioLamThem = soGioLamThem;
        this.tienUngTruoc = tienUngTruoc;
    }

    public int getThang() {
        return thang;
    }

    public void setThang(int thang) {
        this.thang = thang;
    }

    public int getNam() {
        return nam;
    }

    public void setNam(int nam) {
        this.nam = nam;
    }

    public int getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(int soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    public long getTienUngTruoc() {
        return tienUngTruoc;
    }

    public void setTienUngTruoc(long tienUngTruoc) {
        this.tienUngTruoc = tienUngTruoc;
    }

    public ArrayList<Thuong> getDanhSachThuong() {
        return danhSachThuong;
    }

    public void setDanhSachThuong(ArrayList<Thuong> danhSachThuong) {
        this.danhSachThuong = danhSachThuong;
    }

    public ArrayList<HocPhan> getDanhSachHocPhan() {
        return danhSachHocPhan;
    }

    public void setDanhSachHocPhan(ArrayList<HocPhan> danhSachHocPhan) {
        this.danhSachHocPhan = danhSachHocPhan;
    }

    public ArrayList<PhuCap> getDanhSachPhuCap() {
        return danhSachPhuCap;
    }

    public void setDanhSachPhuCap(ArrayList<PhuCap> danhSachPhuCap) {
        this.danhSachPhuCap = danhSachPhuCap;
    }
}
