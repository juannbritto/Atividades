package pet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        Pet cachorro = new Pet();
        System.out.println("Digite o Nome do seu pet: " );
        cachorro.setNome(teclado.nextLine());
        System.out.println("Digite a idade do seu pet: ");
        cachorro.setIdade(teclado.nextDouble());
        System.out.println("Digite o porte do seu cachorro: ");
        cachorro.setPorte(teclado.next());
        System.out.println("Digite o que seu cachorro come: ");
        cachorro.setAlimentacao(teclado.next());
        
        Pet cachorro2 = new Pet();
        System.out.println("Digite o Nome do seu pet: " );
        cachorro2.setNome(teclado.next());
        System.out.println("Digite a idade do seu pet: ");
        cachorro2.setIdade(teclado.nextDouble());
        System.out.println("Digite o porte do seu cachorro: ");
        cachorro2.setPorte(teclado.next());
        System.out.println("Digite o que seu cachorro come: ");
        cachorro2.setAlimentacao(teclado.next());
            
    }
            
}
