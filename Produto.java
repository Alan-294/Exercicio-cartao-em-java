package Compras;

public class Produto implements Comparable<Produto>{
    String descricao;
    double preco;

    public String getDescricao() {
        return descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return descricao +": R$" + preco;
    }

    @Override
    public int compareTo(Produto outroProduto) {
        return Double.valueOf(this.preco).compareTo(Double.valueOf(outroProduto.preco));
    }
}


