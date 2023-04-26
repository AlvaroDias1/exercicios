/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.maisvelho;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Maisvelho {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        Scanner t2 = new Scanner(System.in);

        int idade1, idade2;
        String nome1, nome2;

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

        if (idade1 > idade2) {
            System.out.println(nome1+" é mais velho/a");
        }
        if (idade2 > idade1) {
            System.out.println(nome2+" é mais velho/a");
        }
        if (idade1 == idade2) {
            System.out.println("Ambos tem a mesma idade");
        }
        if (idade1 < 0) {
            System.out.println("Informe uma idade válida");
        }
        if (idade2 < 0) {
            System.out.println("Informe uma idade válida");
        }
    }
}
