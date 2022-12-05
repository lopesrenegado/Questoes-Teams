
import javax.swing.JOptionPane;

public class questao4 {

    public static void main(String[] args) {
        int vet[] = new int[5];
        int aux = 0;
        for (int i = 0; i < vet.length; i++) {
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o numero " + i));
        }
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length - 1; j++) {
                if (vet[j] > vet[j + 1]) {
                    aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < vet.length; i++) {
            JOptionPane.showMessageDialog(null, "Valor da posição " + i + " -->" + vet[i]);

        }

    }
}