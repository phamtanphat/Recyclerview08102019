package com.example.recyclerview08102019;

public class Monan {
    private String ten;
    private String mota;
    private int hinhanh;

    public Monan() {

    }

    public Monan(String ten, String mota, int hinhanh) {
        this.ten = ten;
        this.mota = mota;
        this.hinhanh = hinhanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }
}
