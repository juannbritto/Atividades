package cadastro;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Campo Grande", "123", "Perto da Praça", "10000-000", "Salvador", Unidade.BAHIA);
        Pessoa pessoa = new Pessoa(01, "Joao", LocalDate.of(2000, Month.SEPTEMBER, 17), 99999-9999, "joaolisboa@gmail.com", Genero.MASCULINO, endereco);
        
        System.out.println("Dados do Usuario:");
        System.out.println("id" + pessoa.getId());
        System.out.println("Nome:" + pessoa.getName());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Telefone:" + pessoa.getTelefone());
        System.out.println("E-mail:" + pessoa.getEmail());
        System.out.println("Genero: " + pessoa.getGenero().getTexto());
        System.out.println("Rua: "+ pessoa.getEndereco().getLogradouro());
        System.out.println("Número: " + pessoa.getEndereco().getNumero());
        System.out.println("Complemento: " + pessoa.getEndereco().getComplemento());
        System.out.println("CEP: " + pessoa.getEndereco().getCep());
        System.out.println("Cidade:" + pessoa.getEndereco().getCidade());
        System.out.println("UF: " + pessoa.getEndereco().getUnidade());
        System.out.println("Idade: " + pessoa.getIdade());
        
        
    }
}
