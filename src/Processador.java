public class Processador extends Hardware{
    private int gHz;
    private int quantidadeNucleos;

    public Processador(String nome, String marca, double preco, int gHz, int quantidadeNucleos) {
        super(nome, marca, preco);
        this.gHz = gHz;
        this.quantidadeNucleos = quantidadeNucleos;
    }
}
