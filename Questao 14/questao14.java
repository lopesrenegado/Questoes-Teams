import javax.swing.JOptionPane;

public class questao14 {
    public static void main(String[] args) throws Exception {
        questao141 cc = new questao141();
        int operacao;
        String modelo;
        String memoria;
        String armazenamento;
        String processador;
        String placaDeVideo;
        int codigoComputador;

        operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual operacao deseja fazer?" + "\n" + "1- Cadastrar um computador" + "\n" + "2- Dar upgrade no computador cadastrado " + "\n" + "3- Remover computador" + "\n" + "4- Imprimir dados" + "\n" + "0- Sair"));
        while(operacao!=0){
            switch (operacao) {
                case 1:{
            modelo = JOptionPane.showInputDialog(null, "Informe o modelo do equipamento: ");
            memoria = JOptionPane.showInputDialog(null, "Informe a memoria do equipamento: ");
            armazenamento = JOptionPane.showInputDialog(null, "Informe o armazenamento do equipamento: ");
            processador = JOptionPane.showInputDialog(null, "Informe o processador do equipamento: ");
            placaDeVideo = JOptionPane.showInputDialog(null, "Informe a placa de video do equipamento: ");
            cc.cadastrarComputador(modelo, memoria, armazenamento, processador, placaDeVideo);
            JOptionPane.showMessageDialog(null, "Dados do computador cadastrado: " + "\n" + cc.imprimir());
            break;
                }
                case 2:{
                    memoria = JOptionPane.showInputDialog(null, "Informe a memoria do upgrade: ");
                    armazenamento = JOptionPane.showInputDialog(null, "Informe o armazenamento do upgrade: ");
                    processador = JOptionPane.showInputDialog(null, "Informe o processador do do upgrade: ");
                    placaDeVideo = JOptionPane.showInputDialog(null, "Informe a placa de video do do upgrade: ");
                    codigoComputador = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o código do computador a ser feito o upgrade: "));
                    cc.upgradeComputador(memoria, armazenamento, processador, placaDeVideo, codigoComputador);
                    JOptionPane.showMessageDialog(null, cc.imprimir());
                    break;
                }
                case 3:{
                    codigoComputador = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o código do computador a ser removido do sistema: "));
                    cc.removerComputador(codigoComputador);
    JOptionPane.showMessageDialog(null, "Computador removido com sucesso!!");
    break;
                }
                case 4:{
                    codigoComputador = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o código do computador: "));
                    JOptionPane.showMessageDialog(null, cc.imprimirPorIndice(codigoComputador));
                    break;
                }
                case 0:{
break;
                }
                }
                operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Qual operacao deseja fazer?" + "\n" + "1- Cadastrar um computador" + "\n" + "2- Dar upgrade no computador cadastrado " + "\n" + "3- Remover computador" + "\n" + "4- Imprimir dados" + "\n" + "0- Sair"));
        }
    }
}

