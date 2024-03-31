
package com.mycompany.q4;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double temperatura;
        
        System.out.println("Informe a temperatura corporal: ");
        temperatura = teclado.nextDouble();
        
        if(temperatura > 37){
            System.out.println("O paciente está com febre.");
        } else {
            System.out.println("O paciente não está com febre.");
        }
    }
}
