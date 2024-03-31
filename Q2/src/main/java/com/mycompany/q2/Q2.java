package com.mycompany.q2;

import java.util.Scanner;
public class Q2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double gasolinaQuant, distancia, litroValor, gasolinaValorFinal;
        System.out.println("Informe a distância: ");
        distancia = teclado.nextDouble();
        System.out.println("Informe o preço do litro da gasolina: ");
        litroValor = teclado.nextDouble();
        
        gasolinaQuant = distancia/12;
        gasolinaValorFinal = gasolinaQuant * litroValor;
        
        System.out.println("A quantidade de gasolina é: " + gasolinaQuant + " litros");
        System.out.println("O valor é: R$" + gasolinaValorFinal);
        
    }
}
