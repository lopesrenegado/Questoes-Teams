import java.util.Scanner;


public class questao1 {
    public static void main(String[] args) {
        try (Scanner scr1 = new Scanner(System.in)) {
            double Velocidademedia, Tempo;
            double Distancia;

            System.out.print("Informe o tempo que voce gastou para viajar em horas: ");
            Tempo = scr1.nextDouble();

            System.out.print("Informe a Velocidade media feita ate o seu destino em km: ");
            Velocidademedia = scr1.nextDouble();

            Distancia = Velocidademedia * Tempo;
            System.out.print("informaçoes: ");

            System.out.print(" Quantidade de combustivel gasto = " + Distancia / 12 + " Litros");

        }

    }
}