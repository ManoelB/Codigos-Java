package com.mycompany.q7;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float peso, altura, imc;
        System.out.println("Informe o seu peso: ");
        peso = teclado.nextFloat();
        System.out.println("Informe a sua altura");
        altura = teclado.nextFloat();
        
        imc = peso / (altura * altura);
        System.out.println("Seu imc é: " +imc);
        if (imc > 30){
            System.out.println("Você está obeso.");
        } else {
            System.out.println("Você não está obeso.");
        }
        
    }
}
