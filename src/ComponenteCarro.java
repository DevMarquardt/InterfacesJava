public class ComponenteCarro extends ComponenteCarroDB {
    private int serial;
    private double preco;
    private String cor;
    public static ComponenteCarroDB componenteCarroCRUD = new ComponenteCarroDB();

    public ComponenteCarro(int serial, double preco, String cor) {
        this.serial = serial;
        this.preco = preco;
        this.cor = cor;
    }

    public static String menu() {
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

    public static void descobrirInstancia(int id) {
        if (componenteCarroCRUD.read(id) instanceof Carburador) {
            componenteCarroCRUD.update(id, Main.cadastroCarburador());
        } else if (componenteCarroCRUD.read(id) instanceof Radiador) {
            componenteCarroCRUD.update(id, Main.cadastroRadiador());
        } else {
            componenteCarroCRUD.update(id, Main.cadastrarMotor());
        }
    }

    @Override
    public String toString() {
        return "ComponenteCarro{" +
                "serial=" + serial +
                ", preco=" + preco +
                ", cor='" + cor + '\'' +
                "} ";
    }
}
