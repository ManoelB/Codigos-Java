package com.mycompany.q10;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        float n1, n2, soma;
        
        System.out.println("Informe o primeiro valor: ");
        n1 = teclado.nextFloat();
        System.out.println("Informe o segundo valor: ");
        n2 = teclado.nextFloat();
        
        soma = n1 + n2;
        
        if(soma > 10){
            System.out.println("Resultado da soma: " + soma);
        } else {
            System.out.println("O valor é menor que 10.");
        }        
    }
}
