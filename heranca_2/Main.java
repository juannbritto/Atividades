package heranca_2;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    
    public static void main(String[] args) {
        
        Fisica fisica = new Fisica("123.456.789-00", "12.345.678.90", LocalDate.of(2000, Month.MAY, 29), "Joao", "71 99999-9999");
        
        Juridico juridico = new Juridico("12345678", "09876543", "Alice", "71 99999-9999");
    
        System.out.println(fisica.toString());
        System.out.println(juridico.toString());
        
    }
           
}
