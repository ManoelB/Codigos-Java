package com.mycompany.q11;

import java.util.Scanner;

public class Q11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        float n1, n2, soma;
        
        System.out.println("Informe o primeiro valor: ");
        n1 = teclado.nextFloat();
        System.out.println("Informe o segundo valor: ");
        n2 = teclado.nextFloat();
        
        soma = n1 + n2;
        
        if(soma >= 10){
            soma += 5;
            System.out.println("Resultado: " + soma);
        } else {
            soma-=7;
            System.out.println("Resultado: " + soma);
        }
    }
}
