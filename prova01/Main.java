package prova01;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        
        // obejtos
        Juridica juridica = new Juridica("39.345.678-90", "1234560", "Fernanda", "(71) 9 8888-9999", "fernanda@gmail.com", 
                new Endereco("Rua Engenheiro Joao Pessoa", "30", "Predio Azul", "40-567-678", "Salvador", UnidadeFederativa.BAHIA));
        
        Cliente cliente = new Cliente(3456, LocalDate.of(2000, Month.MARCH, 20), Genero.MASCULINO, "Joao", "(71) 9 7777-9999", "joao@gmail.com", 
                new Endereco("Rua do Meier", "20", "Ao lado da mercearia", "90-159-678", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        
        Motoboy motoboy = new Motoboy("12.345.678-90", "131.556.789-00", "123.321.231-15", "13234566", Setor.OPERACOES, 1300, LocalDate.of(1998, Month.MARCH, 15), Genero.MASCULINO, "Felipe", "(71) 9 1111-9999", "felipe@gmail.com", 
                new Endereco("Rua de Osasco ", "40", "Ao lado da lanchonete", "12-971-678", "São Paulo", UnidadeFederativa.SAO_PAULO));
        
        Medico medico = new Medico("123456", "321.476.789-00", "123.321.231-15", "01234567", Setor.SAUDE, 5000, LocalDate.of(1990, Month.APRIL, 29), Genero.FEMININO, "Natalia", "(71) 9 2222-9999", "natalia@gmail.com", 
                new Endereco("Rua do Campo Grande", "1113", "Perto da Praça do Campo Grande", "28-312-678", "Salvador", UnidadeFederativa.BAHIA));
        
        Advogado advogado = new Advogado("312456", "456.098.789-20", "123.321.231-15", "45678", Setor.JURIDCO, 3600, LocalDate.of(1985, Month.NOVEMBER, 27), Genero.MASCULINO, "Roberto", "(71) 9 3333-9999", "roberto@gmail.com", 
                new Endereco("Avenida Paulista", "2223", "Rua Principal", "70-312-678", "São Paulo", UnidadeFederativa.SAO_PAULO));
        
        //impressão dos atributos
        System.out.println(juridica.toString());
        System.out.println(cliente.toString());
        System.out.println(motoboy.toString());
        System.out.println(medico.toString());
        System.out.println(advogado.toString());
        
    }
}
