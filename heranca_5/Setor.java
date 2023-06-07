package heranca_5;

public enum Setor {
    
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico"),
    FINANCEIRO("Financeiro"),
    RECURSOS_HUMANOS("Recursos"),
    ADMINISTRATIVO("Administrativo"),
    OPERACOES("Operações");
    
    protected String texto;

    private Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

   
    
    
}
