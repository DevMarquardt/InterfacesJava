public class Radiador extends Carro{
    private int capacidade;
    private int temperatura;

    public Radiador(String placa, double preco, int capacidade, int temperatura) {
        super(placa, preco);
        this.capacidade = capacidade;
        this.temperatura = temperatura;
    }
}
