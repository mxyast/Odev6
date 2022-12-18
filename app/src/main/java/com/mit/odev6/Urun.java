package com.mit.odev6;

import java.io.Serializable;

public class Urun implements Serializable {
    private int kod;
    private String urunAd;
    private String resimAdi;
    private String ozellik;
    private Double fiyat;

    public Urun(int kod, String urunAd, String resimAdi, String ozellik, Double fiyat) {
        this.kod = kod;
        this.urunAd = urunAd;
        this.resimAdi = resimAdi;
        this.ozellik = ozellik;
        this.fiyat = fiyat;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public String getUrunAd() {
        return urunAd;
    }

    public void setUrunAd(String urunAd) {
        this.urunAd = urunAd;
    }

    public String getResimAdi() {
        return resimAdi;
    }

    public void setResimAdi(String resimAdi) {
        this.resimAdi = resimAdi;
    }

    public String getOzellik() {
        return ozellik;
    }

    public void setOzellik(String ozellik) {
        this.ozellik = ozellik;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }
}
