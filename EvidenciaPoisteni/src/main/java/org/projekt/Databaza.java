package org.projekt;
import java.util.ArrayList;

public class Databaza {

    private ArrayList<Osoba> osoby;

    public Databaza() {
        osoby = new ArrayList<>();
    }

    public void pridajOsobu(String meno, String priezvisko, int vek, String telCislo) {
        osoby.add(new Osoba(meno, priezvisko, vek, telCislo));
    }

    public ArrayList<Osoba> najdiPoisteneho(String meno, String priezvisko) {

        ArrayList<Osoba> najdene = new ArrayList<>();
        for (Osoba o : osoby) {
            if ((o.getMeno().equals(meno)) && (o.getPriezvisko().equals(priezvisko))) {
                najdene.add(o);
            }
        }
        return najdene;
    }


 public void vypisOsoby() {
        for (int i = 0; i < osoby.size(); i++) {
            System.out.println(osoby.get(i));
        }
  }




}
