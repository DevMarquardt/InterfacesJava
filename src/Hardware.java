public class Hardware extends HardwareDB {
    private String nome;
    private String marca;
    private double preco;

    public Hardware(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }
}
