import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

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
            switch (opcao) {
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
        } while (opcao != 3);
    }

    private static void menuHardware() {
        int opcao = 0;
        do {
            System.out.println(Hardware.menu());
            opcao = sc.nextInt();
            switch (opcao) {
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
                    remover();
                    break;
                case 5:
                    atualizar();
                    break;
                case 6:
                    informacoes();
                    break;
                case 7:
                    informacoesTodos();
                    break;
                case 8:
                    menuInicial();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 8);
    }

    private static void menuComponenteCarro() {
        int opcao = 0;
        do {
            System.out.println(ComponenteCarro.menu());
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    cadastroCarburador();
                    break;
                case 2:
                    cadastroRadiador();
                    break;
                case 3:
                    cadastrarMotor();
                    break;
                case 4:
                    remover();
                    break;
                case 5:
                    atualizar();
                    break;
                case 6:
                    informacoes();
                    break;
                case 7:
                    informacoesTodos();
                    break;
                case 8:
                    menuInicial();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 8);
    }

    public static ComponenteCarro cadastrarMotor() {
        System.out.println("Qual a serial do motor? ");
        int serial = sc.nextInt();
        System.out.println("Qual o preço do motor? ");
        double preco = sc.nextDouble();
        System.out.println("Qual a cor do motor? ");
        String cor = sc.next();
        System.out.println("Qual a quantidade de cavalos? ");
        int cavalos = sc.nextInt();
        System.out.println("Quantas cilindradas? ");
        int cilindradas = sc.nextInt();
        ComponenteCarro motor = new Motor(serial, preco, cor, cavalos, cilindradas);
        ComponenteCarro.componenteCarroCRUD.create(motor);
        return motor;
    }

    public static ComponenteCarro cadastroRadiador() {
        System.out.println("Qual a serial do radiador? ");
        int serial = sc.nextInt();
        System.out.println("Qual o preço do radiador? ");
        double preco = sc.nextDouble();
        System.out.println("Qual a cor do radiador? ");
        String cor = sc.next();
        System.out.println("Qual a capacidade de agua? ");
        int capacidade = sc.nextInt();
        System.out.println("Qual a temperatura maxima? ");
        int temperatura = sc.nextInt();
        ComponenteCarro radiador = new Radiador(serial, preco, cor, capacidade, temperatura);
        ComponenteCarro.componenteCarroCRUD.create(radiador);
        return radiador;
    }

    public static ComponenteCarro cadastroCarburador() {
        System.out.println("Qual a serial do carburador? ");
        int serial = sc.nextInt();
        System.out.println("Qual o preço do carburador? ");
        double preco = sc.nextDouble();
        System.out.println("Qual a cor do carburador? ");
        String cor = sc.next();
        System.out.println("Qual a quantidade de combustivel? ");
        int quantidade = sc.nextInt();
        System.out.println("Qual o nivel da boia? ");
        int nivel = sc.nextInt();
        ComponenteCarro carburador = new Carburador(serial, preco, cor, quantidade, nivel);
        ComponenteCarro.componenteCarroCRUD.create(carburador);
        return carburador;
    }

    public static Hardware cadastroProcessador() {
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

    public static Hardware cadastroPlacaMae() {
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

    public static Hardware cadastrarMemoriaRAM() {
        System.out.println("Qual o nome da memória RAM? ");
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

    private static void remover() {
        int opcao = 0;
        Integer id;
        do {
            System.out.println("""
                    Qual o tipo de produto que você deseja remover? 
                    [1] - Hardware
                    [2] - Componente de Carro
                    [3] - Voltar""");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Qual o ID do hardware? ");
                    id = sc.nextInt();
                    Hardware.hardwareCRUD.delete(id);
                    break;
                case 2:
                    System.out.println("Qual o ID do componente do carro? ");
                    id = sc.nextInt();
                    ComponenteCarro.componenteCarroCRUD.delete(id);
                case 3:
                    menuInicial();
                    break;
                default:
                    System.out.println("Erro");
            }
        } while (opcao != 3);
    }

    private static void atualizar() {
        int opcao = 0;
        Integer id;
        do {
            System.out.println("""
                    Qual o tipo de produto que você deseja atualizar? 
                    [1] - Hardware
                    [2] - Componente de Carro
                    [3] - Voltar""");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Qual o ID do hardware? ");
                    id = sc.nextInt();
                    Hardware.descobrirInstancia(id);
                    break;
                case 2:
                    System.out.println("Qual o ID do componente do carro? ");
                    id = sc.nextInt();
                    ComponenteCarro.descobrirInstancia(id);
                case 3:
                    menuInicial();
                    break;
                default:
                    System.out.println("Erro");
            }
        } while (opcao != 3);
    }

    private static void informacoes() {
        int opcao = 0;
        Integer id;
        do {
            System.out.println("""
                    Qual o tipo de produto que você deseja ver as informações? 
                    [1] - Hardware
                    [2] - Componente de Carro
                    [3] - Voltar""");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Qual o ID do hardware? ");
                    id = sc.nextInt();
                    System.out.println(Hardware.hardwareCRUD.read(id).toString());
                    break;
                case 2:
                    System.out.println("Qual o ID do componente do carro? ");
                    id = sc.nextInt();
                    System.out.println(ComponenteCarro.componenteCarroCRUD.read(id).toString());
                case 3:
                    menuInicial();
                    break;
                default:
                    System.out.println("Erro");
            }
        } while (opcao != 3);
    }

    private static void informacoesTodos() {
        int opcao = 0;
        Integer id;
        do {
            System.out.println("""
                    Qual o tipo de produto que você deseja ver as informações? 
                    [1] - Hardware
                    [2] - Componente de Carro
                    [3] - Voltar""");
            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(Hardware.hardwareCRUD.readAll());
                    break;
                case 2:
                    System.out.println(ComponenteCarro.componenteCarroCRUD.readAll());
                    break;
                case 3:
                    menuInicial();
                    break;
                default:
                    System.out.println("Erro");
            }
        } while (opcao != 3);
    }
}

