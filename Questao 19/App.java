import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String nomeMarca = "Audi";
        int nModelosMarca = 45;
        int anoLancamentoModelo = 2001;
        int codigoIdentificador = 9994;
        String cor = "Azul";
        int chassi = 92;
        String bairroProprietario = "Iedo Menezes";
        String ruaProprietario = "Guarani";
        int nCasaProprietario = 128;
        int velocidadeMaxima = 100;
        int velocidadeAtual = 10;
        int nDePortas = 4;
        boolean tetoSolar = false;
        int nMarchas = 6;
        boolean cambioAutomatico = true;
        double volumeCombustivel = 60;
        Carro c = new Carro (nomeMarca, nModelosMarca, anoLancamentoModelo, codigoIdentificador, ruaProprietario, bairroProprietario, nCasaProprietario, cor, chassi, velocidadeMaxima,  velocidadeAtual, nDePortas, tetoSolar,  cambioAutomatico, volumeCombustivel, nMarchas);
        JOptionPane.showMessageDialog(null, c.imprimir());
        JOptionPane.showMessageDialog(null, "ACELEROU!!");
        c.aceleraCarro();
        JOptionPane.showMessageDialog(null, "NOVA VELOCIDADE: " + c.getVelocidadeAtual());
        JOptionPane.showMessageDialog(null, "FREIOU!!");
        c.freiaCarro();
        JOptionPane.showMessageDialog(null, "NOVA VELOCIDADE: " + c.getVelocidadeAtual());
        c.trocaMarcha();
        JOptionPane.showMessageDialog(null, "TROCOU DE MARCHA!!");
        JOptionPane.showMessageDialog(null, "MARCHA ATUAL: " + c.getMarcha());
        c.reduzMarcha();
        JOptionPane.showMessageDialog(null, "REDUZIU MARCHA!!");
        JOptionPane.showMessageDialog(null, "MARCHA ATUAL: " + c.getMarcha());
        c.marchaRé();
        JOptionPane.showMessageDialog(null, "MARCHA RÉ!!");
        JOptionPane.showMessageDialog(null, "NOVA MARCHA: " + c.getMarcha());
        int consumoPorKm = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe quantos litros sao gastos por km/hora de viagem: "));
        JOptionPane.showMessageDialog(null, "Autonomia atual (em horas): " + c.autonomiaViagem(consumoPorKm));
    }
}
