
package statics;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("Laura Marano", LocalDate.of(1999, Month.MARCH, 21), 6000.25);
        
        System.out.println(pessoa.toString());
        
    }
    
}