package com.mycompany.q9;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        float horaValor, horasMesTrabalhadas, inssDesconto, salarioBruto, salarioLiquido;
        
        System.out.println("Informe o valor da hora da aula: ");
        horaValor = teclado.nextFloat();
        System.out.println("Informe as horas tranalhadas por mês: ");
        horasMesTrabalhadas = teclado.nextFloat();
        System.out.println("Informe o percentual de desconto do INSS: ");
        inssDesconto = teclado.nextFloat();
        
        salarioBruto = horaValor * horasMesTrabalhadas;
        salarioLiquido = salarioBruto - (salarioBruto * inssDesconto/100);
        
        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }
}
