import javax.swing.*;

public class questao3 {

    public static void main(String args[]) {

        String começo = "";
        String fim = JOptionPane.showInputDialog("Informe o numero desejavel");

        int i = Integer.parseInt(fim);
        if (i % 2 == 0) {
            começo += "O numero é par";

        } else {
            começo += "O numero é impar";
        }

        JOptionPane.showMessageDialog(null,
                "Valor " + começo, "Testa numero ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}