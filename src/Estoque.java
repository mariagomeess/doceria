import java.util.HashMap;
import java.util.Map;

class Estoque {
    private Map<String, Integer> estoque = new HashMap<>();
    public void adicionarProduto(String nome, int quantidade) {
        estoque.put(nome, quantidade);
        System.out.println("Produto adicionado ao estoque: " + nome + " - Quantidade: " +
                quantidade);
    }
    public void atualizarQuantidadeProduto(String nome, int quantidade) {
        if (estoque.containsKey(nome)) {
            estoque.put(nome, quantidade);
            System.out.println("Quantidade do produto atualizada no estoque: " + nome
                            + " - Nova Quantidade: " + quantidade);
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }
    public void exibirEstoque() {
        System.out.println("Estoque:");
        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public Produto obterProduto(String nomeProduto, int quantidade) {
        return null;
    }
}
