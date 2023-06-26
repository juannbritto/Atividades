package interfaces_composicao;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        
        Motoboy motoboy = new Motoboy("123456", "Joao", LocalDate.of(2000, Month.MARCH, 23), Genero.MASCULINO, Setor.OPERACOES, 1300);
        Diretor diretor = new Diretor("Carlos", LocalDate.of(1983, Month.AUGUST, 19), Genero.MASCULINO, Setor.OPERACOES, 5000);
        
        System.out.println(motoboy.toString());
        diretor.demitir(motoboy);
        System.out.println(diretor.toString());
    }
}
