package heranca_4;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        
        Endereco endereco = new Endereco("Rua Corredor da Vitória","2330", "Praça do Campo Grande", "12.345-678", "Salvaor", "BA");
        Fisica fisica = new Fisica(Genero.FEMININO, "123.456.789.00", "12.345.678-90", LocalDate.of(2000, Month.MAY, 29), 1300, 123456, "Natalia", "71 99999-9999", endereco);
        Juridica juridica = new Juridica("123.456.789-00", "123456", LocalDate.of(2023, Month.MAY, 29), LocalDate.of(2024, Month.JANUARY, 29), 3000, 123456, "Joao", "(71) 99999-9999", endereco);
        
        System.out.println(fisica.toString());
        System.out.println(fisica.getEndereco());
        System.out.println("");
        System.out.println(juridica.toString());
        System.out.println(juridica.getEndereco());
    }
}
