import java.util.Scanner;
public class questao5{
    public static void main (String[]args){
        try (Scanner input = new Scanner(System.in)) {
            int premio;
            System.out.println("Informe o numero do seu premio. 1-Carro 2-Bicicleta 3-Moto 4-Bola 5-Panela 6-VideoGame 7-Tv 8-Computador 9-Celular    \n\n");
            premio = input.nextInt();
            switch(premio){
                case 1:
                System.out.println("Ganhou Carro parabens" );
                break;
                case 2:
                System.out.println("Ganhou Bicicleta parabens" );
                break;
                case 3:
                System.out.println(" Ganhou Moto parabens" );
                break;
                case 4:
                System.out.println("Ganhou Bola parabens" );
                break;
                case 5:
                System.out.println("Ganhou Panela parabens" );
                break;
                case 6:
                System.out.println("Ganhou VideoGame parabens" );
                break;
                case 7:
                System.out.println("Ganhou Tv parabens" );
                break;
                case 8:
                System.out.println("Ganhou Computador parabens" );
                break;
                case 9:
                System.out.println("Ganhou Celular parabens" );
                

                
                
              
            }
        }



    }
}