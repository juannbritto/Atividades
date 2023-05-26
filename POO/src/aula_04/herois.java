package aula_04;

import com.sun.org.apache.bcel.internal.generic.DCMPG;
import java.util.Scanner;

public class herois {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Personagem DC = new Personagem();
        DC.setNome(teclado.nextLine());
        DC.setHabilidade(teclado.nextLine());
                
    Personagem Marvel = new Personagem();
    Marvel.setHabilidade(teclado.nextLine());
    Marvel.setNome(teclado.nextLine());
    
        
        System.out.println("Personagem da DC");
        System.out.println("Habilidade: " + DC.getHabilidade());
        System.out.println("Nome: " + DC.getNome());
        System.out.println("");
        System.out.println("Personagem da Marvel");
        System.out.println("Habilidade: " + Marvel.getHabilidade());
        System.out.println("Nome: " + Marvel.getNome());
            
    }
            
    
}
