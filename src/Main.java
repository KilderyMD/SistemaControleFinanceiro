//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int opcao = 0;
        float saldo = 0;
        while (opcao != 5){
            System.out.println("===================================");
            System.out.println("Assistente Financeiro do Java");
            System.out.println("===================================");
            System.out.println("Menu de Opções: ");
            System.out.println("1 - Adicionar Receita");
            System.out.println("2 - Adicionar Despesa");
            System.out.println("3 - Ver Extrato");
            System.out.println("4 - Ver Saldo");
            System.out.println("5 - Sair");
            System.out.println("===================================");
            System.out.println("Selecione uma das opções acima: ");
            opcao = sc.nextInt();

            if (opcao >= 6) {
                System.out.println("Opção Inválida! Tente novamente...");
            }
            else if (opcao < 1) {
                System.out.println("Opção Inválida! Tente novamente...");
            }
            if (opcao == 1){
                float valorR;
                System.out.println("Digite o valor que você quer inserir: ");
                valorR = sc.nextFloat();
                saldo = saldo + valorR;
                System.out.printf("O valor de %.2f foi adicionado no saldo\n", valorR);
            }
            else if (opcao == 2){
                float valorD;
                System.out.println("Digite o valor que você quer inserir: ");
                valorD = sc.nextFloat();
                saldo = saldo - valorD;
            }
            else if (opcao == 3){
                System.out.println("Aqui fica o extrato");
            }
            else if (opcao == 4){
                System.out.println("O saldo atual é de: " + saldo);
            }
        }
        }

    }
