package heranca_6;

public enum Setor {
    
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico");
    
    protected String texto;

    private Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
}
