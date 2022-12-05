import java.util.Scanner;

public class questao8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double raio, volume;
        System.out.print("Digite o valor do raio");
        raio = in.nextDouble();
        in.nextLine();
        volume = 4.0 * Math.PI * raio * raio * raio / 3;
        if (raio > 0) {
            System.out.println("o valor do raio e " + volume);
        } else {
            System.out.println("Raio inexistente");
        }

    }
}