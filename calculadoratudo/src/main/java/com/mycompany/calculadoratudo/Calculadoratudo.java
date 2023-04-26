/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadoratudo;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Calculadoratudo {

    public static float soma(float num1, float num2) {

        float resultado;

        resultado = num1 + num2;

        return resultado;
    }

    public static float sub(float num1, float num2) {
        float resultado;

        resultado = num1 - num2;

        return resultado;
    }

    public static float multi(float num1, float num2) {
        float resultado;

        resultado = num1 * num2;

        return resultado;
    }

    public static float div(float num1, float num2) {
        float resultado;

        resultado = num1 / num2;

        return resultado;
    }

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Scanner t2 = new Scanner(System.in);

        float resultado, valor1, valor2;
        int resposta, continuar = 0;

        while (continuar != 5) {
            System.out.println("\\n Informe qual conta deseja fazer: \\n 1 - Soma\\n 2 - Subtracao\\n 3 - Divisao\\n 4 - Multiplicacao\\n 5 - Pressione 5 para sair\\n");
            resposta = t.nextInt();

            switch (resposta) {

                case 1:
                    System.out.println("Informe o primeiro numero");
                    valor1 = t2.nextFloat();
                    System.out.println("Informe o segundo numero");
                    valor2 = t2.nextFloat();

                    resultado = soma(valor1, valor2);
                    
                    System.out.println(resultado);
                    break;

                case 2:
                    System.out.println("Informe o primeiro numero");
                    valor1 = t2.nextFloat();
                    System.out.println("Informe o segundo numero");
                    valor2 = t2.nextFloat();

                    resultado = sub(valor1, valor2);
                    
                    System.out.println(resultado);
                    break;

                case 3:
                    System.out.println("Informe o primeiro numero");
                    valor1 = t2.nextFloat();
                    System.out.println("Informe o segundo numero");
                    valor2 = t2.nextFloat();

                    resultado = multi(valor1, valor2);
                    
                    System.out.println(resultado);
                    break;

                case 4:
                    System.out.println("Informe o primeiro numero");
                    valor1 = t2.nextFloat();
                    System.out.println("Informe o segundo numero");
                    valor2 = t2.nextFloat();

                    resultado = div(valor1, valor2);
                   
                    System.out.println(resultado);
                    break;

                case 5:
                    continuar = 5;
                    break;

                default:
                    System.out.println("Informe uma operação válida!");

            }
        }
    }
}
