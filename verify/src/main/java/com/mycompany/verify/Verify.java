/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.verify;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Verify {

    public static void main(String[] args) {
        int numero[] = new int[10], i;
        int verifica;
        boolean existe = false;

        Scanner t = new Scanner(System.in);

        for (i = 0; i < numero.length; i++) {
            System.out.println("\nInforme os 10 numeros\n");

            numero[i] = t.nextInt();

        }
        System.out.println("Informe um numero");

        verifica = t.nextInt();

        for (i = 0; i < numero.length; i++) {
            if (numero[i] == verifica) {
                existe = true;
                break;
            }

        }
        if (existe) {
            System.out.println("o numero existe");
        } else {
            System.out.println("O numero nao existe");
        }
    }
}
