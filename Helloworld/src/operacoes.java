import java.util.Scanner;

public class operacoes {
    public static void main(String[] args) {
        var ler = new Scanner(System.in);

        int num1;
        int num2;
        int opint;
        int escolha;
        float opdiv;
        float base, exp;

        do{
            System.out.println("\nEscolha uma das opções abaixo (operações com 2 números)");
            System.out.println("1 - Somar;");
            System.out.println("2 - Subtrair;");
            System.out.println("3 - Dividir;");
            System.out.println("4 - Multiplicar;");
            System.out.println("5 - Potenciação;");
            System.out.println("6 - Sair;");
            escolha = ler.nextInt();

            if (escolha == 6){
                System.out.println("Encerrando o programa...\n");
                System.exit(0);
            }

            if (escolha < 1 || escolha > 5){
                System.out.println("Opção inválida");
            }
    
            if (escolha == 1){
                System.out.print("Primeiro número: ");
                num1 = ler.nextInt();
                System.out.print("Segundo número: ");
                num2 = ler.nextInt();

                opint = soma(num1, num2);
                System.out.printf("A soma entre %d e %d é igual a %d\n", num1, num2, opint);
            }else if (escolha == 2){
                System.out.print("Primeiro número: ");
                num1 = ler.nextInt();
                System.out.print("Segundo número: ");
                num2 = ler.nextInt();

                opint = subtracao(num1, num2);
                System.out.printf("A subtação entre %d e %d é igual a %d\n", num1, num2, opint);
            }else if (escolha == 3){
                System.out.print("Primeiro número: ");
                num1 = ler.nextInt();
                System.out.print("Segundo número: ");
                num2 = ler.nextInt();

                opdiv = divisao(num1, num2);
                System.out.printf("A divisão entre %d e %d é igual a %.2f\n", num1, num2, opdiv);        
            }else if (escolha == 4){
                System.out.print("Primeiro número: ");
                num1 = ler.nextInt();
                System.out.print("Segundo número: ");
                num2 = ler.nextInt();

                opint = multiplicacao(num1, num2);
                System.out.printf("A multiplicação entre %d e %d é igual a %d\n", num1, num2, opint);
            }else if (escolha == 5){
                System.out.println("Base: ");
                base = ler.nextFloat();
                System.out.println("Expoente: ");
                exp = ler.nextFloat();

                System.out.printf("O valor de %.2f elevado a %.2f é igual a %.2f\n", base, exp, potenciacao(base, exp));
            }
        }while(escolha != 6);

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

    public static float potenciacao(float base, float expoente){
        int i;
        float retorno = 1;

        for (i=0; i<expoente; i++){
            retorno = retorno * base;
        }
        return retorno;
    }
}
