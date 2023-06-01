package heranca_5;

public enum Genero {
    
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');
    
    protected String texto;
    protected char caracter;

    private Genero(String texto, char caracter) {
        this.texto = texto;
        this.caracter = caracter;
    }

    public static Genero getMASCULINO() {
        return MASCULINO;
    }

    public static Genero getFEMININO() {
        return FEMININO;
    }

    public String getTexto() {
        return texto;
    }

    public char getCaracter() {
        return caracter;
    }
    
    
    
    
}
