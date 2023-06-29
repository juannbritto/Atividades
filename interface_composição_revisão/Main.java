package interface_composição_revisão;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        
        PrestacaoServico prestacaoServico = new PrestacaoServico(LocalDate.of(2010, Month.MARCH, 20), LocalDate.of(2022, Month.MARCH, 20), "123456", "1234", "João", "(71) 9 9999-9999", "joao@gmail.com", 
                new Endereco("Rua do Campo Grande", "30", "Perto da Praça", "12345", "Salvador", UnidadeFederativa.BAHIA));
        Fornecedor fornecedor = new Fornecedor(Setor.TECNOLOGIA, 
                new Produto("Tela de Celular", "Tecnologia", 1000), "9808", "2313", "Ricardo", "(71) 9 9999-9999", "ricardo@gmail.com", 
                new Endereco("Osasco", "1213", "Perto da lanchonete", "2432512", "São Paulo", UnidadeFederativa.SAO_PAULO));
        Cliente cliente = new Cliente(12323431, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(1990, Month.APRIL, 15), "Rebeca", "(71) 9 9999-9999", "rebeca@gmail.com", 
                new Endereco("Rua Engenheiro Afonso", "15", "Perto do ponto de onibus", "14846", "Salvador", UnidadeFederativa.BAHIA));
        Engenheiro engenheiro = new Engenheiro("0141", "12301", "4293582", "4109241", SetorFuncionario.ENGENHARIA, 4000, Genero.MASCULINO, EstadoCivil.SOLTEIRO, LocalDate.of(1995, Month.JANUARY, 10), "Roberto", "(71) 9 9999-9999", "roberto@gmail.com", 
                new Endereco("Ipanema", "13", "Casa azul", "94824", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        Medico medico = new Medico("3192831", "09241241", "13902831", "429481", SetorFuncionario.SAUDE, 3000, Genero.FEMININO, EstadoCivil.SOLTEIRO, LocalDate.of(1997, Month.MARCH, 27), "Natalia", "(71) 9 9999-9999", "natalia@gmail.com", 
                new Endereco("Corredor da Vitoria", "2330", "Portão Azul", "142141", "Salvador", UnidadeFederativa.BAHIA));
        Motoboy motoboy = new Motoboy("19241941", "948102941", "192481", "0193821", SetorFuncionario.OPERACOES, 1300, Genero.MASCULINO, EstadoCivil.CASADO, LocalDate.of(1999, Month.AUGUST, 16), "Wesley", "(71) 9 9999-9999", "wesley@gmail.com", 
                new Endereco("Rua 2 de Julho", "68", "Casa branca", "123124", "Salvador", UnidadeFederativa.BAHIA));
        Diretor diretor = new Diretor("4214124", "4293429", "091841", SetorFuncionario.RECURSOS_HUMANOS, 7000, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(1988, Month.MAY, 21), "Alexandra", "(71) 9 9999-9999", "alexandra@gmail.com", 
                new Endereco("Copa Cabana", "1356", "apt 502", "1923810948", "Salvador", UnidadeFederativa.RIO_DE_JANEIRO));
        
        System.out.println(prestacaoServico.toString());
        System.out.println(fornecedor.toString());
        System.out.println(cliente.toString());   
        diretor.admitir(engenheiro);
        diretor.admitir(medico);
        diretor.admitir(motoboy);
        System.out.println(diretor.toString());
        
    }
}
