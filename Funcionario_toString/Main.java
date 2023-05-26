package Funcionario_toString;

import java.time.LocalDate;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Cajazeiras", "20", "Ao lado do pé de cajá", "30000-000", "Salvador", Unidade.BAHIA);
        Funcionario funcionario = new Funcionario(1234, "Diego", "123.456.789-00", "10.123.456-78", "12345667", LocalDate.of(2000, Month.MAY, 17), Genero.MASCULINO, Setor.JURIDICO, 12313123, "(71) 9 98756171 ", "joao@gmail.com", endereco);
        
        
        //System.out.println("Dados do Usuario");
        //System.out.println("Id: " + funcionario.getId());
        //System.out.println("Nome: " + funcionario.getNome());
        //System.out.println("CPF: " + funcionario.getCpf());
        //System.out.println("RG: " + funcionario.getRg());
        //System.out.println("Matricula: " + funcionario.getMatricula());
        //System.out.println("Data de Nascimento: " + funcionario.getDataNascimento());
        //System.out.println("Genero: " + funcionario.getGenero().getTexto());
        //System.out.println("Setor: " + funcionario.getSetor().getTexto());
        //System.out.println("Salario: " + funcionario.getSalario());
        //System.out.println("telefone: " + funcionario.getTelefone());
        //System.out.println("E-mail: " + funcionario.getMatricula());
        //System.out.println("Endereco: " + funcionario.getEndereco());
        //System.out.println("Idade: " + funcionario.getIdade());
        
        System.out.println(funcionario.toString());
    }
}
