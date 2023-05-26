package aula_04;

import java.util.Scanner;

public class Livro1 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        Livro livro = new Livro();
        System.out.println("Digite o Título do Livro: ");
        livro.setTitulo(teclado.nextLine());
        System.out.println("Digite o Autor do Livro: ");
        livro.setAutor(teclado.nextLine());
        System.out.println("Digite a Quantidade de Páginas: ");
        livro.setPaginas(teclado.nextDouble());
        System.out.println("Digite o Preço do Livro: ");
        livro.setPreco(teclado.nextDouble());
        
        Livro livro2 = new Livro();
        System.out.println("Digite o Título do Livro2: ");
        livro2.setTitulo(teclado.next());
        System.out.println("Digite o Autor do Livro2: ");
        livro2.setAutor(teclado.next());
        System.out.println("Digite a Quantidade de Páginas do livro2: ");
        livro2.setPaginas(teclado.nextDouble());
        System.out.println("Digite o Preço do Livro2: ");
        livro2.setPreco(teclado.nextDouble());      
      
        System.out.println("Nome do livro: " + livro.getTitulo());
        System.out.println("Nome do Autor: " + livro.getAutor());
        System.out.println("Quantidade de páginas: " + livro.getPaginas());
        System.out.println("Preço do Livro: " + livro.getPreco());
        System.out.println("");
        System.out.println("Nome do livro: " + livro2.getTitulo());
        System.out.println("Nome do Autor: " + livro2.getAutor());
        System.out.println("Quantidade de páginas: " + livro2.getPaginas());
        System.out.println("Preço do Livro: " + livro2.getPreco());
        
    }
}
