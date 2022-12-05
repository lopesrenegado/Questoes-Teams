public class blusa extends roupa {
    private String Frio;
    private String Outono;
        
    public blusa(String Tecido, String Tamanho, String Cor, String Tipo, String Ocasiao, String Frio, String Outono) {
        super(Tecido, Tamanho, Cor, Tipo, Ocasiao, Frio, Outono);
        
    }

    public String Imprimir(){
        return "Tecido: " + super.getTecido() + "\n" + "Tamanho: " + super.getTamanho() + "\n" + "Cor: " + super.getCor() + "\n"
        + "Frio: " + super.getFrio() + "\n" + "Outono: " + super.getOutono() + "\n" + "Tipo: " + super.getTipo() + "\n" + "Ocasiao: "
        + super.getOcasiao();
    }

    
    

      
    
    
}