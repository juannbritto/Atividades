package interface_composição_revisão;

public enum Setor {
    
    TECNOLOGIA("Tecnologia"),
    MATERIAL_CONSTRUCAO("Material de Construção"),
    MATERIA_PRIMA("Materia Prima"),
    ALIMENTICIO("Alimenticío");
    
    protected String texto;

    private Setor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
    
    
}
