import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ComponenteCarroDB componenteCarroCRUD = new ComponenteCarroDB();

    public static void main(String[] args) {
        menuInicial();
    }

    private static void menuInicial() {
        int opcao = 0;
        do {
            System.out.println("""
                [1] - Opções componentes do carro
                [2] - Opções componentes de hardware
                [3] - Sair""");
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    menuComponenteCarro();
                    break;
                case 2:
                    menuHardware();
                    break;
                case 3:
                    System.out.println("Saindo");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao != 3);
    }

    private static void menuHardware(){
        int opcao =0;
        do {
            System.out.println(Hardware.menu());
            opcao = sc.nextInt();
            switch (opcao){
                case 1:
                    cadastroProcessador();
                    break;
                case 2:
                    cadastroPlacaMae();
                    break;
                case 3:
                    cadastrarMemoriaRAM();
                    break;
                case 4:
                    removerHarware();
                    break;
                case 5:
                    atualizarHardware();
                    break;
                case 6:
                    informacoesHardware();
                    break;
                case 7:
                    informacoesTodosHardwares();
                    break;
                case 8:
                    menuInicial();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while (opcao!=8);
    }

    private static void menuComponenteCarro(){

    }

    public static Hardware cadastroProcessador(){
        System.out.println("Qual o nome do processador? ");
        String nome = sc.next();
        System.out.println("Qual a marca? ");
        String marca = sc.next();
        System.out.println("Qual o preço? ");
        double preco = sc.nextDouble();
        System.out.println("Qual a frequencia gHz do processador?");
        int gHz = sc.nextInt();
        System.out.println("Qual a quantidade de núcleos? ");
        int quantidadeNucleos = sc.nextInt();
        Hardware processador = new Processador(nome, marca, preco, gHz, quantidadeNucleos);
        Hardware.hardwareCRUD.create(processador);
        return processador;
    }
    public static Hardware cadastroPlacaMae(){
        System.out.println("Qual o nome da placa mãe? ");
        String nome = sc.next();
        System.out.println("Qual a marca? ");
        String marca = sc.next();
        System.out.println("Qual o preço? ");
        double preco = sc.nextDouble();
        System.out.println("Qual o consumo? ");
        int consumo = sc.nextInt();
        System.out.println("Quantos slots de memória? ");
        int slots = sc.nextInt();
        Hardware placaMae = new PlacaMae(nome, marca, preco, consumo, slots);
        Hardware.hardwareCRUD.create(placaMae);
        return placaMae;
    }

    public static Hardware cadastrarMemoriaRAM(){
        System.out.println("Qual o nome da placa memória? ");
        String nome = sc.next();
        System.out.println("Qual a marca? ");
        String marca = sc.next();
        System.out.println("Qual o preço? ");
        double preco = sc.nextDouble();
        System.out.println("Qual a frequencia da memoria? ");
        int memoria = sc.nextInt();
        System.out.println("Qual a capacidade de gb da memória? ");
        int capacidade = sc.nextInt();
        Hardware memoriaRAM = new MemoriaRam(nome, marca, preco, memoria, capacidade);
        Hardware.hardwareCRUD.create(memoriaRAM);
        return memoriaRAM;
    }

    private static void removerHarware(){
        System.out.println("Qual o ID do hardware? ");
        Integer id = sc.nextInt();
        Hardware.hardwareCRUD.delete(id);
    }

    private static void atualizarHardware(){
        System.out.println("Qual o id do Hardware que você deseja atualizar? ");
        Integer id = sc.nextInt();
        Hardware.descobrirInstancia(id);
    }

    private static void informacoesHardware(){
        System.out.println("Qual o id do hardware que você quer puxar as informações? ");
        Integer id = sc.nextInt();
        System.out.println(Hardware.hardwareCRUD.read(id).toString());
    }

    private static void informacoesTodosHardwares(){
//        System.out.println(Hardware.hardwareCRUD.readAll().toString());
    }

}

