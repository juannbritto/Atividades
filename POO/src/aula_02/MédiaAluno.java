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
public class MédiaAluno {
    public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
         //Declaração de variavéis
         System.out.println("Nome do aluno");
         String aluno = ler.nextLine();
         
         System.out.println("Nota da prova 1");
         double prova1 = ler.nextDouble();
         
         System.out.println("Nota da prova 2");
         double prova2 = ler.nextDouble();
         
         double média = (prova1 + prova2) / 2;
        
        
         //if
        
         if (média >= 5) {
             System.out.println("O aluno foi aprovado");
               System.out.println("Sua média foi: " + média);
             
         } else if (média < 5)  {
         System.out.println("O aluno foi reprovado");
             System.out.println("Sua média foi: " + média);
             
         }    
    }
    
 
   
}
