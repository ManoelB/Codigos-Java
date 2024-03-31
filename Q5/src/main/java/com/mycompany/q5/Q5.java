
package com.mycompany.q5;

import java.util.Scanner;
public class Q5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1, n2;
        System.out.println("Informe o primero número: ");
        n1 = teclado.nextInt();
        System.out.println("Informe o segundo número: ");
        n2 = teclado.nextInt();
        
        if(n1 > n2){
            System.out.println("O número " + n1 + " é maior que " + n2);
        } else {
            System.out.println("O número " + n2 + " é maior que " + n1);
        }
    }
}
