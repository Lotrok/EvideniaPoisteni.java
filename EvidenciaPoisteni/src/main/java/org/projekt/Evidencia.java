package org.projekt;


import java.util.ArrayList;
import java.util.Scanner;

public class Evidencia {

    private Databaza databaza;
    private Scanner sc = new Scanner(System.in,"Windows-1250");

    public Evidencia() {
        databaza = new Databaza();
    }


  public void vypisZoznam() {
        databaza.vypisOsoby();
    }

    public void pridajOsobu() {
        System.out.println("Zadajte meno pisteného:");
        String meno = sc.nextLine();
        System.out.println("Zadajte priezvisko:");
        String priezvisko = sc.nextLine();
        System.out.println("Zadajte vek:");
        int vek = sc.nextInt();
        sc.nextLine();
        System.out.println("Zadajte telefónne číslo:");
        String telCislo = sc.nextLine();

        databaza.pridajOsobu(meno,priezvisko,vek,telCislo);
    }

    public void vyhladajOsobu() {

        System.out.println("Zadajte meno:");
        String meno = sc.nextLine();
        System.out.println("Zadajte priezvisko:");
        String priezvisko = sc.nextLine();

        ArrayList<Osoba> osoby = databaza.najdiPoisteneho(meno,priezvisko);
        if (osoby.size() > 0) {
            for (Osoba o : osoby) {
                System.out.println(o);
                }
            } else {
                System.out.println("Nenšali sa žiadne osoby.");
            }
        }

        public void vypisUvod() {
        System.out.println("_________________________");
        System.out.println("Evidencia poistených");
        System.out.println("_________________________");

        }












    }




