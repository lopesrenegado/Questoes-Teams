import javax.swing.JOptionPane;
import java.util.ArrayList;

import javax.print.attribute.standard.JobHoldUntil;
import javax.swing.JOptionPane;




public class Dono {
    public static void main(String[]args) throws Exception{
        JOptionPane.showMessageDialog(null, "Bem vindo");
        int op = 99;
        while(op !=0){
            controleform cc = new controleform();
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseja fazer:\n" + "1- Cadastrar proprietario\n" +  "0 - Sair"));
            switch(op){
                case 1:
                String nome = JOptionPane.showInputDialog(null, "Informe o seu nome completo: ");
                String dataNascimento = JOptionPane.showInputDialog(null, "Informe sua data de nascimento ");
                String rua = JOptionPane.showInputDialog(null, "Informe a rua que voce mora: ");
                String bairro = JOptionPane.showInputDialog(null, "Informe o seu bairro: ");
                String cidade = JOptionPane.showInputDialog(null, "Informe o sua cidade: ");
                String estado = JOptionPane.showInputDialog(null, "Informe o seu estado: ");
                String cpf = JOptionPane.showInputDialog(null, "informe o seu cpf");
                String rg = JOptionPane.showInputDialog(null, "informe o seu Rg");
                cc.propCadastro(nome, dataNascimento, rua, bairro, cidade, estado, cpf, rg);
            
                JOptionPane.showMessageDialog(null, "Proprietario cadastrado:\n" + cc.imprimirInfo());
                break;
                case 0:
                break;
            }
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseha fazer\n" + "1- Cadastrar proprietario\n" +  "0 - sair"));
        }
        
    }
    
}
