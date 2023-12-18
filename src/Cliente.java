import java.util.ArrayList;
import java.util.List;

class Cliente extends Usuario implements Comprador{
    private Pedido pedidoAtual = new Pedido();
    private List<Pedido> historicoPedidos = new ArrayList<>();

    Cliente(String usuario, String senha) {
        super(usuario, senha);
    }
    @Override
    public void verProdutosDisponiveis(Estoque estoque) {
// Lógica para exibir produtos disponíveis no estoque
    }
    @Override
    public void adicionarProdutoAoCarrinho(Estoque estoque, String nomeProduto) {
// Lógica para adicionar produto ao carrinho
    }
    @Override
    public void finalizarPedido() {
        pedidoAtual.finalizarPedido();
        historicoPedidos.add(pedidoAtual);
        pedidoAtual = new Pedido(); // Inicia um novo pedido
    }
    @Override
    public void verHistoricoPedidos() {
// Lógica para exibir histórico de pedidos
    }
    @Override
    public Pedido getPedidoAtual() {
        return pedidoAtual;
    }
    @Override
    public void setPedidoAtual(Pedido pedidoAtual) {
        this.pedidoAtual = pedidoAtual;
    }
    @Override
    public List<Pedido> getHistoricoPedidos() {
        return historicoPedidos;
    }
    @Override
    public void setHistoricoPedidos(List<Pedido> historicoPedidos) {
        this.historicoPedidos = historicoPedidos;
    }
    @Override
    public void adicionarProdutoAoCarrinho(Produto produto) {

    }
    @Override
    public List<Pedido> getPedidosEmAberto() {
        return null;
    }
}
