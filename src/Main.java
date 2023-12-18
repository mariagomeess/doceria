import java.util.Scanner;
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Cliente cliente = new Cliente();
    private static Funcionario funcionario = new Funcionario();
    private static Estoque estoque = new Estoque();
    public static void main(String[] args) {
        System.out.println("Bem-vindo à MaVi Doceria!");
        while (true) {
            exibirMenuPrincipal();
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    menuCliente();
                    break;
                case 2:
                    menuFuncionario();
                    break;
                case 3:
                    System.out.println("Saindo do sistema. Até logo!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    private static void exibirMenuPrincipal() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1. Cliente");
        System.out.println("2. Funcionário");
        System.out.println("3. Sair");
    }
    private static void menuCliente() {
        System.out.println("\nBem-vindo, Cliente!");
        while (true) {
            exibirMenuCliente();
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    cliente.verProdutosDisponiveis(estoque);
                    break;
                case 2:
                    System.out.println("Digite o nome do produto:");
                    String nomeProduto = scanner.next();
                    System.out.println("Digite a quantidade desejada:");
                    int quantidade = scanner.nextInt();
                    Produto produto = estoque.obterProduto(nomeProduto, quantidade);
                    if (produto != null) {
                        cliente.adicionarProdutoAoCarrinho(produto);
                    } else {
                        System.out.println("Produto não disponível em quantidade suficiente.");
                    }
                    break;
                case 3:
                    cliente.finalizarPedido();
                    break;
                case 4:
                    cliente.verHistoricoPedidos();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    private static void exibirMenuCliente() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1. Ver produtos disponíveis");
        System.out.println("2. Adicionar produto no carrinho");
        System.out.println("3. Finalizar pedido");
        System.out.println("4. Ver histórico de pedidos");
        System.out.println("5. Voltar");
    }
    private static void menuFuncionario() {
        System.out.println("\nBem-vindo, Funcionário!");
        while (true) {
            exibirMenuFuncionario();
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    funcionario.exibirEstoque(estoque);
                    break;
                case 2:
                    System.out.println("Digite o nome do produto:");
                    String nomeProduto = scanner.next();
                    System.out.println("Digite a quantidade a ser adicionada ao estoque:");
                    int quantidade = scanner.nextInt();
                    double preco = scanner.nextDouble();
                    Produto novoProduto = new Produto(nomeProduto, preco);
                    estoque.adicionarProduto(String.valueOf(novoProduto), quantidade);
                    break;
                case 3:
                    System.out.println("Digite o nome do produto:");
                    nomeProduto = scanner.next();
                    System.out.println("Digite a nova quantidade em estoque:");
                    quantidade = scanner.nextInt();
                    funcionario.atualizarQuantidadeProdutoNoEstoque(estoque,
                            nomeProduto, quantidade);
                    break;
                case 4:
                    funcionario.exibirPedidosEmAberto(cliente.getPedidosEmAberto());
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    private static void exibirMenuFuncionario() {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1. Exibir estoque");
        System.out.println("2. Adicionar produto ao estoque");
        System.out.println("3. Atualizar quantidade de produto no estoque");
        System.out.println("4. Exibir pedidos em aberto");
        System.out.println("5. Voltar");
    }
}