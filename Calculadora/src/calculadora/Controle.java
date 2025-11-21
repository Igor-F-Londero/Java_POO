/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

/**
 *
 * @author igorf
 */
import java.util.Scanner;

public class Controle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double n2 = sc.nextDouble();

        System.out.println("Escolha uma operação (+, -, *, /):");
        String op = sc.next();

        Calculo calc = null;

        if (op.equals("+")) {
            calc = new Soma();
        } else if (op.equals("-")) {
            calc = new Subtracao();
        } else if (op.equals("*")) {
            calc = new Multiplicacao();
        } else if (op.equals("/")) {
            calc = new Divisao();
        } else {
            System.out.println("Operação inválida!");
            System.exit(0);
        }

        double resultado = calc.calcular(n1, n2);

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
