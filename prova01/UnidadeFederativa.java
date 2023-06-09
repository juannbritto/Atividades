package prova01;

public enum UnidadeFederativa {
    
    // Constantes
    BAHIA("Bahia"),
    SAO_PAULO("São Pauolo"),
    RIO_DE_JANEIRO("Rio de Janeiro");
    
    //Atributos
    protected String texto;
    
    //construtores
    private UnidadeFederativa(String texto) {
        this.texto = texto;
    }
    //getters e setters
    public String getTexto() {
        return texto;
    }
    
    
}
