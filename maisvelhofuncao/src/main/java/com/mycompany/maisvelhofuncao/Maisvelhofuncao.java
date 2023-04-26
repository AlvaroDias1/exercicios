/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.maisvelhofuncao;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Maisvelhofuncao {

    
    public static int calculo(int idade1, int idade2){
        int resultado;
        if (idade1 > idade2){
            System.out.println("A primeira pessoa é mais velha");
        }
        if (idade2 > idade1){
            System.out.println("A segunda pessoa é mais velha");
        }
        if (idade1 == idade2){
            System.out.println("Ambos tem a mesma idade");
        }
        return 0;
       
    }
  
    public static void main(String[] args) {
       
        int idade1, idade2, resultado;
        String nome1, nome2;
        
        
        Scanner t = new Scanner(System.in);
        Scanner t2 = new Scanner(System.in);
        System.out.println("\nPrimeira pessoa\n");

        System.out.println("Informe seu nome: ");
        nome1 = t.nextLine();
        System.out.println("Informe sua idade: ");
        idade1 = t2.nextInt();

        System.out.println("\nSegunda pessoa\n");

        System.out.println("Informe seu nome: ");
        nome2 = t.nextLine();
        System.out.println("Informe sua idade: ");
        idade2 = t2.nextInt();
        
        resultado = calculo(idade1, idade2);
        System.out.println(resultado);
    }
}
