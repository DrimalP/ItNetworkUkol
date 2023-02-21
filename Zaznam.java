/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;

/**
 *
 * @author PETR
 */
public class Zaznam {

    private String jmeno;
    private String prijmeni;
    private int telefon;
    private int vek;

    public Zaznam(String jmeno, String prijmeni, int telefon, int vek) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPrijemni() {
        return prijmeni;
    }

    public int getVek() {
        return vek;
    }

    public int getTelefon() {
        return telefon;
    }

    @Override
    public String toString() {
        return jmeno + " " + prijmeni + ", telefon: " + telefon + ", věk: " + vek;
    }

}
