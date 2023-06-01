package heranca_5;

public enum Setor {
    
    ENGENHARIA("Engenharia"),
    SAUDE("Saude"),
    JURIDICO("Juridico"),
    FINANCEIRO("Financeiro"),
    RECURSOS("Recursos"),
    ADMINISTRATIVO("Administrativo"),
    OPERACOES("Operações");
    
    protected String texto;

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

    public static Setor getFINANCEIRO() {
        return FINANCEIRO;
    }

    public static Setor getRECURSOS() {
        return RECURSOS;
    }

    public static Setor getADMINISTRATIVO() {
        return ADMINISTRATIVO;
    }

    public static Setor getOPERACOES() {
        return OPERACOES;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
