import java.util.ArrayList;
import java.util.List;

class Pedido {
    private List<Produto> itens = new ArrayList<>();
    private boolean finalizado = false;
    public void adicionarItem(Produto produto) {
        if (!finalizado) {
            itens.add(produto);
            System.out.println("Produto adicionado ao carrinho: " + produto);
        } else {
            System.out.println("Pedido finalizado. Não é possível adicionar mais itens.");
        }
    }
    public List<Produto> getItens() {
        return itens;
    }
    public void finalizarPedido() {
        finalizado = true;
        System.out.println("Pedido finalizado. Total a pagar: R$ " + calcularTotal());
    }
    private double calcularTotal() {
        return itens.stream().mapToDouble(Produto::getPreco).sum();
    }
}
