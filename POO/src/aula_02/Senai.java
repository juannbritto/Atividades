/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_02;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Senai {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite o seu nome");
        String nome = ler.nextLine();
        System.out.println("Digite o seu sobrenome");
        String sobrenome = ler.nextLine();
        //Exibindo a quantidade de caracteres 
        System.out.println("Tamanho do nome:" + nome.length());
        System.out.println("Tamanho do sobrenome:" + sobrenome.length());
        
        //Concatenação nome + sobrenome
        String nomeCompleto = nome.concat(" ").concat(sobrenome);
        
        //Exibindo nome completo usando metodo Strings - Maiúsculas
   System.out.println("Concatenação Maiúscula: " + nomeCompleto.toUpperCase());
   
       //Exibindo nome completo usando metodos Strings - Minúsculas
    System.out.println("Concatenação Minúscula:" + nomeCompleto.toLowerCase());
      
    }
}
