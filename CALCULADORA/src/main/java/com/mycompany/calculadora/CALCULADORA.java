/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class CALCULADORA {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Scanner t2 = new Scanner(System.in);

        float resultado = 0, valor1 = 0, valor2 = 0;
        int resposta = 0, continuar = 0;

        while (continuar != 5) {

            System.out.println("\\n Informe qual conta deseja fazer: \\n 1 - Soma\\n 2 - Subtracao\\n 3 - Divisao\\n 4 - Multiplicacao\\n 5 - Pressione 5 para sair\\n");
            resposta = t.nextInt();

            switch (resposta) {

                case 1 -> {
                    System.out.println("Informe o primeiro numero");
                    valor1 = t2.nextFloat();
                    System.out.println("Informe o segundo numero");
                    valor2 = t2.nextFloat();

                    resultado = valor1 + valor2;

                    System.out.println(resultado);
                }

                case 2 -> {
                    System.out.println("Informe o primeiro numero");
                    valor1 = t2.nextFloat();
                    System.out.println("Informe o segundo numero");
                    valor2 = t2.nextFloat();

                    resultado = valor1 - valor2;
                    System.out.println(resultado);
                }

                case 3 -> {
                    System.out.println("Informe o primeiro numero");
                    valor1 = t2.nextFloat();
                    System.out.println("Informe o segundo numero");
                    valor2 = t2.nextFloat();

                    resultado = valor1 / valor2;
                    System.out.println(resultado);
                }

                case 4 -> {
                    System.out.println("Informe o primeiro numero");
                    valor1 = t2.nextFloat();
                    System.out.println("Informe o segundo numero");
                    valor2 = t2.nextFloat();

                    resultado = valor1 * valor2;
                    System.out.println(resultado);
                }

                case 5 ->
                    continuar = 5;

            }
        }
    }
}
