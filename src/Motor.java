public class Motor extends ComponenteCarro {
    private int cavalos;
    private int cilindradas;

    public Motor(int serial, double preco, String cor, int cavalos, int cilindradas) {
        super(serial, preco, cor);
        this.cavalos = cavalos;
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "cavalos=" + cavalos +
                ", cilindradas=" + cilindradas +
                "} " + super.toString();
    }
}
