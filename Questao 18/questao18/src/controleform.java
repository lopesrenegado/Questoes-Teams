import java.util.ArrayList;
public class controleform {
    private ArrayList<form> propCadastros = new ArrayList<>();

    public void propCadastro(String nome, String dataNascimento, String rua, String Bairro, String Cidade, String estado, String cpf, String rg){
        propCadastros.add(new form(nome, dataNascimento, rua, Bairro, Cidade, estado, cpf, rg));
    }
    public String imprimirInfo(){
        String res = "";
        for(int i = 0; i<propCadastros.size(); i++){
            res += "nome" + propCadastros.get(i).getNome() + "Data de Nascimento:" + propCadastros.get(i).getDataNascimento() + "Rua:" + propCadastros.get(i).getRua() + "Bairro:" + propCadastros.get(i).getBairro() + "Cidade:" + propCadastros.get(i).getCidade() +
            "Estado:" + propCadastros.get(i).getEstado() + "Cpf:" + propCadastros.get(i).getCpf() + "Rg:" + propCadastros.get(i).getRg();
        }
        return res;
    }
}
