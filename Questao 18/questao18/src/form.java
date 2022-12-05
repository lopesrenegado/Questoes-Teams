import javax.swing.JOptionPane;

public class form {
    private String nome;
    private String dataNascimento;
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;
    String cpf;
    String rg;
    private static int propCadastros;

    public String getNome() {
        return nome;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public String getRua() {
        return rua;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
    public String getCpf() {
        return cpf;
    }
    public String getRg() {
        return rg;
    }

    public form(String nome, String dataNascimento, String rua, String Bairro, String Cidade, String estado, String cpf2, String rg2  ){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.rua = rua;
        this.bairro = Bairro;
        this.cidade = Cidade;
        this.estado = estado;
        this.cpf = cpf2;
        this.rg =rg2;
        ++propCadastros;
        

        JOptionPane.showMessageDialog(null, "Proprietario cadastrado!" );

    }



    
}
