package Compras;
import java.util.ArrayList;
import java.util.Collections;

public class Cartao {

    double limite = 0;
    ArrayList compras = new ArrayList();
    double fatura = 0;

    public double getLimite() {
        return limite;
    }

    public ArrayList getCompras() {
        Collections.sort(this.compras);
        return compras;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getFatura() {
        return fatura;
    }

    public void addCompras(Produto produto){
        this.compras.add(produto);
        this.fatura += (produto.getPreco());
    }
}
