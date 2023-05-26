package aula_02;

import java.util.Scanner;

public class exercicio2 {
    
    public static void main(String[] args) {
        //declaração de variaveis
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        
        System.out.println("Digite seu peso: ");
        double peso = ler.nextDouble();
        
        //declaração de constantes
        final String CPF = "123.456.789-00";
        
        //exibindo resultados
        System.out.println("O nome do usuário é: " + nome);
        System.out.println("A idade do usuário é: " + idade);
        System.out.println("O CPF do usuário é: " + CPF);
        System.out.println("O peso do usuário é: " + peso );
    }
}
