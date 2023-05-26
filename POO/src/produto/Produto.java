package produto;


import produto.Calça;

public class Produto {
    private Camisa camisa;
    private Calça calça;
    private Sapato sapato;

    public Produto(Camisa camisa, Calça calça, Sapato sapato) {
        this.camisa = camisa;
        this.calça = calça;
        this.sapato = sapato;
    }

    public Camisa getCamisa() {
        return camisa;
    }

    public void setCamisa(Camisa camisa) {
        this.camisa = camisa;
    }

    public Calça getCalça() {
        return calça;
    }

    public void setCalça(Calça calça) {
        this.calça = calça;
    }

    public Sapato getSapato() {
        return sapato;
    }

    public void setSapato(Sapato sapato) {
        this.sapato = sapato;
    }
    
    
}
