package heranca_5;

public enum Bonificacao {
    
    GERENTE(0.2),
    DIRETOR(0.4);
    
    protected double valor;

    private Bonificacao(double valor) {
        this.valor = valor;
    }

    public static Bonificacao getGERENTE() {
        return GERENTE;
    }

    public static Bonificacao getDIRETOR() {
        return DIRETOR;
    }

    public double getValor() {
        return valor;
    }
    
    
}
