import java.util.ArrayList;
import java.util.List;

class Cliente {
    private Pedido pedidoAtual = new Pedido();
    private List<Pedido> historicoPedidos = new ArrayList<>();
    public void verProdutosDisponiveis(Estoque estoque) {
// Lógica para exibir produtos disponíveis no estoque
    }
    public void adicionarProdutoAoCarrinho(Estoque estoque, String nomeProduto) {
// Lógica para adicionar produto ao carrinho
    }
    public void finalizarPedido() {
        pedidoAtual.finalizarPedido();
        historicoPedidos.add(pedidoAtual);
        pedidoAtual = new Pedido(); // Inicia um novo pedido
    }
    public void verHistoricoPedidos() {
// Lógica para exibir histórico de pedidos
    }

    public Pedido getPedidoAtual() {
        return pedidoAtual;
    }

    public void setPedidoAtual(Pedido pedidoAtual) {
        this.pedidoAtual = pedidoAtual;
    }

    public List<Pedido> getHistoricoPedidos() {
        return historicoPedidos;
    }

    public void setHistoricoPedidos(List<Pedido> historicoPedidos) {
        this.historicoPedidos = historicoPedidos;
    }

    public void adicionarProdutoAoCarrinho(Produto produto) {

    }

    public List<Pedido> getPedidosEmAberto() {
        return null;
    }
}
