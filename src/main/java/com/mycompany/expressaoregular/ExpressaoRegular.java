/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.expressaoregular;

/**
 *
 * @author izabe
 */
public class ExpressaoRegular {
    
    //Crie uma expressão regular que aceite palavras que contenham aa ou bb como subpalavra
    private String  EX2;
    //Crie uma expressão regular que aceite palavras que contenham quantidade par de a e de b
    private String EX3;
    //Crie uma expressão regular que aceite palavras que começam e terminam com a letra 'a'.
    private String EX4;
    //Crie uma expressão regular que valide um endereço de e-mail.
    private String EX5;
    //Modifique a expressão regular de números reais para também aceitar números negativos com expoente
    private String EX6;
    
    private String ALFABETO;
    private String QUALQUER_COISA;
    private String AA_OU_BB;
    private String AB_OU_BA;
    private String LETRA , LETRAS;
    private String DIGITO, DIGITOS;
    private String USUARIO;
    private String DOMINIO;
    private String EXTENSAO;
    private String SINAL;
    private String EXPONENCIAL;
    private String FRACIONARIA;
   
    
    
    
     public ExpressaoRegular() {
        ALFABETO = "(a|b)";
        QUALQUER_COISA = "(" + ALFABETO + ")*";
        AA_OU_BB = "(aa|bb)";
        AB_OU_BA = "(ab|ba)";
        LETRA = "([A-Za-z])";
        LETRAS = LETRA + "*";
        DIGITO = "([0-9])";
        DIGITOS = DIGITO + "*";
        USUARIO = "(" + LETRA + "|" + DIGITO + ")(" + LETRAS + "|" + DIGITOS + ")*";
        DOMINIO = LETRA + LETRAS;
        EXTENSAO = DOMINIO;
        SINAL = "(\\+|-)?";
        EXPONENCIAL = "(E(\\+|\\-)" + DIGITO + DIGITOS + ")";
        FRACIONARIA = "(\\." + DIGITO + DIGITOS + ")?" + EXPONENCIAL + "?";
        SINAL = "(\\+|\\-)?";
        
        
        EX2 = QUALQUER_COISA + AA_OU_BB + QUALQUER_COISA;
        
        EX3 = "(" + AA_OU_BB + "|(" + AB_OU_BA + AA_OU_BB + "*" + AB_OU_BA + "))*";
          
        EX4 = "(a|a" + QUALQUER_COISA + "a)";
        
        EX5 = USUARIO + "@" + DOMINIO + "\\." + EXTENSAO;
        
        EX6 = SINAL + DIGITO + DIGITOS + FRACIONARIA;
     }
     
     public void confere(String exp, String sentenca) {
        if ((sentenca != null) && !sentenca.isEmpty()) {
            if (sentenca.matches(exp)) {
                System.out.println("W:'" + sentenca + "'........ ACEITA!");
            } else {
                System.err.println("W:'" + sentenca + "'........ rejeitada.");
            }
        } else {
            System.err.println("Sentença vazia.");
        }
    }
     
     
     
     
    public String getEX2() { 
        return EX2; 
    }
    public String getEX3() { 
        return EX3; 
    }
    public String getEX4() { 
        return EX4; 
    }
    public String getEX5() { 
        return EX5; 
    }
    public String getEX6() { 
        return EX6; 
    }
    
    

}
