public class PlacaMae extends Hardware{
    private int consumo;
    private int slotsRam;

    public PlacaMae(String nome, String marca, double preco, int consumo, int slotsRam) {
        super(nome, marca, preco);
        this.consumo = consumo;
        this.slotsRam = slotsRam;
    }
}
