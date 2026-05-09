/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.expressaoregular;

/**
 *
 * @author izabe
 */
public class Main {

    public static void main(String[] args) {
        ExpressaoRegular ER = new ExpressaoRegular();

        System.out.println("EXERCÍCIO 02 (aa ou bb)");
        ER.confere(ER.getEX2(), "abaabbba"); // ACEITA
        ER.confere(ER.getEX2(), "ababab");   // rejeitada

        System.out.println("\nEXERCÍCIO 03 (Par de a e b)");
        ER.confere(ER.getEX3(), "aabb");     // ACEITA
        ER.confere(ER.getEX3(), "abab");     // ACEITA
        ER.confere(ER.getEX3(), "aba");      // rejeitada

        System.out.println("\nEXERCÍCIO 04 (Começa/Termina com a)");
        ER.confere(ER.getEX4(), "abbaa");    // ACEITA
        ER.confere(ER.getEX4(), "a");        // ACEITA
        ER.confere(ER.getEX4(), "ba");       // rejeitada

        System.out.println("\nEXERCÍCIO 05 (E-mail)");
        ER.confere(ER.getEX5(), "joao123@gmail.com"); // ACEITA
        ER.confere(ER.getEX5(), "contato@empresa");    // rejeitada (falta extensão)

        System.out.println("\nEXERCÍCIO 06 (Real com Negativo e Expoente)");
        ER.confere(ER.getEX6(), "123.908777E+30"); // ACEITA
        ER.confere(ER.getEX6(), "-0.17E-5");       // ACEITA (Negativo com expoente)
        ER.confere(ER.getEX6(), "22");             // ACEITA
        ER.confere(ER.getEX6(), "5.5");            // ACEITA
    }
}
