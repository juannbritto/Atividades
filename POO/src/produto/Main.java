package produto;


import produto.Calça;


public class Main {
    public static void main(String[] args) {
    //
    Camisa camisa = new Camisa("Nike", "Branca", 32, 125.50);
    Calça calça = new Calça("Forever 21", "Preta", 31, 180.75);
    Sapato sapato = new Sapato("Converse", "Preto", 39, 360.65);
    Produto produto = new Produto(camisa, calça, sapato);
    
    //camisa
    System.out.println("As informações da camisa são:  ");
    System.out.println("Marca: " + produto.getCamisa().getMarca());
    System.out.println("Cor: " + produto.getCamisa().getCor());
    System.out.println("Tamanho: " + produto.getCamisa().getTamanho());
    System.out.println("Preço: " + produto.getCamisa().getPreco());
    System.out.println("");
    
    //calça
    System.out.println("As informações da calça são:  ");
    System.out.println("Marca: " +produto.getCalça().getMarca());
    System.out.println("Cor: " +produto.getCalça().getCor());
    System.out.println("Tamanho: " +produto.getCalça().getTamanho());
    System.out.println("Preço: " +produto.getCalça().getPreco());
    System.out.println("");
    
    //sapato
    System.out.println("As informações da calça são:  ");
    System.out.println("Marca: " +produto.getSapato().getMarca());
    System.out.println("Cor: " +produto.getSapato().getCor());
    System.out.println("Tamanho: " +produto.getSapato().getTamanho());
    System.out.println("Preço: " +produto.getSapato().getPreco());
    }
   
}
