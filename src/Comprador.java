import java.util.List;

interface Comprador {
    void verProdutosDisponiveis(Estoque estoque);

    void adicionarProdutoAoCarrinho(Estoque estoque, String nomeProduto);

    void finalizarPedido();

    void verHistoricoPedidos();

    Pedido getPedidoAtual();

    void setPedidoAtual(Pedido pedidoAtual);

    List<Pedido> getHistoricoPedidos();

    void setHistoricoPedidos(List<Pedido> historicoPedidos);

    void adicionarProdutoAoCarrinho(Produto produto);

    List<Pedido> getPedidosEmAberto();
}

