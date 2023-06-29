package interface_composição_revisão;

import java.time.LocalDate;

public class Diretor extends Funcionario implements Contratacao{

    private final double PREMIO = 0.2;

    public Diretor(String cpf, String rg, String matricula, SetorFuncionario setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
    }

    @Override
    public double getSalariofinal() {
        double salarioFinal = 0;
        salarioFinal += super.salario * PREMIO;
        salarioFinal += super.salario;
        
        return salarioFinal;
        
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("\n Funcionario Admitido");
        System.out.println(funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Funcionario Demitido");
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public String toString() {
        return "\n Diretor: " + 
                super.toString() +
                "\n PREMIO: " + PREMIO +
                "\n Salario Final: " + Util.formatarBrl(getSalariofinal());
    }

    
}

