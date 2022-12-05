import java.util.ArrayList;

public class ControlePedido {
    ControleProduto cProduto = new ControleProduto();
    ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

    public void cadastrarPedido (int numero, String data, String status){
        Pedido p = new Pedido(numero, data,status);
        pedidos.add(p);
    }

    public void adicionarItem (int numeroPedido, Produto p, int quantidade) {
        Item i = new Item(numeroPedido, p, quantidade);
        Pedido pedido = pesquisarPedido(numeroPedido);
        pedido.inserirItem(i);
    }

    public Pedido pesquisarPedido (int numero){
        Pedido p = null;
        for (int i = 0; i < pedidos.size(); i++){
        if (numero == pedidos.get(i).getNumero()){
    p=pedidos.get(i);
        break;
       }
        }
        return p;
        }

        public void removerPedido(int numeroPedido){
            Pedido p = pesquisarPedido(numeroPedido);
            pedidos.remove(p);
        }

        public String imprimirPedido (int numero){
            Pedido p = null;
            for(int i = 0; i < pedidos.size(); i++){
                if(numero == pedidos.get(i).getNumero()){
                    p = pedidos.get(i);
                    break;
                }
            }
            return "Dados do pedido: \n" + "Numero: " + p.getNumero() + "\nData do pedido: " + p.getData() + "\nStatus do pedido: " + p.getStatus() + "\nValor do pedido: R$: " + p.precoVenda();
        }

        public String ListagemProdutos(int numeroPedido){
            Pedido p = pesquisarPedido(numeroPedido);
            String itensListados = "";
            for (int i=0; i < p.getItens().size(); i++){
                if(numeroPedido == p.getNumero()){
                   itensListados = itensListados + p.getItens().get(i).getProduto().getNome() + "\n";
                }
            }
            return itensListados;
            }

    }