package interface_composição_revisão;

public enum SetorFuncionario {
    
    ENGENHARIA(""),
    SAUDE(""),
    JURIDICO(""),
    RECURSOS_HUMANOS(""),
    MARKETING(""),
    OPERACOES("");
    
    protected String nome;

    private SetorFuncionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
