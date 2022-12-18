package com.mit.odev6;

import java.io.Serializable;

public class Reklam implements Serializable {
    private int kod;
    private String ReklamAd;

    public Reklam(int kod, String reklamAd) {
        this.kod = kod;
        ReklamAd = reklamAd;
    }

    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public String getReklamAd() {
        return ReklamAd;
    }

    public void setReklamAd(String reklamAd) {
        ReklamAd = reklamAd;
    }
}
