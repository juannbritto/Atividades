package produto;


public class Calça {
    private String marca;
    private String cor;
    private int tamanho;
    private double preco;

    //construtor
    public Calça(String marca, String cor, int tamanho, double preco) {
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
   
}
