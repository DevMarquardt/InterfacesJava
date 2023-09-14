public class Motor extends ComponenteCarro {
    private int cavalos;
    private int cilindradas;

    public Motor(String placa, double preco, int cavalos, int cilindradas) {
        super(placa, preco);
        this.cavalos = cavalos;
        this.cilindradas = cilindradas;
    }
}
