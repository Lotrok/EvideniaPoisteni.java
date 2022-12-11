package org.projekt;

import java.util.Scanner;

public class EvideniaPoisteni {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"Windows-1250");
        Evidencia evidencia = new Evidencia();
        String volba = "";

        while (!volba.equals("4")) {
            evidencia.vypisUvod();
            System.out.println();
            System.out.println("Vyberte si akci:");
            System.out.println("1 - Pridať nového poisteného");
            System.out.println("2 - Vypísať všetkých poistených");
            System.out.println("3 - Vyhladať poisteného");
            System.out.println("4 - Konec");
            volba = sc.nextLine();
            System.out.println();
            switch (volba) {
                case "1":
                    evidencia.pridajOsobu();
                    System.out.println("Dáta boli uložené.");
                    break;
                case "2":
                    evidencia.vypisZoznam();
                    break;
                case "3":
                    evidencia.vyhladajOsobu();
                    break;
                case "4":
                    System.out.println("Konec");
                    break;
                default:
                    System.out.println("Pokračujte ľubovoľnou klávesou...");


            }
        }

    }
}