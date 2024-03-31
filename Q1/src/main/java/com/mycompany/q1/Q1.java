import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        double horasMes, salario;
        
        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        horasMes = teclado.nextDouble();
        salario = horasMes * 20;
        System.out.println("O salário do operário é: R$" + salario);
    }
}
