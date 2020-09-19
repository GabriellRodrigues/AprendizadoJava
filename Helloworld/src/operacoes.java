import java.util.Scanner;

public class operacoes {
    public static void main(final String[] args) {
        Scanner ler = new Scanner(System.in);

        int num1;
        int num2;
        int opint;
        int escolha;
        float opdiv;

        do{
            System.out.println("\nEscolha uma das opções abaixo (operações com 2 números)");
            System.out.println("1 - Somar;");
            System.out.println("2 - Subtrair;");
            System.out.println("3 - Dividir;");
            System.out.println("4 - Multiplicar;");
            System.out.println("5 - Sair;");
            escolha = ler.nextInt();

            if (escolha == 5){
                System.out.println("Encerrando o programa...\n");
                System.exit(0);
            }

            if (escolha < 1 || escolha > 4){
                System.out.println("Opção inválida");
            }

            System.out.print("Primeiro número: ");
            num1 = ler.nextInt();
            System.out.print("Segundo número: ");
            num2 = ler.nextInt();
    
            if (escolha == 1){
                opint = soma(num1, num2);
                System.out.printf("A soma entre %d e %d é igual a %d\n", num1, num2, opint);
            }else if (escolha == 2){
                opint = subtracao(num1, num2);
                System.out.printf("A subtação entre %d e %d é igual a %d\n", num1, num2, opint);
            }else if (escolha == 3){
                opdiv = divisao(num1, num2);
                System.out.printf("A divisão entre %d e %d é igual a %.2f\n", num1, num2, opdiv);        
            }else if (escolha == 4){
                opint = multiplicacao(num1, num2);
                System.out.printf("A multiplicação entre %d e %d é igual a %d\n", num1, num2, opint);
            }
        }while(escolha != 5);

    }

    public static int soma(int numero1, int numero2){
        return numero1 + numero2;
    }

    public static int subtracao(int numero1, int numero2){
        return numero1 - numero2;
    }

    public static float divisao(int numero1, int numero2){
        return numero1 / numero2;
    }

    public static int multiplicacao(int numero1, int numero2){
        return numero1 * numero2;
    }
}
