public class Produto{
    private String nome;
    private double valor;
    private int quantidade;
    private String descricao;
    private String tipo;
    private static int contador = 0;
    private int codigo;

public Produto(String nome, double valor, int quantidade, String descricao, String tipo){
    this.nome = nome;
    this.valor = valor;
    this.quantidade = quantidade;
    this.descricao = descricao;
    this.tipo = tipo;
    ++contador;
    this.codigo = contador;
}

public int getCodigo() {
    return codigo;
}

public String getDescricao() {
    return descricao;
}

public String getNome() {
    return nome;
}

public int getQuantidade() {
    return quantidade;
}

public String getTipo() {
    return tipo;
}

public double getValor() {
    return valor;
}

}
