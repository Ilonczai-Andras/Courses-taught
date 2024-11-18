package org.example;

import SzotarPeldak.Szotar;
import HalmazPeldak.Halmaz;

public class Main {
    public static void main(String[] args) {
        //prio 1
        System.out.println("\nSzótár példák:");
        Szotar.szotarPeldak();
        //gyakoralti példa
        // Termékek hozzáadása a raktárhoz
        Szotar.hozzaadTermek("001", 50);
        Szotar.hozzaadTermek("002", 30);
        Szotar.hozzaadTermek("001", 20); // Mennyiség növelése meglévő terméknél
        // Raktárkészlet listázása
        Szotar.listazRaktarKeszlet();
        // Egy termék törlése
        Szotar.torolTermek("002");
        // Raktárkészlet újra listázása
        Szotar.listazRaktarKeszlet();


        //-------------------------------------------------------
//        System.out.println("Halmaz példák:");
//        Halmaz.halmazPeldak();
//        //gyakoralti példa

//        // Próbáljuk meg regisztrálni ugyanazt az e-mail címet
//        Halmaz.regisztralFelhasznalo("test@example.com");
//        Halmaz.regisztralFelhasznalo("hello@example.com");
//        Halmaz.regisztralFelhasznalo("test@example.com"); // Ez már sikertelen lesz
//
//        // Az összes felhasználó listázása
//        Halmaz.listazRegisztraltFelhasznalok();
    }
}