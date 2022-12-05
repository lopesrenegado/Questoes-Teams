import java.util.ArrayList;

public class ControleProduto {
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void cadastrarProduto (String nome, double valor, int quantidade, String descricao, String tipo){
        Produto p = new Produto(nome, valor, quantidade, descricao, tipo);
        produtos.add(p);
    }

    public Produto pesquisarProduto(int codigo){
        Produto p = null;
        for (int i = 0; i < produtos.size(); i++){
        if (codigo == produtos.get(i).getCodigo()){
        p=produtos.get(i);
        break;
       }
        }
        return p;
        }
}