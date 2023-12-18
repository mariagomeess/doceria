import java.util.List;

class Funcionario {
    public void exibirEstoque(Estoque estoque) {
        estoque.exibirEstoque();
    }
    public void adicionarProdutoAoEstoque(Estoque estoque, String nomeProduto, int
            quantidade) {
        estoque.adicionarProduto(nomeProduto, quantidade);
    }
    public void atualizarQuantidadeProdutoNoEstoque(Estoque estoque, String
            nomeProduto, int quantidade) {
        estoque.atualizarQuantidadeProduto(nomeProduto, quantidade);
    }
    public void exibirPedidosEmAberto(List<Pedido> pedidos) {
// Lógica para exibir pedidos em aberto
    }
}
