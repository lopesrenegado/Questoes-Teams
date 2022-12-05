import java.io.*;

public class questao6{

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        double horastrabalhada, valordashoras,percentualdedesconto, salario_bruto;
        double salario_liquido;
        System.out.print("Digite o valor do salario bruto: ");
        salario_bruto = Double.parseDouble(in.readLine());
        System.out.print("Digite quantas horas voce trabalha: ");
        horastrabalhada = Double.parseDouble(in.readLine());
        System.out.print("Digite valor das horas trabalhadas: ");
        valordashoras = Double.parseDouble(in.readLine());
        System.out.print("Digite o percentual de desconto: ");
        percentualdedesconto = Double.parseDouble(in.readLine());
        horastrabalhada= horastrabalhada*valordashoras;
        percentualdedesconto= ((percentualdedesconto/100) /salario_bruto);
        salario_liquido= salario_bruto-percentualdedesconto;
        System.out.println("O valor do horas trabalhada: " + horastrabalhada);
        System.out.println("O valor do percentual de desconto: " + percentualdedesconto);
        System.out.println("O valor do salario bruto: " + salario_bruto);
        System.out.println("O valor do salario liquido: " + salario_liquido);
        in.close();
    }

}