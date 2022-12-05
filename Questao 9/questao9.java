import java.util.Scanner;

public class questao9 {

    public static void main(String[] args) {
        double a, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a tempatura em Fahrenheit");
        a = sc.nextDouble();
        System.out.println("Sua temperatura e = "  +celsius(a));

    }

    static double celsius(double f) {
        return (f - 32) * 5 / 9;
    }

}