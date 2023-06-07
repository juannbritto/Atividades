package heranca_6;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        
        PrestacaoServico prestacaoServico = new PrestacaoServico(LocalDate.of(2000, Month.MARCH, 23), LocalDate.of(2023, Month.MARCH, 23), "123.456.789-00", "123456", 12, "Joao", "(71) 9 9999-9999", "joao@gmail.com", 
                new Endereco("Rua Campo Grande", "30", "Perto da Praça", "12.345-678", "Salvador", UnidadeFederativa.BAHIA));
        
        Fornecedor fornecedor = new Fornecedor("Roupa", "123.456.789-00", "123456", 13, "Paulo", "(71) 9 9999-9999", "paulo@gmail.com", 
                new Endereco("Pirajá", "30", "portão preto", "12.345-678", "Salvador", UnidadeFederativa.BAHIA));
        
        Cliente cliente = new Cliente(123456, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 23), 45, "Natalia", "(71) 9 9999-9999", "natalia@gmail.com", 
                new Endereco("Rua Corredor da Vitoria", "31", "Perto do Campo Grande", "12.345-678", "Salvador", UnidadeFederativa.BAHIA));
        
        Engenheiro engenheiro = new Engenheiro("123.456.789-00", "12.345.678-90", "123456", Setor.ENGENHARIA, 3000, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(2000, Month.MARCH, 30), 60, "Roberta", "(71 9 9999-9999)", "roberta@gmail.com", 
                new Endereco("Avenida Brasil", "50", "Perto de Carminha", "12.345-678", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        
        Medico medico = new Medico("123456", "123.456.789-00", "12.345.678-90", "123456", Setor.SAUDE, 4000, Genero.MASCULINO, EstadoCivil.SOLTEIRO, LocalDate.of(2000, Month.MARCH, 15), 70, "Fred Nicacio", "(71 9 9999-9999)", "fred@gmail.com", 
                new Endereco("Liberdade", "10", "Perto do China", "12.345-678", "São Paulo", UnidadeFederativa.SAO_PAULO));
        
        Advogado advogado = new Advogado("123456","123.456.789-00", "12.345.678-90", "123456", Setor.JURIDICO, 5000, Genero.MASCULINO, EstadoCivil.VIUVO, LocalDate.of(1990, Month.MARCH, 27), 80, "Rogerio", "(71 9 9999-9999)", "rogerio@gmail.com", 
                new Endereco("Meier", "80", "Perto do Ponto", "12.345-678", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        
        System.out.println(prestacaoServico.toString());
        System.out.println("");
        System.out.println(fornecedor.toString());
        System.out.println("");
        System.out.println(cliente.toString());
        System.out.println("");
        System.out.println(engenheiro.toString());
        System.out.println("");
        System.out.println(medico.toString());
        System.out.println("");
        System.out.println(advogado.toString());
    }
    
    
}
