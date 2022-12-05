public class Item {
    private int quantidade;
    private Produto produto;

    public Item (int numero, Produto produto, int quantidade){
        this.produto = produto;
        this.quantidade = quantidade;
    }
    
public Produto getProduto() {
    return produto;
}

public int getQuantidade() {
    return quantidade;
}

public double precoItem(){
    return ((getProduto().getValor()) * 1.75) * getQuantidade();
}

public String imprimir(){
    return "Nome do produto: " + getProduto().getNome() + "\n"
    + "Quantidade do produto listado: " + "\n"
    + "Preco total a ser pago: " + precoItem();
}
}