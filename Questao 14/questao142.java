import java.util.ArrayList;

public class questao142 {
    private String modelo;
    private String memoria;
    private String armazenamento;
    private String processador;
    private String placaDeVideo;
    private ArrayList<questao142> questao142 = new ArrayList<>();

    public questao142(String modelo, String memoria, String armazenamento, String processador, String placaDeVideo) {
        this.modelo = modelo;
        this.memoria = memoria;
        this.armazenamento = armazenamento;
        this.processador = processador;
        this.placaDeVideo = placaDeVideo;
    }

    public void setArmazenamento(String armazenamento) {
        this.armazenamento = armazenamento;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlacaDeVideo(String placaDeVideo) {
        this.placaDeVideo = placaDeVideo;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public String getArmazenamento() {
        return armazenamento;
    }

    public String getMemoria() {
        return memoria;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlacaDeVideo() {
        return placaDeVideo;
    }

    public String getProcessador() {
        return processador;
    }
}
