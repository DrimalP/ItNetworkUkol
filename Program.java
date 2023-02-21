/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PETR
 */
public class Program {

    private Databaze databaze;
    private Scanner sc = new Scanner(System.in, "Windows-1250");

    public Program() {
        databaze = new Databaze();
    }

    public void vypisZaznamy() {
        databaze.vypisZaznamy();
    }

    public void pridejZaznam() {
        try {
            System.out.println("Zadejte jméno pojištěnce:");
            String jmeno = sc.nextLine().trim();
            System.out.println("Zadejte přijmení pojištěnce:");
            String prijmeni = sc.nextLine().trim();
            System.out.println("Zadejte jeho telefonní číslo:");
            int telefon = Integer.parseInt(sc.nextLine());
            System.out.println("Zadejte věk pojištěnce:");
            int vek = Integer.parseInt(sc.nextLine());
            databaze.pridejZaznam(jmeno, prijmeni, telefon, vek);
            System.out.println("\nData byla uložena.");
        } catch (Exception e) {
            System.out.println("\nPOZOR! Zadání neproběhlo v pořádku. Nebyl dodržen správný formát dat.");
        }
    }

    public void vyhledejZaznam() {
        System.out.println("Zadejte jméno pojištěnce:");
        String jmeno = sc.nextLine().trim();
        System.out.println("Zadejte přijmení pojištěnce:");
        String prijmeni = sc.nextLine().trim();
        ArrayList<Zaznam> zaznamy = databaze.najdiZaznamy(jmeno, prijmeni);
        // Výpis záznamů
        if (zaznamy.size() > 0) {
            System.out.println("\nNalezeny tyto záznamy: ");
            for (Zaznam z : zaznamy) {
                System.out.println(z);
            }
        } else {
            // Nenalezeno
            System.out.println("\nNebyly nalezeny žádné záznamy.");
        }
    }

    public void vymazZaznam() {
        System.out.println("Zadejte jméno pojištěnce:");
        String jmeno = sc.nextLine();
        System.out.println("Zadejte přijmení pojištěnce:");
        String prijmeni = sc.nextLine();
        databaze.vymazZaznamy(jmeno, prijmeni);
        System.out.println("\nZáznam byl vymazán.");
    }

    public void pokracovat() {
        System.out.println("\nPro pokračování stiskněte Enter...");
        sc.nextLine();
    }

    public void vypisMenu() {
        System.out.println("--------------------");
        System.out.println("Evidence pojištěných");
        System.out.println("--------------------");
        System.out.println("");
        System.out.println("Vyberte si akci:");
        System.out.println("1 - Přidat pojištěnce");
        System.out.println("2 - Vyhledat pojištěnce");
        System.out.println("3 - Vymazat pojištěnce");
        System.out.println("4 - Vypsat záznamy");
        System.out.println("5 - Konec");
    }

}
