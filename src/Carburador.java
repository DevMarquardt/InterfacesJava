public class Carburador extends Carro{
    private int quantidadeCombustivel;
    private int nivel;

    public Carburador(String placa, double preco, int quantidadeCombustivel, int nivel) {
        super(placa, preco);
        this.quantidadeCombustivel = quantidadeCombustivel;
        this.nivel = nivel;
    }
}
