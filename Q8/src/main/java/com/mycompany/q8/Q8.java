
package com.mycompany.q8;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double area, raio;
        System.out.println("Informe o raio da circunferência: ");
        raio = teclado.nextDouble();
        
        area = 3.14*(raio*raio);
        System.out.println("A área é " + area);
    }
}
