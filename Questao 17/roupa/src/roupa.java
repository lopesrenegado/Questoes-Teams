

public class roupa{
    private String Tecido;
    private String Tamanho;
    private String Cor;
    private String Tipo;
    private String Ocasiao;
    private String Frio;
    private String Outono;

    public roupa(String Tecido, String Tamanho, String Cor, String Tipo, String Ocasiao, String Frio, String Outono){
        this.Tecido = Tecido;
        this.Tamanho = Tamanho;
        this.Cor = Cor;
        this.Tipo = Tipo;
        this.Ocasiao = Ocasiao;
        this.Frio = Frio;
        this.Outono = Outono;
        
    }
    public String Imprimir(){
        return "Tecido: " + getTecido() + "\n" + "Tamanho: " + getTamanho() + "\n" + "Cor: " + getCor() + "\n"
        + "Frio: " + getFrio() + "\n" + "Outono: " + getOutono() + "\n" + "Tipo: " + getTipo() + "\n" + "Ocasiao: "
        + getOcasiao();
    }

    




    public void setTecido(String tecido) {
        Tecido = tecido;
    }
    public void setTamanho(String tamanho) {
        Tamanho = tamanho;
    }
    public void setCor(String cor) {
        Cor = cor;
    }
    public void setTipo(String tipo) {
        Tipo = tipo;
    }
    public void setOcasiao(String ocasiao) {
        Ocasiao = ocasiao;
    }
    public void setFrio(String frio) {
        Frio = frio;
    }
    public void setOutono(String outono) {
        Outono = outono;
    }
    public String getFrio() {
        return Frio;
    }
    public String getOutono() {
        return Outono;
    }
    public String getTipo() {
        return Tipo;
    }
    public String getOcasiao() {
        return Ocasiao;
    }
    
    public String getTecido() {
        return Tecido;
    }
    public String getTamanho() {
        return Tamanho;
    }
    public String getCor() {
        return Cor;
    }
    
    


    
    
    
}