package com.mycompany.q6;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double prova1, prova2, notaTrab, media;
        
        System.out.println("Informe a nota da primeira prova: ");
        prova1 = teclado.nextDouble();
        System.out.println("Informe a nota da segunda prova: ");
        prova2 = teclado.nextDouble();
        System.out.println("Informa a nota do trabalho: ");
        notaTrab = teclado.nextDouble();
        
        media = (prova1 + prova2 + notaTrab)/3;
        System.out.println("Média: " + media);
        
        if(media >= 7){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
