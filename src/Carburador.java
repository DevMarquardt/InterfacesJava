public class Carburador extends ComponenteCarro {
    private int quantidadeCombustivel;
    private int nivel;

    public Carburador(int serial, double preco, String cor, int quantidadeCombustivel, int nivel) {
        super(serial, preco, cor);
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Carburador{" +
                "quantidadeCombustivel=" + quantidadeCombustivel +
                ", nivel=" + nivel +
                "} " + super.toString();
    }
}
