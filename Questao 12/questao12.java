import java.util.Scanner;

public class questao12 {

    public static void main(String[] args){
        try (Scanner entrada = new Scanner(System.in)) {
            int resposta = 1;
            while (resposta == 1){
                int opcao;
                System.out.println("Escolha um opçao abaixo");
                System.out.println("[1] Aprender");
                System.out.println("[2] Escrever");
                System.out.println("[3] Falar");
                opcao = entrada.nextInt();
                switch(opcao){
                    case 1:
                    System.out.print("Voce seleciou opçao Aprender");
                    break;
                    case 2:
                    System.out.print("Voce seleciou opçao Escrever");
                    break;
                    case 3:
                    System.out.print("Voce seleciou opçao Falar");
                    break;
                    default:
                    System.out.print("Voce colocou uma opçao invalida");
                    break;
                }
                System.out.print("\nDeseja encerrar o progama [1]Nao [2]Sim    ");
                resposta = entrada.nextInt();
                if (resposta !=1){
                    System.out.print("encerrando!");
                }
            }
        }
    }







}