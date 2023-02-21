/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package cz.itnetwork.evidencepojisteni;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author PETR
 */
public class EvidencePojisteni {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in, "Windows-1250");
        String volba = "";
        Program program = new Program();

        while (!volba.equals("5")) {
            program.vypisMenu();
            System.out.print("\nZadej svou volbu: ");
            volba = sc.next();
            System.out.println();
            // reakce na volbu
            switch (volba) {
                case "1":
                    program.pridejZaznam();
                    program.pokracovat();
                    break;
                case "2":
                    program.vyhledejZaznam();
                    program.pokracovat();
                    break;
                case "3":
                    program.vymazZaznam();
                    program.pokracovat();
                    break;
                case "4":
                    program.vypisZaznamy();
                    program.pokracovat();
                    break;
                case "5":
                    System.out.println("Program ukončen.");
                    break;
                default:
                    System.out.println("Neplatná volba! Opakujte volbu prosím.");
                    break;
            }
        }
        
    }
    
}
