package heranca_4;

public enum UnidadeFederativa {
    
    BAHIA("Bahia", "BA"),
    SAOPAULO("Sao Paulo", "SP"),
    RIODEJANEIRO("Rio de Janeiro", "RJ");
    
    private String texto;
    private String caracater;

    private UnidadeFederativa(String texto, String caracater) {
        this.texto = texto;
        this.caracater = caracater;
    }

    public static UnidadeFederativa getBAHIA() {
        return BAHIA;
    }

    public static UnidadeFederativa getSAOPAULO() {
        return SAOPAULO;
    }

    public static UnidadeFederativa getRIODEJANEIRO() {
        return RIODEJANEIRO;
    }

    public String getTexto() {
        return texto;
    }

    public String getCaracater() {
        return caracater;
    }
    
    
    
}
