package func;





public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(15, "Kauã", 5.567, 25, Genero.MASCULINO, Setor.FINANCEIRO);
        
        System.out.println("As informações do Funcionário são: ");
        System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
        System.out.println("");
        System.out.println("ID: " +funcionario.getId());
        System.out.println("Nome: " +funcionario.getNome());
        System.out.println("Salário: " +funcionario.getSalario());
        System.out.println("Setor: " +funcionario.getSetor() .getTexto());
        System.out.println("Gênero: " +funcionario.getGenero() .getTexto());
        System.out.println("Idade: " +funcionario.getIdade ());
        System.out.println("caracter: " + funcionario.getGenero().getCaracter());
    }
}
