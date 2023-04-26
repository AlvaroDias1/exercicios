/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nome;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Nome {

    public static void main(String[] args) {
       Scanner t = new Scanner(System.in);
        
        String nome[] = new String[10];
        int i;
        
        for(i=0; i<nome.length; i++){
            System.out.println("Informe os nomes");
            nome[i] = t.nextLine();
        }
        for(i=0; i<nome.length; i++){
        System.out.println("Os nomes são: "+nome[i]);
        
    }
}
}