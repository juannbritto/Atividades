package heranca_6;

public enum EstadoCivil {
    
    SOLTEIRO("Solteiro"),
    CASADO("Casado"),
    SEPARADO("Separado"),
    DIVORCIADO("Divorciado"),
    VIUVO("Viuvo");
    
    protected String texto;

    private EstadoCivil(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
}
