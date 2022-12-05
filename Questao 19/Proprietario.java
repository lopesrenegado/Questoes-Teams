public class Proprietario {
    private String bairro;
    private String rua;
    private String nCasa;
    private Endereço endereço;

    public Proprietario(String bairro, String rua, int nCasa){
        Endereço e = new Endereço();
        e.setBairro(bairro);
        e.setRua(rua);
        e.setnCasa(nCasa);
        endereço = e;
    }

    public String getBairro() {
        return endereço.getBairro();
    }

    public String getRua() {
        return endereço.getRua();
    }

    public int getnCasa() {
        return endereço.getnCasa();
    }
}
