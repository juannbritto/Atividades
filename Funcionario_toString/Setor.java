package Funcionario_toString;

public enum Setor {
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Juridico");
    
    private String texto;

    private Setor(String texto) {
        this.texto = texto;
    }

    public static Setor getENGENHARIA() {
        return ENGENHARIA;
    }

    public static Setor getSAUDE() {
        return SAUDE;
    }

    public static Setor getJURIDICO() {
        return JURIDICO;
    }

    public String getTexto() {
        return texto;
    }
    
    
    
}
