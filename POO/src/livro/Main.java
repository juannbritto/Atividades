package livro;

public class Main {
    public static void main(String[] args) {
        
        Livro livro = new Livro("A arte da Guerra", "Sun Tzu", "0123456", 248, 150);
        
        System.out.println("Nome do Livro: " + livro.getTitulo());
        System.out.println("Nome do Autor: " + livro.getAutor());
        System.out.println("ISBN:" + livro.getIsbn());
        System.out.println("Número de Páginas: " + livro.getPaginas());
        System.out.println("Valor do Livro: " + livro.getValor());
        
    }
}
