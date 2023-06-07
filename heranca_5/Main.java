package heranca_5;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        
        Motoboy motoboy = new Motoboy("HIJ-4849", "Joao", "123.456.789-00", "12.345.678-90", Genero.MASCULINO, Setor.OPERACOES, 1000, LocalDate.of(2023, Month.MARCH, 23));
        Gerente gerente = new Gerente(Bonificacao.GERENTE, "Paulo", "123.456.789-00", "12.345.678-90", Genero.MASCULINO, Setor.ADMINISTRATIVO, 1000, LocalDate.of(2000, Month.MARCH, 23));
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Joao Paulo", "123.456.789-00", "12.345.678-90", Genero.MASCULINO, Setor.ADMINISTRATIVO, 1000, LocalDate.of(1990, Month.MARCH, 24));
        
        System.out.println(motoboy.toString());
        System.out.println("");
        System.out.println(gerente.toString());
        System.out.println("");
        System.out.println(diretor.toString());
    }
}
