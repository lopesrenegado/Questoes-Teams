public class Endereço {
    private String rua;
    private String bairro;
    private int nCasa;

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setnCasa(int nCasa) {
        this.nCasa = nCasa;
    }

    public String getBairro() {
        return bairro;
    }

    public String getRua() {
        return rua;
    }

    public int getnCasa() {
        return nCasa;
    }
}
