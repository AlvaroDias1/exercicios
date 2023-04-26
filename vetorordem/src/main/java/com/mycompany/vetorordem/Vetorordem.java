/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.vetorordem;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Vetorordem {

    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        

        int numero[] = new int[10], i;

        for (i = 0; i < numero.length; i++) {
            System.out.println("\nInforme 10 numeros aleatórios\n");

            numero[i] = t.nextInt();

        }
        Arrays.sort(numero);
        for (i = 0; i < numero.length; i++) {
            System.out.println("\n"+numero[i]);
        }
    }
}
