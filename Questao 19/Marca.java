public class Marca {
    private String nome;
    private int nModelos;
    private int anoLancamento;
    private int codigoIdentificador;

    public Marca(String nome, int nModelos, int anoLancamento, int codigoIdentificador){
        this.nome = nome;
        this.nModelos = nModelos;
        this.anoLancamento = anoLancamento;
        this.codigoIdentificador = codigoIdentificador;
    }

    public void setCodigoIdentificador(int codigoIdentificador) {
        this.codigoIdentificador = codigoIdentificador;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setnModelos(int nModelos) {
        this.nModelos = nModelos;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public int getCodigoIdentificador() {
        return codigoIdentificador;
    }

    public int getnModelos() {
        return nModelos;
    }

    public String getNome() {
        return nome;
    }
}
