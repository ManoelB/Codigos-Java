package com.mycompany.q3;

import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int idade;
        
        System.out.println("Qual a sua idade?");
        idade = teclado.nextInt();
        
        if(idade > 18){
            System.out.println("Você pode tirar carteira de motorista.");
        } else {
            System.out.println("Oops! Você ainda não pussui idade suficiente para tirar a carteira de motorista.");
        }
    }
}
