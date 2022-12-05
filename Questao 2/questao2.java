import java.util.Scanner;



public class questao2{

    public static void main(String[]args){
        Scanner entrada;
        int n1;
        int n2;
        entrada = new Scanner(System.in);

        System.out.println("Insira o primeiro numero:");
        n1 = entrada.nextInt();
        System.out.println("Insira o primeiro numero:");
        n2 = entrada.nextInt();
        if (n1 > n2)
        {System.out.printf("O numero " + n1 + " eh maior");}
        else
        {
            if(n2 > n1)
            {System.out.printf("O numero " + n2 + " eh maior");}
           
            else{System.out.printf("Os numeros digitados sao iguais");}
        }
    }
}



