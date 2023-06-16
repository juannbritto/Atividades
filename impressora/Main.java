package impressora;

public class Main {
    public static void main(String[] args) {
        
        ImpressoraLocal impressoraLocal = new ImpressoraLocal();
    
    impressoraLocal.instalar(new Hp());
    
    impressoraLocal.imprimir();
    }
    
}
