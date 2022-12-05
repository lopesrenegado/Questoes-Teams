import java.util.Scanner;

public class questao7 {

    public static void main(String[] args) {
        try (Scanner ler = new Scanner(System.in)) {
            int a, b, c;

            System.out.print("a: ");
            a = ler.nextInt();
            System.out.print("b: ");
            b = ler.nextInt();
            System.out.print("c: ");
            c = ler.nextInt();

            double delta;
            delta = Math.pow(b, 2) - (4 * a * c);

            System.out.println();

            if (delta < 0)
                System.out.printf("Não exixtem resultados reais\n");
            if (delta == 0) {
                double x;
                x = -b / (2 * a);
                System.out.printf("x' e x'' = %.2f\n", x);
            }

            if (delta > 0) {
                double x1, x2;
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("x' = %.2f\n", x1);
                System.out.printf("x''' = %.2f\n", x2);
            }
        }

    }
}