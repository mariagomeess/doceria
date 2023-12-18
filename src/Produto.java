import java.util.*;
class Produto {
    private String nome;
    private double preco;
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
    // Get e set
    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }

    public double getPreco() {
        return preco;
    }
}