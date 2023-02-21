/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;

import java.util.ArrayList;

/**
 *
 * @author PETR
 */
public class Databaze {

    private ArrayList<Zaznam> zaznamy;

    public Databaze() {
        zaznamy = new ArrayList<>();
    }

    public void pridejZaznam(String jmeno, String prijmeni, int telefon, int vek) {
        zaznamy.add(new Zaznam(jmeno, prijmeni, telefon, vek));
    }

    public ArrayList<Zaznam> najdiZaznamy(String jmeno, String prijmeni) {
        ArrayList<Zaznam> nalezene = new ArrayList<>();
        for (Zaznam z : zaznamy) {
            if ((z.getJmeno().equals(jmeno)) && (z.getPrijemni().equals(prijmeni))) {
                nalezene.add(z);
            }
        }
        return nalezene;
    }

    public void vymazZaznamy(String jmeno, String prijmeni) {
        ArrayList<Zaznam> nalezeno = najdiZaznamy(jmeno, prijmeni);
        for (Zaznam z : nalezeno) {
            zaznamy.remove(z);
        }
    }

    public void vypisZaznamy() {
        for (Zaznam z : zaznamy) {
            System.out.println(z.toString());
        }
    }

}
