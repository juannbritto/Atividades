package interface03;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        
        Motoboy motoboy = new Motoboy("123456", "João", "123.456.789-00", "12.345.678-90", Genero.MASCULINO, 1300, LocalDate.of(2001, Month.MARCH, 21), LocalDate.of(2021, Month.MARCH, 21));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Natalia", "123.456.789-00", "12.345.678-90", Genero.FEMININO, 2200, LocalDate.of(1995, Month.AUGUST, 18), LocalDate.of(2010, Month.FEBRUARY, 23));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Roberto", "123.456.789-00", "12.345.678-90", Genero.MASCULINO, 4000, LocalDate.of(1985, Month.APRIL, 29), LocalDate.of(1998, Month.JANUARY, 13));
        
        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());
        System.out.println(diretor.toString());
    }
}
