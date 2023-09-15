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
                [3] - Cadastrar Motor
                [4] - Remover um Hardware
                [5] - Atualizar um Hardware
                [6] - Ver informações de um Hardware
                [7] - Ver informações de todos os Hardwares
                [8] - Sair para o menu anterior""";
    }
}
