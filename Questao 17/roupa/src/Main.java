import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] argsStrings) {
        String Tecido;
        String Tamanho;
        String Cor;
        String Frio;
        String Outono;
        String Tipo;
        String Ocasiao;
        int operacao = 0;


        operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseja fazer?" + "\n"
                + "1-Registrar roupa" + "\n" + "2- Imprimir informaçoes da roupa" + "\n" + "0-sair"));
        while(operacao!=0){

                
        
            switch (operacao) {
                 case 1: {
                    Tecido = JOptionPane.showInputDialog(null, "Informe o tipo de tecido");
                    Tamanho = JOptionPane.showInputDialog(null, "Informe o tamanho");
                    Cor = JOptionPane.showInputDialog(null, "Informe a cor");
                    Frio = JOptionPane.showInputDialog(null, "Informe se e pra frio extremo");
                    Outono = JOptionPane.showInputDialog(null, "Informe se e para outono");
                    Tipo = JOptionPane.showInputDialog(null, "Informe o tipo da roupa");
                    Ocasiao = JOptionPane.showInputDialog(null, "Informe o tipo da ocasiao");
                    roupa r = new roupa(Tecido, Tamanho, Cor, Tipo, Ocasiao, Frio, Outono);
                    JOptionPane.showMessageDialog(null, r.Imprimir());
                    

                   break;

                } 
                case 2: {
                      Tecido = JOptionPane.showInputDialog(null, "Informe o tipo de tecido");
                    Tamanho = JOptionPane.showInputDialog(null, "Informe o tamanho");
                    Cor = JOptionPane.showInputDialog(null, "Informe a cor");
                    Frio = JOptionPane.showInputDialog(null, "Informe se e pra frio extremo");
                    Outono = JOptionPane.showInputDialog(null, "Informe se e para outono");
                    Tipo = JOptionPane.showInputDialog(null, "Informe o tipo da roupa");
                    Ocasiao = JOptionPane.showInputDialog(null, "Informe o tipo da ocasiao");
                  
                    roupa r = new roupa(Tecido, Tamanho, Cor, Tipo, Ocasiao, Frio, Outono);
                    break;

                }
                case 0:{
                    break;
                }
                
            }
        operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "O que deseja fazer?" + "\n"
        + "1-Registrar roupa" + "\n" + "2- Imprimir informaçoes da roupa" + "\n" + "sair"));

            }


            }


        }