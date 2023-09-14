public class MemoriaRam extends Hardware{
    private int frequencia;
    private int capacidade;

    public MemoriaRam(String nome, String marca, double preco, int frequencia, int capacidade) {
        super(nome, marca, preco);
        this.frequencia = frequencia;
        this.capacidade = capacidade;
    }

    @Override
    public String toString() {
        return "MemoriaRam{" +
                "frequencia=" + frequencia +
                ", capacidade=" + capacidade +
                "} " + super.toString();
    }
}
