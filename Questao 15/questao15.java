import javax.swing.JOptionPane;

public class questao15 {
    public static void main(String[] args) {
        String livro, pessoa;
        int[] emprestimo = new int[3];
        int somaMeuEmpr = 0;
        

        
        pessoa = JOptionPane.showInputDialog(("    Digite seu nome"   ));
        livro = JOptionPane.showInputDialog(("    Digite o nome do livro"    ));
        
        
        if (somaMeuEmpr <= 3) {
            somaMeuEmpr++;
            System.out.printf("Tudo certo:" + livro + "  , sera emprestao a pessoa   " + pessoa);
        } else {
            System.out.printf("  Voce obteve o limite de emprestimos  " + somaMeuEmpr);
        }

    }
}
