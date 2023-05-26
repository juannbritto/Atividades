package veiculo;

public class Main {
    public static void main(String[] args) {
        
        Veiculo carro = new Veiculo("ABC0102", "Azul", 5, 18, 200, 15);
        
        System.out.println("Placa do Carro: " + carro.getPlaca());
        System.out.println("Cor do Carro: " + carro.getCor());
        System.out.println("Número de Passageiros: " + carro.getPassageiros());
        System.out.println("Capaciade do Tanque: " + carro.getTanque());
        System.out.println("Velocidade Máxima: " + carro.getVelocidade());
        System.out.println("Consumo Médio: " + carro.getConsumo());
        
    }
}
