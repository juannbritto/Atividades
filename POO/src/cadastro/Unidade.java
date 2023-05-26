package cadastro;

public enum Unidade {
    BAHIA("Bahia", "BA"),
    SAOPAULO("São Paulo", "BA"),
    RIODEJANEIRO("Rio de Janeiro", "RJ");
    
    private String texto;
    private String caracter;

    private Unidade(String texto, String caracter) {
        this.texto = texto;
        this.caracter = caracter;
    }

    public static Unidade getBAHIA() {
        return BAHIA;
    }

    public static Unidade getSAOPAULO() {
        return SAOPAULO;
    }

    public static Unidade getRIODEJANEIRO() {
        return RIODEJANEIRO;
    }

    public String getTexto() {
        return texto;
    }

    public String getCaracter() {
        return caracter;
    }
    
    
    
    
}
