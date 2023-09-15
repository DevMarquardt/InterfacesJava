public class Hardware extends HardwareDB {
    private String nome;
    private String marca;
    private double preco;
    public static HardwareDB hardwareCRUD = new HardwareDB();

    public Hardware(String nome, String marca, double preco) {
        this.nome = nome;
        this.marca = marca;
        this.preco = preco;
    }

    public static String menu() {
        return """
                [1] - Cadastrar Processador
                [2] - Cadastrar Placa mãe
                [3] - Cadastrar Memória RAM
                [4] - Remover um Hardware
                [5] - Atualizar um Hardware
                [6] - Ver informações de um Hardware
                [7] - Ver informações de todos os Hardwares
                [8] - Sair para o menu anterior""";
    }

    public static void descobrirInstancia(int id) {
        if (hardwareCRUD.read(id) instanceof Processador) {
            hardwareCRUD.update(id, Main.cadastroProcessador());
        } else if (hardwareCRUD.read(id) instanceof MemoriaRam) {
            hardwareCRUD.update(id, Main.cadastrarMemoriaRAM());
        } else {
            hardwareCRUD.update(id, Main.cadastroPlacaMae());
        }
    }

    @Override
    public String toString() {
        return "Hardware{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", preco=" + preco +
                "} ";
    }
}
