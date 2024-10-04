import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int index = 0;
        int opcao = 1;
        int random;
        int tentativa = 0;
        //commited

        try {
            // Switch case para permitir ao usuário sair do programa.
            while (opcao != 0) {
                System.out.println("Escolha uma opcao:");
                System.out.println("1 - Jogar");
                System.out.println("0 - Sair");
                opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Escolha um intervalo entre numeros para jogar.");
                    System.out.print("Inicio: ");
                    int minimo = sc.nextInt();
                    System.out.print("Fim: ");
                    int maximo = sc.nextInt();
                    random = aleatoriar(minimo, maximo);

                    while (tentativa != random) {
                        System.out.print("Digite um numero: ");
                        tentativa = sc.nextInt();
                        index++;
                        if (tentativa != random) {
                            System.out.println("Que pena, voce errou, tente novamente.");
                            if (tentativa > random) {
                                System.out.printf("Tente um numero menor que %d.\n", tentativa);
                            } else {
                                System.out.printf("Tente um numero maior que %d.\n", tentativa);
                            }
                        } else {
                            System.out.printf("Parabens, você acertou em " + index + " tentativa(s)!\n");
                            break;
                        }
                    }
                case 0:
                    System.out.println("O número de tentativas realizadas foram " + index + ".\n");
                    break;
            }
        }
        }

        catch(InputMismatchException e){
                System.out.println("Digite um numero, tente novamente.");
        }

            sc.close();
    }

    public static int aleatoriar(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt((maximo - minimo) + 1) + minimo;
    }
}
