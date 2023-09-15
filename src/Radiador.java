public class Radiador extends ComponenteCarro {
    private int capacidade;
    private int temperatura;

    public Radiador(int serial, double preco, String cor, int capacidade, int temperatura) {
        super(serial, preco, cor);
        this.capacidade = capacidade;
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Radiador{" +
                "capacidade=" + capacidade +
                ", temperatura=" + temperatura +
                "} " + super.toString();
    }
}
