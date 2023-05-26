package aula_02;

import java.util.Scanner;

public class numero {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        //declaração de variaveis
        System.out.println("Digite o primeiro número: ");
        int a = ler.nextInt ();
        System.out.println("Digite o segundo número: ");
        int b = ler.nextInt ();
        int maior;
        
        //operadores aritméticos
        if (a > b) {
            maior = a;
        }else {
            maior = b;
        }
        if (a < b) {
            System.out.println("O menor número é: " + maior);
        }
        
        //exibindo resultados
        System.out.println("O maior número é: " + maior);
    }
}
