package func;


public enum Setor {
    FINANCEIRO("Financeiro"),
    RECURSOS_HUMANOS("RH"),
    VENDAS("Vendas"),
    MARKETING("Marketing");
    
    private final String texto;

    private Setor(String texto) {
        this.texto = texto;
    }

    public static Setor getFINANCEIRO() {
        return FINANCEIRO;
    }

    public static Setor getRECURSOS_HUMANOS() {
        return RECURSOS_HUMANOS;
    }

    public static Setor getVENDAS() {
        return VENDAS;
    }

    public static Setor getMARKETING() {
        return MARKETING;
    }

    public String getTexto() {
        return texto;
    }
    
}
