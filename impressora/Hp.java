package impressora;

public class Hp implements Impressora{
    @Override
    public void imprimir() {
        System.out.println("-- Impressora HP --");
        System.out.println("Preparando Cartuchos...");
        System.out.println("Imprimindo...");
    }
}
