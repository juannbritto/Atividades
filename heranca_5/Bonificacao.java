package heranca_5;

public enum Bonificacao {
    
    GERENTE(0.2), //salarioBase * (20/100)
    DIRETOR(0.4);//salarioBase * (40/100)
    
    protected double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    
    
    
}
