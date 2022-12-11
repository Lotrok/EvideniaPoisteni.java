package org.projekt;

public class Osoba {


    private String meno;
    private String priezvisko;
    private int vek;
    private String telCislo;

    public Osoba(String meno, String priezvisko, int vek, String telCislo) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
        this.telCislo = telCislo;
    }


    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public int getVek() {
        return vek;
    }

    public String getTelCislo() {
        return telCislo;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public void setTelCislo(String telCislo) {
        this.telCislo = telCislo;
    }

    @Override
    public String toString() {
        return meno + " " + priezvisko + " " + vek + " " + telCislo;
    }

}
