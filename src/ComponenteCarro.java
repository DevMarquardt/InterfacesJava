public class ComponenteCarro extends ComponenteCarroDB {
    private String placa;
    private double preco;

    public ComponenteCarro(String placa, double preco) {
        this.placa = placa;
        this.preco = preco;
    }

    public static String menu(){
        return """
                [1] - Cadastrar Carburador
                [2] - Cadastrar Radiador
                [3] - Cadastrar Motor""";
    }
}
