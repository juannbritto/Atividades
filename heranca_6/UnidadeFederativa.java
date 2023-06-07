package heranca_6;

public enum UnidadeFederativa {
    
    BAHIA("Bahia", "BA"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
    
    protected String texto;
    protected String Sigla;

    private UnidadeFederativa(String texto, String Sigla) {
        this.texto = texto;
        this.Sigla = Sigla;
    }

    public String getTexto() {
        return texto;
    }

    public String getSigla() {
        return Sigla;
    }
    
    
}
