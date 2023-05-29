package heranca_3;

public class Main {
    public static void main(String[] args) {
        
        // Objetos
        Motoboy motoboy = new Motoboy("123456", "Joao", "123.456.789.00", "12.345.678-90", 1300);
        Engenheiro engenheiro = new Engenheiro("123456", "Paulo", "123.456.789.00", "12.345.678-90", 3000);
        Medico medico = new Medico("123456", "Natalia", "123.456.789.00", "12.345.678-90", 5000);
        
        //Exibindo na tela
        System.out.println(motoboy.toString());
        System.out.println("");
        System.out.println(engenheiro.toString());
        System.out.println("");
        System.out.println(medico.toString());
    }
}
