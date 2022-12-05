import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class questao141 {
    ArrayList<questao142> questao142 = new ArrayList();
    private int indice = -1;

    public void cadastrarComputador(String modelo, String memoria, String armazenamento, String processador, String placaDeVideo) {
        questao142 c = new questao142(modelo, memoria, armazenamento, processador, placaDeVideo);
        questao142.add(c);
        ++indice;
    }

    public void upgradeComputador(String memoria, String armazenamento, String processador, String placaDeVideo, int codigoComputador){
        questao142.get(codigoComputador).setMemoria(memoria);
        questao142.get(codigoComputador).setArmazenamento(armazenamento);
        questao142.get(codigoComputador).setProcessador(processador);
        questao142.get(codigoComputador).setPlacaDeVideo(placaDeVideo);
    }

    public void removerComputador(int codigoComputador) {
        questao142.remove(codigoComputador);
    }

    public String imprimir(){
      return "modelo: " + questao142.get(indice).getModelo() + "\n" + "memoria: " + questao142.get(indice).getMemoria() + "\n" + "armazenamento: " + questao142.get(indice).getArmazenamento() + "\n" + "processador: " + questao142.get(indice).getProcessador()+ "\n" + "placa de video: " + questao142.get(indice).getPlacaDeVideo() + "\n" + "codigo do computador registrado: " + indice;
    }

    public String imprimirPorIndice(int codigo) throws IOException{
        try{
            return "modelo: " + questao142.get(codigo).getModelo() + "\n" + "memoria: " + questao142.get(codigo).getMemoria() + "\n" + "armazenamento: " + questao142.get(codigo).getArmazenamento() + "\n" + "processador: " + questao142.get(codigo).getProcessador()+ "\n" + "placa de video: " + questao142.get(codigo).getPlacaDeVideo();
    }
    catch(RuntimeException e){
    }
    return "Algo errado aconteceu";
}

}
