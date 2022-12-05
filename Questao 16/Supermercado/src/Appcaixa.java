import javax.swing.JOptionPane;


public class Appcaixa {
    public static String menu() {
        return "Digite:\n" +
                "1 - Cadastrar produto\n" +
                "2 - Cadastrar pedido\n" +
                "3 - Adicionar item ao pedido\n" +
                "4 - Remover pedido\n" +
                "5 - Listar pedido\n" +
                "0 - Sair";
    }

    public static void main(String[] args) {
        int op = Integer.parseInt(JOptionPane.showInputDialog(null, menu()));
        ControleProduto cProduto = new ControleProduto();
        ControlePedido cPedido = new ControlePedido();
        int contadorProdutos = 0;

        while (op != 0) {
            switch (op) {
                case 1: {// Cadastrar um produto
                    String nome = JOptionPane.showInputDialog(null, "Qual o nome do produto?");
                    double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor de compra do produto?"));
                    int quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a quantidade do produto presente no estoque: "));
                    String descricao = JOptionPane.showInputDialog("Qual a descricao do produto?");
                    String tipo = JOptionPane.showInputDialog("Digite o tipo do produto:");
                    cProduto.cadastrarProduto(nome, valor, quantidade, descricao, tipo);
                    ++contadorProdutos;
                    JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!! \nCodigo do produto: "+contadorProdutos);
                    break;
                }
                case 2: {// Cadastrar pedido
                    int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o numero do pedido?"));
                    String data = JOptionPane.showInputDialog(null, "Informe a data que o pedido sera criado: ");
                    String status = JOptionPane.showInputDialog(null, "Por fim, informe o status do pedido: ");
                    cPedido.cadastrarPedido(numero, data, status);
                    JOptionPane.showMessageDialog(null, "Pedido cadastrado com sucesso!!");
                    break;
                }
                case 3: {//Adicionar item ao pedido
                    int numeroPedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o numero do pedido?"));
                    Pedido pedido = cPedido.pesquisarPedido(numeroPedido);
                    if (pedido == null) {
                        JOptionPane.showMessageDialog(null, "Algo de errado aconteceu com o pedido!!");
                        break;
                    }
                    int codigo = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual o codigo do produto a ser cadastrado?"));
                    Produto produto = cProduto.pesquisarProduto(codigo);
                    if (produto == null) {
                        JOptionPane.showMessageDialog(null, "Algo de errado aconteceu com o produto!!");
                        break;
                    }
                    int qtd = Integer.parseInt(
                            JOptionPane.showInputDialog(null, "Qual a quantidade do produto que voce ira adicionar?"));
                    if (qtd > produto.getQuantidade()) {
                        JOptionPane.showMessageDialog(null, "Nao possuimos estoque no momento!!!");
                        break;
                    }
                    cPedido.adicionarItem(numeroPedido, produto, qtd);
                    JOptionPane.showMessageDialog(null, "Produto adicionado com sucesso!!");
                    break;
                }
                case 4: {// Remover pedido
                    int numeroPedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero do pedido a ser removido: "));
                    Pedido pedido = cPedido.pesquisarPedido(numeroPedido);
                    if (pedido == null) {
                        JOptionPane.showMessageDialog(null, "Algo de errado aconteceu com o pedido!!");
                        break;
                    }
                    cPedido.removerPedido(numeroPedido);
                    JOptionPane.showMessageDialog(null, "Pedido removido!!");
                    break;
                }
                case 5: {// Listar pedido
                    int numeroPedido = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe os dados do pedido: "));
                    Pedido pedido = cPedido.pesquisarPedido(numeroPedido);
                    
                    if(pedido == null){
                        JOptionPane.showMessageDialog(null, "O pedido nao existe ou foi cancelado!!");
                        break;
                    }
                    JOptionPane.showMessageDialog(null, cPedido.imprimirPedido(numeroPedido));
                    JOptionPane.showMessageDialog(null, "Itens listados: \n" + cPedido.ListagemProdutos(numeroPedido));
                    break;
                }
                default:{//Erro
JOptionPane.showMessageDialog(null, "Erro!! Escolha outra opcao");
break;
                }
            }
            op = Integer.parseInt(JOptionPane.showInputDialog(menu()));
        }
    }
}